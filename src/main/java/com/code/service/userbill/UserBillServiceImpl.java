package com.code.service.userbill;

import com.code.bean.vo.inputobj.UserAcclogVO;
import com.code.bean.vo.outobj.UserBillVO;
import com.code.dao.userbill.UserBillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserBillServiceImpl implements UserBillService {
    @Autowired
    private UserBillMapper userBillMapper;

    @Override
    public List<UserBillVO> getUserAcclogList(UserAcclogVO userAcclog) throws Exception {
        List<UserBillVO> userBillList = userBillMapper.getUserBillList(userAcclog);
        return userBillList;
    }
}
