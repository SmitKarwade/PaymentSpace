package com.example.spacego.payments;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import com.razorpay.Utils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RazorpayPaymentService {

    @Value("${razorpay.key.id}")
    private String razorpayKeyId;

    @Value("${razorpay.key.secret}")
    private String razorpayKeySecret;

    public ResponseEntity<OrderResponse> createOrder(double amount, String currency) throws Exception {
        RazorpayClient client = new RazorpayClient(razorpayKeyId, razorpayKeySecret);

        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", (int) (amount * 100)); // Convert to paise
        orderRequest.put("currency", currency);
        orderRequest.put("receipt", "txn_" + System.currentTimeMillis());
        orderRequest.put("payment_capture", 1); // Auto-capture payment

        Order order = client.orders.create(orderRequest);
        OrderResponse orderResponse = new OrderResponse(order.get("id").toString(), order.get("currency"), order.get("amount").toString(), order.get("receipt"));
        return ResponseEntity.ok(orderResponse);
    }

    public Map<String, String> verifyPayment(String paymentId, String orderId, String signature) throws Exception {
        try {
            String generatedSignature = orderId + "|" + paymentId;

            boolean isValidSignature = Utils.verifySignature(
                    new String(generatedSignature.getBytes()),
                    signature,
                    razorpayKeySecret
            );

            if (isValidSignature) {
                return Map.of("success", "true", "message", "Payment Verified Successfully");
            } else {
                return Map.of("success", "false", "message", "Invalid Payment Signature");
            }
        } catch (Exception e) {
            return Map.of("error", e.getMessage());
        }
    }
}


