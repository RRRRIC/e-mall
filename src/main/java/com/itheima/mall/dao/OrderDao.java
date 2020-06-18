package com.itheima.mall.dao;

import com.itheima.mall.pojo.Orders;

public interface OrderDao {

    //添加订单时需要将订单的id返回，到时添加订单项时需要用到这个id
    public int add(Orders orders);
}
