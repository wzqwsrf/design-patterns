### 模板方法模式

- **概念**
  
  模板方法模式在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 
- **类图**

  ![类图在这里](https://github.com/wzqwsrf/design-patterns/blob/master/pictures/template.png)

- **测试类**

  - [BeverageTestDrive](https://github.com/wzqwsrf/design-patterns/blob/master/src/template/BeverageTestDrive.java)
  - [BeverageTestDriveWithHook](https://github.com/wzqwsrf/design-patterns/blob/master/src/template/BeverageTestDriveWithHook.java)