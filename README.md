### Annotations

**`@Repository`**

**Definition:** Marks a class as a Data Access Object (DAO) component.

**Role/Purpose:** This annotation enables Spring's exception translation for data access and registers the data access layer as a bean in the IoC container.

---

**`@Autowired`**

**Definition:** Used to implement Spring's dependency injection.

**Role/Purpose:** Automatically injects a class's required dependency (another bean) onto a field, constructor, or method.

---

**`@Entity`**

**Definition:** Marks a Java class as a JPA entity that represents a table in a database.

**Role/Purpose:** Allows Object-Relational Mapping (ORM) tools such as JPA and Hibernate to associate this class with a database table.

---

**`@Column`**

**Description:** Used to map a field in an `@Entity` class to a specific column in a database table.

**Role/Purpose:** Allows specifying properties such as a name different from the default column name, length, or null constraints.

---

**`@PersistenceContext`**

**Description:** Used to inject an `EntityManager` instance.

**Role/Purpose:** Provides access to `EntityManager`, the core interface of JPA. `EntityManager` is used to manage, locate, and register entities.

---

**`@Transactional`**

**Definition:** Specifies that a method or class should be run within a database transaction.

**Role/Purpose:** Enables atomic (complete) execution of database transactions. If an error occurs during a transaction, all changes are rolled back. 


### Terms

**JDBC**

**Definition:** It is a standard Java API (Java Database Connectivity) for Java applications to connect to databases and execute SQL queries.

**Role/Purpose:** It acts as a bridge between Java and relational databases. `JdbcTemplate` and other ORM tools use JDBC as their basis. 

---

**CommandLineRunner**

**Definition:** It is an interface used in Spring Boot applications to execute specific code immediately after the application starts.

**Role/Purpose:** Used to automatically perform operations when the application starts, such as adding test data or configuring startup settings. 

---


**BeanPropertyRowMapper** 

**Description:** This class is used with Spring's `JdbcTemplate`. It maps each row in the result set of a JDBC query to a Java Bean.

**Role/Purpose:** It simplifies converting data from the database directly into a POJO (Plain Old Java Object) object without manually assigning each column individually.

**JdbcTemplate**

**Description:** This class is provided by the Spring Framework to simplify JDBC.

**Role/Purpose:** It eliminates the repetitive operations required by JDBC, such as opening a connection, freeing resources, and error handling. This allows developers to focus solely on the SQL code. 

---


**EntityManager**

**Definition:** This is the core interface of JPA and manages the lifecycle and persistence context for an entity.

**Role/Purpose:** It is used to perform operations such as creating, finding, updating, and deleting entities during database operations. 

---


**`extends JpaRepository`**

**Definition:** In Spring Data JPA, a `Repository` interface inherits from the `JpaRepository` interface.

**Role/Purpose:** It automatically provides methods for standard CRUD (Create, Read, Update, Delete) operations (e.g., `save()`, `findById()`, `findAll()`, `delete()`). This eliminates the need for developers to write SQL implementations of these core methods. 

---


**JPA and Hibernate Differences**

**Definition:** **JPA (Java Persistence API)** is a **standard and specification** for object-relational mapping (ORM) in Java. It defines only the interfaces and rules. **Hibernate** is a popular **ORM tool** that implements this JPA specification.

**Role/Purpose:** JPA provides portability between different ORM tools. Developers write their code according to JPA interfaces, allowing them to easily switch between underlying ORM tools (Hibernate, EclipseLink, etc.). Hibernate, on the other hand, provides the concrete functionality of these interfaces.
