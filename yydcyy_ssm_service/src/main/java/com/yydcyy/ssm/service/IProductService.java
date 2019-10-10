package com.yydcyy.ssm.service;

import com.yydcyy.ssm.domain.Product;

import java.util.List;

/**
 * @author YYDCYY
 * @create 2019-10-09
 */
public interface IProductService {
    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
