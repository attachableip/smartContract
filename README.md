# 库说明
关于WeBase实现 和后端SpringBoot代码框架的整改


# 文件夹说明
```
WeBASE-master/quick-start : Webase SpringBoot框架以及demo
copyright.txt: 版权局群组内solidity智能合约之一
```

## WeBASE-master/quick-start

```
项目目录：
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
封装FISCO BCOS中的方法，方便Web/App/小程序中调用
- 封装FISCO BCOS中智能合约方法、合约地址信息等，利用SpringBoot对外实现调用的API，方便后期扩展

## copyright.txt
说明：让用户在无感知情况下实现验证，实现demo
- 实现版权局限定ID的方法demo

# 版权说明
all copyright © IP共识
