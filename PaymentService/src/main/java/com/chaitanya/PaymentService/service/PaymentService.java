package com.chaitanya.PaymentService.service;

import com.chaitanya.PaymentService.model.PaymentRequest;
import com.chaitanya.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
