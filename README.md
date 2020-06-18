# e-mall
a demo shopping website offering user registry, login, viewing products &amp; payment with pure original servlet

## What does e-mall do

一个纯java servlet编写的购物网站，没有使用任何框架。对于刚接触java web的编程人员是一次很好的demo 项目。

## 启动e-mall

必须软件

- maven 包管理工具
- mysql 5.7 +
- redis 

执行步骤

1. 在mysql建立一个mall 的database

2. 执行sql文件夹下的sql语句
3. 修改src\main\resources下的配置文件
4. mvn install
5. mvn tomcat7:run

打开浏览器输入 localhost:8090 即可访问



## 项目结构说明



###########目录结构描述
├── Readme.md                   // help
├── src\main\java\com\itheima\mall                      // 配置
│   ├── common          //公用组件
│   ├── dao                
│   ├── pojo         
│   ├── service                
│   ├── utils             // 工具类
│   ├── web         
├── src\main
|  ├──resources    //配置文件

|  ├──webapp    //前端文件



数据库设计如下

![ER�V](README.assets\ER图.png)