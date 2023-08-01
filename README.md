## Spring Container or IOC Container or Spring Context

Manages spring beans and lifecycle.

1. Bean factory: basic spring container.
2. Application context: advanced spring container with more features.
- easy to use in web
- easy internationalization
- easy integration with spring aop

@Autowired
//pede para o framework autoinjetar as dependencias,
//que são beans gerenciados pelo framework
//voce pode usar o @autowired em construtores, setters e fields
//o spring recomenda usar o @autowired em construtores, porque toda a instanciação ocorre no construtor, apenas uma vez.


@Component
//declara que a classe é um bean gerenciado pelo spring


Glossary

Dependency: when a class depends on another class.

@Component: An instance of class will be managed by Spring framework.

@ComponentScan: Used with @Configuration. How does Spring Frmework find component classes? It tells Spring to scan and bootstrap other components defined in the current package (by default) and its sub-packages.

@Service: Same as @Component. But, it is used for service layer.

@Repository: Same as @Component. But, it is used for DAO layer.

@Controller: Same as @Component. But, it is used for controller layer.

@Configuration: Used for Spring configuration class.

Spring Beans: Java objects that are managed by Spring IoC container.

@AutoWired: Used for auto wiring. It is used for dependency injection.



