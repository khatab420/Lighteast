FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/*.jar /app/app.jar
EXPOSE 8090
ENTRYPOINT ["java","-cp","/app/app.jar","com.lighteast.WebApp"]
