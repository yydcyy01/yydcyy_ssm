package com.yydcyy.ssm.dao;

import com.yydcyy.ssm.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author YYDCYY
 * @create 2019-10-14
 */
public interface IMermberDao {
    @Select("select * from mumber where id= #{id}")
    public Member findById(String id);
}
