package com.code.service.userwithdraw;

import com.code.bean.pojo.*;
import com.code.bean.vo.inputobj.WithdrawVO;
import com.code.dao.user.UserMapper;
import com.code.dao.usercard.UserCardMapper;
import com.code.util.MD5;
import com.code.util.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserWithdrawServiceImpl implements UserWithdrawService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCardMapper userCardMapper;


    @Override
    public void withdraw(WithdrawVO withdrawVO) throws Exception {
        User user = userMapper.getUser(withdrawVO.getMerchantId(), withdrawVO.getUserId());
        UserCard userCard = userCardMapper.getUserCardById(withdrawVO.getBankCardId());
        /*验证用户提现密码*/
        if (!user.getWithdrawPassword().equals(MD5.upper(MD5.md5(withdrawVO.getWithdrawPwd()))))
            throw new Exception("提款失败");
        /*验证用户是否允许提款*/
        if (user.getAllowWithdraw() != 1) {
            throw new Exception("提款失败");
        }
        /*验证银行卡状态是否正常*/
        if (userCard.getStatus() != 0) {
            throw new Exception("提款失败");
        }
        /*当前时间*/
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        /*生成唯一单号*/
        String billno = MD5.md5(new Long(new SnowFlake(2, 3).nextId()).toString());
        /*入库记录*/
        UserBill userBill = new UserBill.Builder().setBillno(billno)
                .setUserId(withdrawVO.getUserId())
                .setAccount(1)
                .setType(2)
                .setMoney(withdrawVO.getAmount())
                .setBeforeMoney(user.getTotalMoney())
                .setAfterMoney(user.getTotalMoney().subtract(withdrawVO.getAmount()))
                .setTime(time)
                .setRemarks("主账户取现：" + withdrawVO.getAmount())
                .setMerchantId(withdrawVO.getMerchantId())
                .build();

        UserMsg userMsg = new UserMsg.Bulider().setType(2)
                .setTime(time)
                .setTitle("withdraw")
                .setContent("withdraw" + withdrawVO.getAmount())
                .setExtra("{\"amount\":" + withdrawVO.getAmount() + ",\"state\":0}")
                .setMerchantId(withdrawVO.getMerchantId())
                .setUserId(withdrawVO.getUserId())
                .build();

        UserWithdraw userWithdraw = new UserWithdraw();


    }
}
