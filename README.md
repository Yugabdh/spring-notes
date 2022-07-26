# What is Spring?
- Application Development framework for Enterprise Java Applications 
- Spring framework is Open source 
- Spring Framework provides good programming practices by providing a POJO-based programming model for J2EE development

# Features of Spring
**Lightweight**

**Inversion of Control(IoC)**

Inversion of control is inverting the flow of control, that is, objects do not create objects that they depend upon. Instead, they get the object they need from an outside source.

For example, suppose we are writing a database related function, in a traditional approach, this function creates a database object.

```
class Example {
    public void test() {
        ...
        MySqlDatabase database = new MySqlDatabase();
        ...
    }
}
```
while if we are using IoC approach, we will use abstraction. 

> Rely on Abstraction rather than concrete implementation

```
// Some configuration 
class Example {

    // Database is abstract class 
    // instance of database will be passed from caller function
    // Hence control inverted to caller function 
    public void test(Database database) {
        ...
        Database database = database;
        ...
    }
}

```

Spring implements IoC with Dependency Injection(DI). In DI the control is inverted by setting an object's dependencies.