package com.bihai.moduleCalls.providepayment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author bihai
 * @create 2021-05-16 16:11
 */
@Resource
@FeignClient(value = "PROVIDEREUREKACLIENT-PAYMENT")
public interface PaymentController {

    @GetMapping("/payment/port")
    String getServicePort();

    @GetMapping("/payment/timeoutPort")
    String getServicePortTimeOut();
}
