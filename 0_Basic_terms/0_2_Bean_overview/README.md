# Bean overview

A Spring IoC container manages one or more beans. These beans are created with the configuration metadata that you supply to the container, for example, in the form of XML bean definitions.

Following metadata is need for bean defination:
1. A package-qualified class name
2. Bean behavioral configuration elements (scope, lifecycle callbacks, etc.)
3. References to other beans that are needed for the bean to do its work; these references are also called collaborators or dependencies.
4. Bean id/ name for unique identification if needed. If not proovided (in case of inner beans) container generates ID for bean.

## Specifying DI

### **Constructor based DI**

When using XML based configuration constructor-arg tag is used inside bean configuration.

Example
``` 
package x.y;

public class Foo {

  public Foo(Bar bar, Baz baz) {
      // ...
  }
}
```
Config:
```
<beans>
  <bean id="foo" class="x.y.Foo">
      <constructor-arg ref="bar"/>
      <constructor-arg ref="baz"/>
  </bean>

  <bean id="bar" class="x.y.Bar"/>
  <bean id="baz" class="x.y.Baz"/>

</beans>
```
**bar and baz are of different type hence no need to specify constructor argument indexes and/or types explicitly in the constructor-arg element.**

But when types are similar we have to specify indexes as follows:
```
<bean id="exampleBean" class="examples.ExampleBean">
    <constructor-arg index="0" value="7500000"/>
    <constructor-arg index="1" value="42"/>
</bean>
```

### **Setter based DI**

While using setter based DI we use property tag. 
Dependency will be injected with the help of setter methods.

The setter injection uses the **property tag** for setter injection.

This **property tag** will be defined inside bean definition and the **name attribute** of this tag will be attribute name of class.

### **Autowiring Dependency**
The Spring container can autowire relationships between collaborating beans.

Autowiring can significantly reduce the need to specify properties or constructor arguments.

#### **Autowiring modes:**

**no:**	(Default) No autowiring.

**byName:** Autowiring by property name. Spring looks for a bean with the same name as the property that needs to be autowired. 

**byType:** Allows a property to be autowired if exactly one bean of the property type exists in the container. If more than one exists, a fatal exception is thrown, which indicates that you may not use byType autowiring for that bean.

**constructor:** Analogous to byType, but applies to constructor arguments. If there is not exactly one bean of the constructor argument type in the container, a fatal error is raised.


### **Bean scopes**
**singleton:**

(Default) Scopes a single bean definition to a single object instance per Spring IoC container.

**prototype:**
	
Scopes a single bean definition to any number of object instances.

**request:**
	
Scopes a single bean definition to the lifecycle of a single HTTP request; that is, each HTTP request has its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.

**session:**
	
Scopes a single bean definition to the lifecycle of an HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.

**global session:**

Scopes a single bean definition to the lifecycle of a global HTTP Session. Typically only valid when used in a portlet context. Only valid in the context of a web-aware Spring ApplicationContext.