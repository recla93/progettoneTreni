# ---------- BUILD STAGE ----------
FROM maven:3.9.7-eclipse-temurin-21 AS builder
WORKDIR /app
COPY . .
RUN mvn -q clean package -DskipTests

# ---------- RUNTIME STAGE ----------
FROM eclipse-temurin:21-jre
ARG JAR_FILE=target/*.jar
COPY --from=builder /app/${JAR_FILE} app.jar

# -> se vuoi il debug remoto decommenta la linea seguente
# EXPOSE 5005
# ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=0.0.0.0:5005","-jar","/app.jar"]

ENTRYPOINT ["java","-jar","/app.jar"]
