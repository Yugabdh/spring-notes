# What is Spring?
- Application Development framework for Enterprise Java Applications
- Spring frameowrk is Open source 
- Spring Framework provides good programming practices by providing POJO-based programming model for J2EE development

# Features of Spring
**Lightweight**

**Inversion of Control(IoC)**

Inversion of control is inverting flow of control that is objects do not create objects that they depend upon insted they get the object they need from outside source.

For example, suppose we are writing a database related function, in traditional approch this function creates database object 
```
class Example {
    public void test() {
        ...
        MySqlDatabase database = new MySqlDatabase();
        ...
    }
}
```
while in case of if we are using IoC approch we will use abstraction 
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

**What is dependency?**

Suppose Class A calls function from Class B by creating instance of class B in it then Class A is dependent on class B

```
class B {
    public void test() {
        ...
        // code
        ...
    }
}

class A {
    public void callB() {
        B objB = new B();
        objB.test(); // Dependency
    }

}
```