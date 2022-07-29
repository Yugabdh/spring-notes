# Java Based Container Configuration
- Java-based container configuration is achived by annoting the class with the _@Configuration_ annotation.
- Annotating a class with the _@Configuration_ indicates that the class can be used by the Spring IoC container as a source of bean definitions.
- An application may use one _@Configuration_-annotated class, or many. _@Configuration_ is meta-annotated as a _@Component_.
- _@Configuration_-annotated classes must also have a default constructor.

## Bean Creation in Java-based configuration
- @Bean is a method-level annotation and a direct analog of the XML <bean/> element. The annotation supports some of the attributes offered by <bean/>, such as: init-method, destroy-method, autowiring and name.

Example:
```
@Configuration
public class AppConfig {

    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl();
    }

}
```
The preceding configuration is exactly equivalent to the following Spring XML:
```
<beans>
    <bean name="transferService" class="com.acme.TransferServiceImpl"/>
</beans>                
```

## Injecting dependencies

```
@Configuration
public class AppConfig {

    @Bean
    public Foo foo() {
        return new Foo(bar());
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

}
```

## Few important annotations

- @Configuration

    Use to specify Java-based container configuration class

- @import("Fully qualified class name")
    
    Is used to import other @Configuration annoted classes
    equivalent to 
    ```
    <import resource="dao/spring-dao.xml"/>  
    ```

- @Bean(name = "beanName")

    @Scope(value="prototype")

    Is used to specify scope of bean
    ```
    <import resource="dao/spring-dao.xml"/>  
    ```