package com.bihai.providepayment.servicedegradation;

import com.bihai.providepayment.PaymentController;
import org.springframework.stereotype.Component;

/**
 * @author bihai
 * @create 2021-05-19 16:08
 */
@Component
public class PaymentControllerImpl implements PaymentController {
    @Override
    public String getPaymentInfo(int id) {
        return "getPaymentInfo降级方法, 当前线程: " + Thread.currentThread().getName();
    }

    @Override
    public String getPaymentInfoTimeOut(int id) {
        return "getPaymentInfoTimeOut降级方法, 当前线程: " + Thread.currentThread().getName();
    }
}
