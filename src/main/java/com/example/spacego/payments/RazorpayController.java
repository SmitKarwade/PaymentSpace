package com.example.spacego.payments;

import com.razorpay.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/payment")
public class RazorpayController {

    @Autowired
    private RazorpayPaymentService razorpayPaymentService;


    @PostMapping("/create-order")
    public ResponseEntity<OrderResponse> createOrder(@RequestParam double amount) throws Exception {
        try {
            return razorpayPaymentService.createOrder(amount, "INR");
        } catch (Exception e) {
            return ResponseEntity.status(500).body(new OrderResponse(null, "INR", "0.0", null));

        }
    }

    @PostMapping("/verify-payment")
    public ResponseEntity<Map<String, String>> verifyPayment(
            @RequestParam String paymentId,
            @RequestParam String orderId,
            @RequestParam String signature) throws Exception {
        try {
            return ResponseEntity.ok(razorpayPaymentService.verifyPayment(paymentId, orderId, signature));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(Map.of("error", e.getMessage()));
        }
    }
}
