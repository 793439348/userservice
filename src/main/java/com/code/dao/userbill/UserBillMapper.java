package com.code.dao.userbill;

import com.code.bean.vo.inputobj.UserAcclogVO;
import com.code.bean.vo.outobj.UserBillVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 账单明细
 * </p>
 * @author: zeng
 * @since: 2020-03-18
 */
@Mapper
public interface UserBillMapper {
    /*分页查询账单明细*/
    List<UserBillVO> getUserBillList(UserAcclogVO userAcclog)throws Exception;

}