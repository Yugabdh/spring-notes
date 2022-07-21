# Hello World

Here we go again :D

## Goals:

- how to write basic spring based application?
- Where to get DTD from?
- How to use beans and setup ApplicationContext (IoC container)?

## Steps

1. Create Maven project in java with maven-archetype-quickstart archetype.

2. Add following dependency to pom.xml from maven repsitory
    - spring-context

3. Create simple POJO(Name: HelloWorldPOJO; Attributes: name) with getters and setters and driver main class

4. Create source folder and add create xml file(Name: bean-config.xml) in it this will be configuration file for IoC container setup

5. Get DTD (DTD stands for Document Type Definition. A DTD defines the structure and the legal elements and attributes of an XML document.) for above xml from [spring docs](https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html)
    ```
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns:context="http://www.springframework.org/schema/context" xsi:schemaLocation="
            http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"> 
            
            <!-- bean definitions here -->

    </beans>
    ```

6. Create bean for above created POJO by adding it to config xml file(bean-config.xml) we created as follows:
    ```
    <bean id="HelloWorldPOJO"
        class="com.example.HelloWorldSpring.HelloWorldPOJO">

        <property name="name" value="Potato" />
    </bean>
    ```
    **id** is for providing unique identification to bean.

    **class** is fully qualified name of class.

    **property** is used for defining attribute of bean class.

7. Use this bean in driver code by fetching it from IoC container

8. IoC container can be created from xml config by using 
    ```
    ApplicationContext cntxt = new ClassPathXmlApplicationContext("bean-config.xml");
    ```
    And particular bean can be fetched from this IoC container as follows:
    ```
    ApplicationContext cntxt = new ClassPathXmlApplicationContext("bean-config.xml");
    ```
    Example code: 
    ```
    public class App 
    {
        public static void main( String[] args )
        {
            ApplicationContext cntxt = new ClassPathXmlApplicationContext("bean-config.xml");
            
            HelloWorldPOJO helloWorldPOJO = cntxt.getBean(HelloWorldPOJO.class, "HelloWorldPOJO");
            
            System.out.println("Hello " + helloWorldPOJO.getName());
            
            ((ClassPathXmlApplicationContext)cntxt).close();
        }
    }
    ```





