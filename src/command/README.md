### 命令模式

- **概念**
  
  命令模式将请求封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 
- **类图**
  
  ![类图在这里](https://github.com/wzqwsrf/design-patterns/blob/master/pictures/command.png)

- **测试类**

  - [RemoteControlTest](https://github.com/wzqwsrf/design-patterns/blob/master/src/command/RemoteControlTest.java)
  - [RemoteLoader](https://github.com/wzqwsrf/design-patterns/blob/master/src/command/RemoteLoader.java)
  - [RemoteLoaderCeilingFan](https://github.com/wzqwsrf/design-patterns/blob/master/src/command/RemoteLoaderCeilingFan.java)