package com.code.dao.paymentbank;

import com.code.bean.pojo.PaymentBank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface PaymentBankMapper {

    List<PaymentBank> getPaymentBankList()throws Exception;

}