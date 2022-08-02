## whole(+) 主要的亮点。add: gateway, feign
两年Java后端开发经验，精通使用Java、J2EE，熟练使用Springcloud、Springboot、MyBatis、JPA、dubbo等微服务框架技术，熟练使用Oracle、MySql等主流数据库，精通SQL并具备系统调优能力，熟练Linux操作指令
熟悉JVM原理，包括内存模型、垃圾回收机制。熟练掌握SQL语句的编写，了解索引，事务、隔离级别的原理。了解多线程模型、持久化方式、数据同步机制。 能熟练使用Spring、MyBatis等开发框架
熟悉Java语言，可熟练运用SpringBoot、SpringMVC、Spring、MyBatis等主流框架进行服务端开发。熟悉SpringCloud分布技术、Ribbon负载均衡。 熟悉掌握JDK底层知识、常用算法和数据结构，熟悉网络编程、多线程编程技术
拥有扎实的Java基础，可以熟练使用Struts2、Spring、SpringBoot、SpringMVC、Mybatis、Hibernate等开源框架,精通数据库逻辑设计、物理设计、查询优化、整体性能优化，熟练掌握Mysql、Redis、MongoDB，熟练掌握SOA分布式架构下的系统程序开发
三年java开发经验，精通java、Sping开发语言，熟悉SpringMVC、SpringBoot、Mybatis框架，熟悉SVN、Git版本管理工具，熟悉mysql、redis数据库，熟悉Vue,ElementUI等前端技术，了解多线程
## key(-) 主要的技能。
- springmvc,springboot:熟练使用spring系开发平台
- Mybatis: 熟悉使用 orm框架:mybatis
熟悉mybatis-generate插件，定制过一些mybatis-generate插件 熟练使用 mybatis开发
- Redis 熟悉redis，熟悉redis客户应用，了解jedis客户端工作流程。熟练使用spring-data-redis客户端
- Mq 了解消息队列，了解spring集成amqp 了解高性能消息队列中间件rabbitmq
- 了解安全框架 spring-security, 熟悉 jwt开源库：jjwt，auth0
- 了解binlog客户端 (maxwell)//
- 
了解websocket 为低负载高实时特性的简易聊天应用编写过后端服务。
- 了解http客户端：resTemplate，spring-cloud-openfeign
- 了解spring cloud gateway
- 了解Docker，了解docker 署 java应用

## 项目部分

### 天天购
项目介绍:商城应用的商品展示模块，主要提供各类商品数据
#### 1
- mybatis mybatisplus 多数据源（参考 mapperscan 源码） 
- aop  熟悉常用aop开发。 通过spring aop 记录操作日志
- knife4j 生成 接口文档
- 熟练运用Java集合封装vo对象
- 熟练使用第三方通用util类库 如 org.apache.commons 等
- 为轻负载高实时特性的简易聊天应用通过编写过后端服务，该服务基于springboot集成的websocket模块。
#### 2
完成基本的后端开发。
- 设计接口文档，按照开发文档为前端提供展示数据（vo对象）。
简单的vo对象直接通过mybatis生成dto对象，再组合vo对象。较复杂的数据通过集合及Java stream进行处理。
- 开发操作日志。 通过Spring aop记录操作日志。对spring Aop 有一定了解。
- 开发基于jwt的无状态登录模块。


### 今日消息
在移动互联⽹⾼度发达的今天，⼤家更加习惯于通过⼿机查看新闻。当前，⼈们的⽣活节奏越来越快，许多
⼈只能利⽤碎⽚时间来获取信息。因此⾮常需要移动资讯客⼾端提供⼈们个性化的资讯。在此项⽬中，通过搜
集海量资讯，再由系统计算分类，分析⽤⼾的兴趣然后进⾏个性化推送，从⽽满⾜⽤⼾的需求。
项目介绍: 消息资讯
该项目是公司主业务的扩展业务，主要用于增加用户粘性，建立社区，提供广告入口。
#### 1
- 使用redis为高频数据提供缓存，通过redisson的分布式锁实现分布式索。通过redis提供的geo实现完成基本用户位置数据分析
- 通过spring提供的http客户端restTemplate调用简单的微服务接口。通过配置spring-cloud-openfeign调用微服务接口。
- 
#### 2
主要负责.基于nosql及maxwell 提供实时报表。 原方案通过直接查询多个数据库，向业务部门提供当天用户的行为
- 基于nosql及maxwell 提供实时报表。 原方案通过直接查询多个数据库，向业务部门提供当天用户的行为
- 基于 springSecurity 开发报表模块登录验证部分。 Outh2 的resource server 模块


