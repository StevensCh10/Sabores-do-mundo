# Etapa de build
FROM maven:3.9.6-eclipse-temurin-21 AS build

LABEL description="Imagem JDK 21 - Backend"

WORKDIR /app

# Copia o pom.xml e baixa as dependências antes de copiar o código-fonte
COPY pom.xml ./
RUN mvn dependency:go-offline

# Copia o código-fonte após baixar dependências para melhor aproveitamento de cache
COPY src ./src

RUN mvn clean package -DskipTests

# Etapa final
FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=build /app/target/backend-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]