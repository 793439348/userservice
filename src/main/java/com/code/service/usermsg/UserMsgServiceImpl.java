package com.code.service.usermsg;

import com.code.bean.vo.outobj.UserMsgVO;
import com.code.dao.usermsg.UserMsgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMsgServiceImpl implements UserMsgService {
    @Autowired
    private UserMsgMapper userMsgMapper;

    @Override
    public List<UserMsgVO> getUserMsgList(Integer merchantId, Integer userId, Integer page, Integer pageSize) throws Exception {
        List<UserMsgVO> userMsgList = userMsgMapper.getUserMsgList(merchantId,userId, page, pageSize);
        return userMsgList;
    }
}
