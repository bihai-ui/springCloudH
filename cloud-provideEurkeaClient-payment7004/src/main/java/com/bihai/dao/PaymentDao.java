package com.bihai.dao;

import com.bihai.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName: PaymentDao
 * @author: bihai-ui
 * @create: 2021-04-22 23:35
 * @Description: TODO
 */

@Mapper
public interface PaymentDao {

    Payment getById(Long id);
    int insert(Payment payment);
}
