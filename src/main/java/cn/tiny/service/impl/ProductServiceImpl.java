package cn.tiny.service.impl;

import cn.tiny.aspect.CheckRoot;
import cn.tiny.entity.Product;
import cn.tiny.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * @author tiny
 * date 2018/12/29 10:27
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public void insert(Product product) {
        System.out.println("ProductServiceImpl.insert");
    }

    @CheckRoot
    @Override
    public void delete(Long id) {
        System.out.println("ProductServiceImpl.delete");
    }

    @CheckRoot
    @Override
    public void findById(Long id) {
        System.out.println("log from ProductServiceImpl findById");
    }

    @CheckRoot
    @Override
    public void findAll() {
        System.out.println("log from ProductServiceImpl findByAll");
    }


}
