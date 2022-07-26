# Dependency Injection

## What is dependency?

Suppose Class A calls a function from Class B by creating an instance of class B in it, then Class A is dependent on class B.

```
class B {
    public void test() {
        ...
        // code
        ...
    }
}

class A {
    private B objB; // Dependency
    public void callB() {
        objB = new B();
        objB.test(); 
    }
}
```

## Spring Dependency Injection

Dependency Injection is functionality provided by Spring IoC. IoC is a design principle which emphasizes keeping the Java classes independent of each other. This independence leads to loose coupling and modularized code which is easy to maintain.

Dependency occurs when one class needs an instance of class at the time of instantiation. 

Spring-Core module is responsible for injecting dependencies through either Constructor or Setter methods.

## Types of Spring Dependency Injection

1. Setter Dependency Injection
2. Constructor Dependency Injection

## Spring IoC Container

The interface _org.springframework.context.ApplicationContext_ represents the Spring IoC container and is responsible for instantiating, configuring, and assembling the aforementioned beans. 

The container gets its instructions on what objects to instantiate, configure, and assemble by reading configuration metadata. 

The configuration metadata is represented in XML, Java annotations, or Java code.

### Configuration metadata

The Spring IoC container consumes a form of configuration metadata; this configuration metadata represents how you as an application developer tell the Spring container to instantiate, configure, and assemble the objects in your application.

This metadata can be specified in 
- XML based config
- Annotation based config
- Java based config

The following example shows the basic structure of XML-based configuration metadata:

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans.xsd">

  <bean id="..." class="...">
    <!-- collaborators and configuration for this bean go here -->
  </bean>

  <!-- more bean definitions go here -->

</beans>
```
**id attribute** is a string that you use to identify the individual bean definition. 

**class attribute** defines the type of the bean and uses the fully qualified classname. 

### Instantiating a container

As _ApplicationContext_ is an interface, we have to use a concrete class for instantiation. Spring provides _ClassPathXmlApplicationContext_ out of box class which takes XML config file path as input. 

```
ApplicationContext context =
    new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});
```