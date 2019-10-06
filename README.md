
This project is a simple spring boot application applying some retail online store buissness conditiona which as the following

1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

## UML Digram

- [UML Digram] ({project_directory}\retail-online-store\src\main\resources\retail-online-store uml diagram.jpg)

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the 'main' method in the 'RetailOnlineStoreApplication' class from your IDE.

Or For getting the final output with test cases build the project in eclipes IDE or through command prompt.

CMD- open cmd in project directory folder and run the below command
-> mvn clean install
You will able to see the output on console for the all given scenarios.

Junit Coverage-
Once build will get success you will able to get the Junit Coverage generated reported in project directory.
Go to project_directory->target->site->jacoco->index.html


Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:
mvn spring-boot:run

### Build an executable JAR
You can run the application from the command line using:
mvn spring-boot:run

Or you can build a single executable JAR file that contains all the necessary dependencies, classes, and resources with:

mvn clean package
```
Then you can run the JAR file with:

java -jar target/*.jar


## License
This project is licensed under the terms of the [MIT license](LICENSE).