# PERSON CRUD EXAMPLE 

Este repositorio solo cumple con la funcion de mostrar un ejemplo de crud en 
una arquitectura rest apoyado con una base de datos embedida en memoria H2
administrada bajo JPA

>No es necesaria ninguna configuracion extra por parte del usuario

###Endpoints

>**NOTA**: Para acceder a la vista de la api con swagger acceder al servicio a traves de la url `protocol://host:port/context` (`http://localhost:8080/jpaExample`)

#####Insertar una nueva persona en base de datos

URL: `http://ip:port/jpaExample/person/new`

body:
```json
{
	"nombre": "user name",
	"born": "1998/05/03",
	"email": "user@domain.com",
	"edad": 21
}
```

####Buscar todas las personas

URL: `http://ip:port/jpaExample/person/find`

####Buscar a una persona por id

URL: `http://ip:port/jpaExample/person/find/{id}`
>El valor `{id}` hace referencia a que el balor absoluto es el id de la persona a buscar

####Acceder a la base de datos

Para poder acceder a la base de datos se tendra que dirigir a la url:
`http://ip:port/jpaExample/h2-console` y asignar el valor 
`jdbc:h2:mem:test_mem` en la casilla de la etiqueta `JDBC URL`, asignar
el valor `sa` a la casilla con la etiqueta `User Name` y la casilla con la
etiqueta `password` viajara vacia, final mente hacer clic en el boton `Connect`.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/maven-plugin/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

