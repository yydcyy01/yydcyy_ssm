package com.yydcyy.ssm.service.impl;

import com.yydcyy.ssm.dao.IProductDao;
import com.yydcyy.ssm.domain.Product;
import com.yydcyy.ssm.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-10-09
 */
@Service
@Transactional
public class ProductServiceImpl implements IProductService{

    @Autowired
    private IProductDao productDao;

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public List<Product> findAll() throws Exception{
        return productDao.findAll();
    }
}