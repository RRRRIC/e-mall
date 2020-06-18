package com.itheima.mall.web.controller;

import com.itheima.mall.common.Result;
import com.itheima.mall.pojo.CartItem;
import com.itheima.mall.pojo.Product;
import com.itheima.mall.service.ProductService;
import com.itheima.mall.service.impl.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cart/*")
public class CartServlet extends BaseServlet {

    private ProductService productService = new ProductServiceImpl();

    public void addCart(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        //获取到前台传过来的商品编号和数量
        int productId = Integer.parseInt(request.getParameter("productId"));  //获取商品编号
        int number = Integer.parseInt(request.getParameter("number"));  //获取到数量

        //创建一个购物车项对象(由商品+数量构成)
        Product product = productService.findById(productId);
        CartItem cartItem = new CartItem(product,number);

        //获取购物车
        HttpSession session = request.getSession();
        List<CartItem> cart=( List<CartItem>)session.getAttribute("cart");
        if(cart==null){     //用户是第一次购物，session中并没有存放物车.此时应该创建一个购物车
            cart=new ArrayList<>();
        }
        cart.add(cartItem);     //将购物车项 装进购物车中

        session.setAttribute("cart",cart);  //将购物车存入session，下次访问可以直接从session中获取购物车

        Result result = new Result();
        result.setFlag(true);
        result.setMsg("添加成功");

        writeJson(response,result);
    }


    public void viewCart(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{

        //获取Session
        HttpSession session = request.getSession();

        //从session中取出购物车对象（List）
        List<CartItem> cart = (List<CartItem>)session.getAttribute("cart");

        Result result = new Result();
        if(cart==null){

            result.setFlag(false);
            result.setMsg("购物车为空");
        }else{
            result.setFlag(true);
            result.setMsg("查询成功");
            result.setData(cart);
        }

        writeJson(response,result);
    }
}
