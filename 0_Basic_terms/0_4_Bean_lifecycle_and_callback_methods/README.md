# Bean lifecycle and CallBack Methods in Spring

Following is sequence of a bean lifecycle in Spring:

1. **Instantiate–** First the spring container finds the bean’s definition from the XML file and instantiates the bean..
2. **Populate properties–** Using the dependency injection, spring populates all of the properties as specified in the bean definition..
3. **Set Bean Name–** If the bean implements BeanNameAware interface, spring passes the bean’s id to setBeanName() method.
4. **Set Bean factory–** If Bean implements BeanFactoryAware interface, spring passes the beanfactory to setBeanFactory() method.
5. **Pre Initialization–** Spring’s BeanPostProcessors get into action in this phase. The postProcessBeforeInitialization() methods do their job. Also, @PostConstruct annotated methods run right after them.
6. **AfterPropertiesSet–** If the bean implements IntializingBean,its afterPropertySet() method is called. If the bean has init method declaration, the specified initialization method is called.
7. **Post Initialization–** If there are any BeanPostProcessors associated with the bean, their postProcessAfterInitialization() methods will be called.
8. **Ready to use–** Now the bean is ready to use by the application.
9. **Destroy–** If the bean implements DisposableBean , it will call the destroy() method .
