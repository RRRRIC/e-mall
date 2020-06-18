package com.itheima.mall.web.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.itheima.mall.common.Result;
import com.itheima.mall.pojo.Address;
import com.itheima.mall.pojo.Member;
import com.itheima.mall.utils.AlipayConfig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/pay/*")
public class PayServlet extends BaseServlet {


    public void createPayForm(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {

        //接收支付方式
        String checkway = request.getParameter("checkway");
        //接收订单编号
        String orderNumber = request.getParameter("orderNumber");
        //接收到支付金额
        String payMoney = request.getParameter("payMoney");



        if("alipay".equals(checkway)){
            if(orderNumber!=null){
                // 商户订单号，商户网站订单系统中唯一订单号，必填
                String out_trade_no = new String(orderNumber.getBytes("ISO-8859-1"),"UTF-8");
                // 订单名称，必填
                String subject = new String(orderNumber.getBytes("ISO-8859-1"),"UTF-8");
                // 付款金额，必填
                String total_amount=new String(payMoney.getBytes("ISO-8859-1"),"UTF-8");
                // 商品描述，可空
                String body = "";
                // 超时时间 可空
                String timeout_express="2m";
                // 销售产品码 必填
                String product_code="FAST_INSTANT_TRADE_PAY";
                /**********************/
                // SDK 公共请求类，包含公共请求参数，以及封装了签名与验签，开发者无需关注签名与验签
                //调用RSA签名方式
                AlipayClient client = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, AlipayConfig.FORMAT, AlipayConfig.charset, AlipayConfig.alipay_public_key,AlipayConfig.sign_type);
                AlipayTradePagePayRequest alipay_request=new AlipayTradePagePayRequest();

                // 封装请求支付信息(手机端)

             AlipayTradePagePayModel model = new AlipayTradePagePayModel();
                model.setOutTradeNo(out_trade_no);
                model.setSubject(subject);
                model.setTotalAmount(total_amount);
                model.setBody(body);
                model.setTimeoutExpress(timeout_express);
                model.setProductCode(product_code);
                alipay_request.setBizModel(model);


                // 设置异步通知地址
                alipay_request.setNotifyUrl(AlipayConfig.notify_url);
                // 设置同步地址
                alipay_request.setReturnUrl(AlipayConfig.return_url);

                // form表单生产
                String form = "";
                try {
                    // 调用SDK生成表单
                    form = client.pageExecute(alipay_request).getBody();
                    response.setContentType("text/html;charset=" + AlipayConfig.charset);
                    response.getWriter().write(form);//直接将完整的表单html输出到页面
                    System.out.println(form);
                    response.getWriter().flush();
                    response.getWriter().close();
                } catch (AlipayApiException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
        else if("weixin".equals(checkway)){

        }



    }
}
