package com.code.service.userbill;

import com.code.bean.vo.inputobj.UserAcclogVO;
import com.code.bean.vo.outobj.UserBillVO;

import java.util.List;

public interface UserBillService {
    /*帐变明细*/
    List<UserBillVO> getUserAcclogList(UserAcclogVO userAcclog) throws Exception;
}
