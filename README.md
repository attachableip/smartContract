# IP确权与版权交易（IP共识）

# 库说明

```
本项目在WEBASE提供的基础设施上完成了一个FISCO-BCOS上的区块链应用。
WeBASE将区块链应用开发标准化，按照部署、配置、开发智能合约、开发应用层、在线运维管理五个步骤，即可完成一个区块链应用的开发.
多个子系统之间采用微服务进行部署，低耦合，可定制。

```


# 文件夹说明
```
WeBASE-master/quick-start :  区块链应用Application Layer
copyright.txt:  版权局群组内solidity智能合约之一
```

## WeBASE-master/quick-start
```
基于SpringBoot，SpringMVC框架，采用Gradle作为依赖管理和项目自动化构建工具。

封装了FISCO BCOS中API，可以查看、管理节点，处理、审计交易，进行运维管理等等，方便Web/App/小程序中调用。
```
```
项目目录如下：
|── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── logs
│   ├── helloWorld-error.log
│   └── helloWorld.log
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── webank
    │   │           └── webase
    │   │               ├── Application.java
    │   │               ├── controller
    │   │               │   ├── DemoController.java
    │   │               │   ├── LoginController.java
    │   │               │   └── TransController.java
    │   │               ├── dao
    │   │               ├── domain
    │   │               │   ├── Transcation.java
    │   │               │   └── User.java
    │   │               ├── result
    │   │               │   ├── CodeMsg.java
    │   │               │   └── Result.java
    │   │               ├── service
    │   │               │   ├── LoginService.java
    │   │               │   └── TransactionService.java
    │   │               ├── transaction
    │   │               │   ├── TransactionParam.java
    │   │               │   └── TransactionService.java
    │   │               └── vo
    │   │                   ├── LoginVo.java
    │   │                   └── SendTranscationVo.java
    │   └── resources
    │       ├── application.yml
    │       └── log4j2.xml
    └── test
        └── java
            └── com
                └── webank
                    └── webase
                        └── helloworld
                            └── WebaseHelloworldApplicationTests.java
```                            


## copyright.txt
```   
说明：让用户在无感知情况下实现验证，实现demo
- 实现版权局限定ID的方法demo
```   
# 版权说明
all copyright © IP共识
