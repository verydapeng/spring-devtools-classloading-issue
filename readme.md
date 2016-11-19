# How to produce

```bash
mvn clean compile
export CLASSPATH=$(mvn dependency:build-classpath -DexcludeGroupIds=verydapeng | grep  "^/"):spring-boot/target/classes/:dep/target/classes/
java app.App
```

__Error Message__
```
2016-11-19 17:15:01.261 ERROR 61352 --- [  restartedMain] o.s.boot.SpringApplication               : Application startup failed

org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'applicationRunner' defined in class path resource [app/Config.class]: Unsatisfied dependency expressed through method 'applicationRunner' parameter 0: Bean named 'someService' is expected to be of type [app.SomeService] but was actually of type [app.SomeService$$EnhancerBySpringCGLIB$$d68b0542]; nested exception is org.springframework.beans.factory.BeanNotOfRequiredTypeException: Bean named 'someService' is expected to be of type [app.SomeService] but was actually of type [app.SomeService$$EnhancerBySpringCGLIB$$d68b0542]
```



# It works fine 

if we run

```bash
cd spring-boot
mvn spring-boot:run -am
```

or

```bash
cd spring-boot
mvn package -am
java -jar target/spring-boot-1.0-SNAPSHOT.jar
```
