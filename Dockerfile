FROM openjdk:23-jdk AS build 
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:23-jdk-slim
COPY --from=build /app/target/x2.jar x2.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","x2.jar"]

