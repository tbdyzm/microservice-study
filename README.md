微服务学习记录
=
# 启动
code下面一共包含5个服务，Eureka命名服务器、Spring Cloud Config Server、Zuul API Gateway Server、微服务1和2
启动顺序为Eureka、Config Server、Service1、Service2和Zuul API Gateway Server。(Config Server和Zuul API Gateway Server可能需要一段时间才完成能启动)
若要实现多个项目的配置文件的自动刷新，需要安装RabbitMQ；若要实现Zipkin的分布式跟踪功能，也需要安装RabbitMQ。Zipkin启动顺序任意。
