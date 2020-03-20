package com.code.service;

import com.code.bean.pojo.*;
import com.code.bean.vo.HeaderVO;
import com.code.bean.vo.inputobj.AddBankCardVO;
import com.code.bean.vo.inputobj.WithdrawVO;
import com.code.bean.vo.outobj.UserBankCardVO;
import com.code.dao.user.UserMapper;
import com.code.dao.usercard.UserCardMapper;
import com.code.util.MD5;
import com.code.util.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author: zeng
 * @since: 2020-03-19
 */
@Service
public class BankCardServiceImpl implements BankCardService {

    @Autowired
    private UserCardMapper userCardMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public void withdraw(WithdrawVO withdrawVO) throws Exception {
        User user = userMapper.getUser(withdrawVO.getHeaderVO());
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
                .setUserId(withdrawVO.getHeaderVO().getUserId())
                .setAccount(1)
                .setType(2)
                .setMoney(withdrawVO.getAmount())
                .setBeforeMoney(user.getTotalMoney())
                .setAfterMoney(user.getTotalMoney().subtract(withdrawVO.getAmount()))
                .setTime(time)
                .setRemarks("主账户取现："+withdrawVO.getAmount())
                .setMerchantId(withdrawVO.getHeaderVO().getMerchantId())
                .build();

        UserMsg userMsg = new UserMsg.Bulider().setType(2)
                .setTime(time)
                .setTitle("withdraw")
                .setContent("withdraw" + withdrawVO.getAmount())
                .setExtra("{\"amount\":" + withdrawVO.getAmount() + ",\"state\":0}")
                .setMerchantId(withdrawVO.getHeaderVO().getMerchantId())
                .setUserId(withdrawVO.getHeaderVO().getUserId())
                .build();

        UserWithdraw userWithdraw = new UserWithdraw();


    }

    @Override
    public void addBankCard(AddBankCardVO addBankCardVO) throws Exception {
        /*判断是否能添加银行卡，注：每个用户最多只能添加5张卡号*/
        List<UserBankCardVO> userCardList = userCardMapper.getUserCardList(addBankCardVO.getHeaderVO());
        if (userCardList != null && userCardList.size() >= 5) {
            throw new Exception("添加银行卡失败，银行卡持有数量已最大");
        }
        userCardMapper.addBankCard(addBankCardVO);
    }


}
