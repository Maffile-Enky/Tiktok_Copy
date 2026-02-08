# 微服务架构创建初期问题
## 问题1：项目中pom.xml识别不了以下依赖：
```xml
 <dependency>
     <groupId>com.alibaba.cloud</groupId>
     <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
 </dependency>

```
## 解决方案：
在父pom的dependencyManagement添加dependencies,再在里面添加，模板如下：
```xml
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

```
## 问题2：创建多个微服务子项目时，无法载入依赖
我在创建单个子项目时运行成功，但随后创建多个子项目时提示没有导入spring框架等依赖，导致所有子项目（包括之前成功的）都无法运行。
## 解决方案：
在多次尝试后，发现子项目的
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
```
等依赖不能放在
```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId> </groupId>
            <artifactId>  </artifactId>
        </dependency>
    </dependencies>
</dependencyManagement>
```
里面，否则无法正常加载。