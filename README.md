# my-spring-boot-app

## Build (Native)

### BUild

```
mvn clean package
```
or

```
mvn clean install
```

### Test

```
mvn test
```

```
mvn jacoco:report
```

### Run

```
java -jar target/my-spring-boot-app-0.0.1-SNAPSHOT.jar
```

```
curl http://localhost:8080/hello
```

## Using Docker

### Build

```
mvn clean package
docker build -t my-spring-boot-app-local .
```

### Run

```
docker run --rm -d -p 8080:8080 --name my-spring-boot-app my-spring-boot-app-local
```

```
curl http://localhost:8080/hello
```

```
docker logs my-spring-boot-app
```

```
docker stop my-spring-boot-app
```
