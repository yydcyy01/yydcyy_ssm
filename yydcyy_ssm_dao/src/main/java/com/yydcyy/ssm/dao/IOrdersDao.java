package com.yydcyy.ssm.dao;

import com.yydcyy.ssm.domain.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-10-10
 */
public interface IOrdersDao {

    @Select("select * from orders")
    public List<Orders> findAll();

    //多表操作
    public Orders findById(String ordersId);
}
