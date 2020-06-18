package com.itheima.mall.service.impl;

import com.itheima.mall.common.PageBean;
import com.itheima.mall.dao.ProductDao;
import com.itheima.mall.dao.impl.ProductDaoImpl;
import com.itheima.mall.pojo.Product;
import com.itheima.mall.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDao productDao = new ProductDaoImpl();

    @Override
    public List<Product> findByCateId(int cateid) {
        return productDao.findByCateId(cateid);
    }


    @Override
    public PageBean<Product> findPage(int cateid, int currentPage, int pageSize) {


        //获取当前分类的总记录数
        long totalCount = productDao.findTotalCount(cateid);
        //获取总页数
        long totalPage = totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;


        if(currentPage<=0){    //如果用户传过来的页数小于了1,则让当前页变为1
            currentPage=1;
        }

        if(currentPage>totalPage){    //如果用户传过来的页数大于了总页数，则让当前页变为总页数
            //currentPage=Integer.parseInt(totalPage+"");
            currentPage=(int)totalPage;
        }



        //获取一个存有分页商品的集合
        //将当前页转换成一个起始位置
        int start = (currentPage-1)*pageSize;
        List<Product> productList = productDao.findByPage(cateid, start, pageSize);

        //构建一个PageBean对象
        PageBean<Product> pageBean =new PageBean<>();
        pageBean.setList(productList);
        pageBean.setCurrentPage(currentPage);
        pageBean.setPageSize(pageSize);
        pageBean.setTotalCount(totalCount);
        pageBean.setTotalPage(totalPage);

        return pageBean;
    }


    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }
}
