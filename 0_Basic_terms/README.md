## POJO(Plain Old Java Object)

POJO is a Java object.

- All properties must public setter and getter methods
- All instance variables should be private
- Should not Extend prespecified classes.
- Should not Implement prespecified interfaces.
- Should not contain prespecified annotations.
- It may not have no argument constructor

## IoC Container

The interface org.springframework.context.ApplicationContext represents the Spring IoC container and is responsible for instantiating, configuring, and assembling the aforementioned beans. The container gets its instructions on what objects to instantiate, configure, and assemble by reading configuration metadata. The configuration metadata is represented in XML, Java annotations, or Java code. It allows you to express the objects that compose your application and the rich interdependencies between such objects.

## Beans
In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.

