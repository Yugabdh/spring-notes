# Dependency Injection

## What is Dependency?

When one class uses instance of other class to call it's functions it is said to be dependent on class from which function is called.

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

## With help of Spring 

In spring we outsource instantiation of objects (using spring container) and this instantiated object are assigned to dependent object variables with help of certain configuration. 

### Benifits of Dependency Injection
- Lose coupling: As we can change configuration any time we can achive lose coupling
- We get much modular code
- Enhances Testability as mock dependencies can be injected

## Types of Dependency Injection

**Setter Injection:** Using setter method spring container will inject the dependencies.

**Constructor Injection:** Using constructor spring container will inject the dependencies.

**Inteface Injection:** In interface-based dependency injection, we will have an interface and on implementing it we will get the instance injected.