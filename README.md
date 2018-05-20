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
* [yml获取方式](#横线)
* [EnvironmentPostProcessor获取方式](#横线)
* [ReadDevOrTestApplication读取多个配置文件](#横线)
* [ReadDevOrTest2Application控制生效](#横线)


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


yml获取方式
------
```java

   @Component
   public class YmlConfig {
   
   
       @Autowired
       private Environment environment;
   
   
       public void show(){
   
           System.out.println("################yml获取方式:"+environment.getProperty("age"));
       }
   }


```

数组和集合获取方式
------
```
   private List<String> hostList = new ArrayList<>();


    private String[] ports;


    public List<String> getHostList() {
        return hostList;
    }

    public void setHostList(List<String> hostList) {
        this.hostList = hostList;
    }

    public String[] getPorts() {
        return ports;
    }

    public void setPorts(String[] ports) {
        this.ports = ports;
    }

```

EnvironmentPostProcessor获取方式
------
```
   @Override
       public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment,SpringApplication springApplication) {
   
           try(InputStream inputStream = new FileInputStream("application.properties")){
   
               Properties properties = new Properties();
   
               properties.load(inputStream);
   
               PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("my",properties);
   
               configurableEnvironment.getPropertySources().addLast(propertiesPropertySource);
   
   
           }catch (IOException e){
               e.printStackTrace();
           }
   
       }
```
ReadDevOrTestApplication读取多个配置文件
------
```
   public static void main(String[] args) {
  
          SpringApplication springApplication = new SpringApplication(ReadDevOrTestApplication.class);
  
          // 开发文档读取
         springApplication.setAdditionalProfiles("dev");
  
          //指定多个
          springApplication.setAdditionalProfiles("dev","test");
  
          ConfigurableApplicationContext applicationContext = springApplication.run(args);
  
          // 读取其他配置文档
          System.out.println("*********开发的配置文档是:" + applicationContext.getEnvironment().getProperty("jdbc.url"));
  
          // 读取其他配置文档
          System.out.println("*********开发的配置文档是:" + applicationContext.getEnvironment().getProperty("jdbc.name"));
  
          applicationContext.close();
      }
```

ReadDevOrTest2Application控制生效
------
```
  与SingleMyConfig一起使用
  test下默认的不激活,但是读取文档生效
  SingleMyConfig2全局生效
```

--------------------------------
[csdn]:http://www.cnblogs.com/liuyangfirst/ "我的博客"
