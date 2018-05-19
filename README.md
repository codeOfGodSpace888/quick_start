Spring Boot Demo
===========================
一些使用springboot学习的小例子.

****
	
|Author|北极的大企鹅|
|---|---
|博客园|http://www.cnblogs.com/liuyangfirst/


****
## 目录
* [从Hello World 开始写起](#横线)
* [pom的另一种搭建方式](#横线)
* [关键的三个注解](#横线)
* [注解替换](#横线)
* [ SpringApplication.run()方法](#横线)
* [ SpringApplication三种调用方法](#横线)


从Hello World 开始写起
------
```
    QuickStartApplication写法是一个实例
    Controller 写法是一个web实例
```

pom的另一种搭建方式
------
```xml

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.springboot</groupId>
    <artifactId>quick_start</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>

    <name>quick_start</name>
    <url>http://maven.apache.org</url>
    <description>Demo project for Spring Boot</description>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <!--不使用parent方式进行依赖,需要scope和type设置-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-dependencies</artifactId>
            <version>2.0.2.RELEASE</version>
            <scope>import</scope>
            <type>pom</type>
        </dependency>


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>


</project>


```
关键的三个注解
------
```
    @SpringBootApplication
           点开查看源码是由多个注解合成的注解，其中主要的注解有：
                  @SpringBootConfiguration
                  @EnableAutoConfiguration
                  @ComponentScan
                  
                  
           三个关键的注解：
           @ComponentScan 自动扫描加载进来的包，-----------可以扫描自动加载的bean
           @EnableAutoConfiguration 启动自动配置
           @SpringBootConfiguration 继承了@Configuration，所以可以使用@Configuration内容
           @Configuration是spring提供的注解，@SpringBootConfiguration是springboot提供的注解。效果几乎一样，用哪个看自己的习惯。
           
```
注解替换
------
```java

    //@SpringBootApplication
    
    @ComponentScan
    @EnableAutoConfiguration
    public class QuickStartApplication {
    
        @Bean
        public Runnable createRunnable() {
    
            return () -> {
                System.out.println("Spring Boot is Run");
            };
    
        }
    
        public static void main(String[] args) {
            ConfigurableApplicationContext applicationContext = SpringApplication.run(QuickStartApplication.class,args);
            applicationContext.getBean(Runnable.class).run();
            System.out.println(applicationContext.getBean(User.class));
        }
    }
    
```
SpringApplication.run()方法
------
```

  ConfigurableApplicationContext applicationContext = SpringApplication.run(QuickStartApplication.class,args);

   点开run()方法:
        public static ConfigurableApplicationContext run(Class<?> primarySource, String... args) {
               return run(new Class[]{primarySource}, args);
           }

     primarySource --------------------指的是从哪里开始运行,配置类,特殊注解的类

     用的多的就是标注了SpringApplication注解的类
     
     args  -----------------------java main方法的参数


```
--------------------------------
[csdn]:http://www.cnblogs.com/liuyangfirst/ "我的博客"
