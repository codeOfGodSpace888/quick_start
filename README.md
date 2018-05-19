Spring Boot 配置文件
===========================
一些使用springboot学习的小例子.

****
	
|Author|北极的大企鹅|
|---|---
|博客园|http://www.cnblogs.com/liuyangfirst/


****
## 目录
* [读取配置文件的方式](#横线)
* [常量引用和变量引用获取](#横线)
* [默认值获取方式](#横线)
* [外部文件获取方式](#横线)
* [注解获取方式](#横线)
* [编译器修改方式](#横线)


读取配置文件的方式
------
```
      // 读取配置文档获取本地ip地址
            System.out.println("*********第一种本地IP地址是:" + applicationContext.getEnvironment().getProperty("local.ip"));
    
            // 第二种注入获取方式
            applicationContext.getBean(UserConfig.class).show();
    
            // 第三种方式value注解获取
            applicationContext.getBean(UserPort.class).show();
    
            // 第四种整数类型获取
            applicationContext.getBean(UserTypePort.class).show();
    
            //第五种转化整数类型获取
            applicationContext.getBean(UserTypePort.class).show2();
```

常量引用和变量引用获取
------
```

 //常量引用和变量引用获取
        applicationContext.getBean(UserVariable.class).show();

```
默认值获取方式
------
```
   //默认值获取方式
          applicationContext.getBean(UserTomcatPortDefault.class).show();
  
          //默认值第二种获取方式
          applicationContext.getBean(UserTomcatPortDefault2.class).show();
           
```
外部文件获取方式
------
```

     //JDBC 获取方式
           applicationContext.getBean(JdbcConfig.class).show();
   
           //外部文件获取方式
           applicationContext.getBean(JdbcOutConfig.class).show();
   
           //外部文件2获取方式
           applicationContext.getBean(JdbcOutTWOConfig.class).show();
    
```
注解获取方式
------
```
  // 另一个注解获取方式
        applicationContext.getBean(DateSourceConfig.class).show();
        // 另一个注解获取方式,配置路径
        applicationContext.getBean(DateSourceTWOConfig.class).show();


```

编译器修改方式
------
|博客园|http://www.cnblogs.com/liuyangfirst/p/9062368.html


--------------------------------
[csdn]:http://www.cnblogs.com/liuyangfirst/ "我的博客"
