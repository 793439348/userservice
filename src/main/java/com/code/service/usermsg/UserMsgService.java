package com.code.service.usermsg;

import com.code.bean.vo.outobj.UserMsgVO;

import java.util.List;

public interface UserMsgService {
    /*个人消息*/
    List<UserMsgVO> getUserMsgList(Integer merchantId, Integer userId, Integer page, Integer pageSize) throws Exception;
}
