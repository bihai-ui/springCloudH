package com.bihai.service.impl;

import com.bihai.dao.PaymentDao;
import com.bihai.entities.Payment;
import com.bihai.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentServiceImpl
 * @author: bihai-ui
 * @create: 2021-04-22 23:46
 * @Description: TODO
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;


    @Override
    public Payment getById(Long id) {
        Payment payment = paymentDao.getById(id);
        return payment;
    }

    @Override
    public boolean insert(Payment payment) {
        int flag = paymentDao.insert(payment);
        if(flag == 1){
            return true;
        }
        else{
            return false;
        }
    }
}