#  Setter Dependency Injection

- Dependency will be injected with the help of setter methods.
- The setter injection uses the **property tag** for setter injection.
- This **property tag** will be defined inside bean definition and the **name attribute** of this tag will be attribute name of class.
- In the case of annotation-based configuration, we use **@Autowired** annotation on the setter method declaratin provides that bean is declared already.
- In setter dependency injection, Object is created first then dependecy is injected.

**XML syntax:**
```
<property name="nameOfAttribute" ... />
```

**Annotation:**
```
@Autowired
public void setName(String name) {
    this.name = name;
}
```

## Why and When to use Setter Dependency Injection?
- Earlier, when Spring was introduced as an open source framework, it mainly focused on setter-based injection. The fact that setter injection was used in Spring itself, as well as us advocating it mostly, also caused many pieces of third-party software to start using setter injection. That's why there are more setter injection implementations.
- When using setter injection, we can avoid initializing all attributes an object may have, because there is less clutter at the time of bean initialization, the system is much more efficient.
