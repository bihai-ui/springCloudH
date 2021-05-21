package com.bihai.controller;

import com.bihai.entities.CommonResult;
import com.bihai.entities.Payment;
import com.bihai.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: PaymentController
 * @author: bihai-ui
 * @create: 2021-04-22 23:54
 * @Description: TODO
 */

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/{id}")
    public  CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getById(id);
        CommonResult<Payment> result;
        if(payment != null){
            result = new CommonResult<Payment>(200,"获取成功",payment);
        }
        else{
            result = new CommonResult<Payment>(200,"获取失败");
        }
        return result;
    }

    @PostMapping(value = "/payment")
    public CommonResult<Payment> addPayment(@RequestBody Payment payment){
        boolean flag = paymentService.insert(payment);
        CommonResult<Payment> result;
        if (flag){
            result = new CommonResult<Payment>(200,"插入成功",payment);
        }
        else{
            result = new CommonResult<Payment>(300,"插入失败");
        }
        return result;
    }

    @GetMapping("/payment/port")
    public  String getServicePort(){
        return "payment:"+port;
    }


    @GetMapping("/payment/timeoutPort")
    public String getServicePortTimeOut(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "payment:"+port;
    }

}