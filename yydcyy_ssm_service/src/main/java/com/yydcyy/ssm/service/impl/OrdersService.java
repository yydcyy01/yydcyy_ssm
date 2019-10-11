package com.yydcyy.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.yydcyy.ssm.dao.IOrdersDao;
import com.yydcyy.ssm.domain.Orders;
import com.yydcyy.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-10-10
 */
@Service
@Transactional
public class OrdersService implements IOrdersService {
    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        System.out.println("OrdersService -- findById ok");
        return ordersDao.findById(ordersId);
    }
}
