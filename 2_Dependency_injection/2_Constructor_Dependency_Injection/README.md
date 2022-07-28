#  Constructor Dependency Injection

- Constructor-based DI is accomplished by the container invoking a constructor with a number of arguments, each representing a dependency.
- The constructor injection uses the **constructor-arg tag** for setter injection.
- This **constructor-arg tag** will be defined inside bean definition. We can pass arguments in sequence according to sequence of
arguments in constructor.
- We can also use index attribute to specify which argument we are passing to avoid errors.
- In the case of annotation-based configuration, we use **@Autowired** annotation on the parameterised constructor.

**XML syntax:**
```
<constructor-arg index="indexOfAttribute" value="..." />
```

**Annotation:**
```
@Autowired
ClassName(String name) {
    // this is constructor
    this.name = name;
}
```

## Why and When to use Setter Dependency Injection?
- When getting completely initialized, an object is important, using the constructor based DI. As you have to supply all beans/arguments to get the bean initialized.
