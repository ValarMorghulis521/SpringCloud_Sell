#指定基础镜像，在其上进行定制
FROM hub.c.163.com/library/java:8-alpine

#维护者信息
MAINTAINER sunchenming <scm_5@outlook.com>

#添加target/*.jar 到容器里
ADD target/*.jar app.jar

#声明运行时容器提供服务端口，这只是一个声明，在运行时并不会因为这个声明应用就会开启这个端口的服务
EXPOSE 8081

#指定容器启动程序及参数   <ENTRYPOINT> "<CMD>"
ENTRYPOINT ["java","-jar","app.jar"]
