package com.yydcyy.ssm.service;

/**
 * @author YYDCYY
 * @create 2019-10-10
 */
import com.yydcyy.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {


    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
