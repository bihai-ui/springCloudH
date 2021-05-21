package com.bihai.providepayment;

import com.bihai.providepayment.servicedegradation.PaymentControllerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

/**
 * @author bihai
 * @create 2021-05-16 16:11
 */
@Resource
@FeignClient(value = "CLOUD-HYSTRIX-PAYMENT7013", fallback = PaymentControllerImpl.class)
public interface PaymentController {

    @GetMapping(value = "payment/hystrix/ok/{id}")
    String getPaymentInfo(@PathVariable("id") int id);

    @GetMapping(value = "payment/hystrix/timeout/{id}")
    String getPaymentInfoTimeOut(@PathVariable("id") int id);
}
