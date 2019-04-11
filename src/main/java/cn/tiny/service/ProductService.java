package cn.tiny.service;

import cn.tiny.entity.Product;

/**
 * @author tiny
 * date 2018/12/29 10:24
 */
public interface ProductService {
    void insert(Product product);
    void delete(Long id);
    void  findById(Long id);
    void findAll();
}
