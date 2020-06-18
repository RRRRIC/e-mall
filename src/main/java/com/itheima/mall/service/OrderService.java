package com.itheima.mall.service;

import com.itheima.mall.pojo.Orders;

public interface OrderService {

    //添加订单的同时，添加订单项
    public void add(Orders order,String[] ids,String[] amounts);
}
