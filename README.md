# octiq-java-maven-spring17

> Synthetic fixture for testing Octiq's GitHub import of Java projects. Not a real application.

## Scenario

A minimal Maven Spring Boot 3.2.5 web app declaring Java 17 via `<java.version>`. It is the flagship happy path for Java import.

## What this exercises

- Maven detection and `java.version` property parsing
- Spring Boot framework detection (parent + starter match `spring-boot`)
- Java 17 image selection
- Real transitive dependency resolution into the per-project cache volume
- A green `test-compile`

## Expected result on import

| Field | Expected |
| --- | --- |
| stack | `java` |
| build tool | `maven` |
| Java version | `17` |
| image | `maven:3.9-eclipse-temurin-17` |
| framework | `spring-boot` |
| modules | `[]` |
| final phase | `ready` |
| build green | `true` |

The first build downloads Spring Boot's dependency tree, so it is the slowest of the fixtures.

## Layout

```
pom.xml
src/main/java/com/octiq/fixture/App.java
```
