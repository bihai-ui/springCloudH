package com.bihai.service;

import com.bihai.entities.Payment;

/**
 * @ClassName: PaymentService
 * @author: bihai-ui
 * @create: 2021-04-22 23:46
 * @Description: TODO
 */


public interface PaymentService {

    Payment getById(Long id);

    boolean insert(Payment payment);
}
