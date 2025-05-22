package com.example.spacego.payments;

public class OrderResponse {
    private String orderId;
    private String currency;
    private String amount;

    private String txnId;

    public OrderResponse(String orderId, String currency, String amount, String txnId) {
        this.orderId = orderId;
        this.currency = currency;
        this.amount = amount;
        this.txnId = txnId;
    }

    public OrderResponse() {
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAmount() {
        return amount;
    }

    public String getTxnId() {
        return txnId;
    }
}
