package com.itheima.mall.service.impl;

import com.itheima.mall.dao.CategoryDao;
import com.itheima.mall.dao.impl.CategoryDaoImpl;
import com.itheima.mall.pojo.Category;
import com.itheima.mall.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    CategoryDao categoryDao =  new CategoryDaoImpl();

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }
}
