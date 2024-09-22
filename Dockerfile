# Etapa de construção
FROM gradle:7.6.0-jdk17 AS build
WORKDIR /app

# Copia os arquivos do projeto
COPY . .

# Compila a aplicação
RUN gradle build --no-daemon

# Etapa de execução
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia o JAR construído da etapa anterior
COPY --from=build /app/build/libs/*.jar app.jar


# Expondo a porta da aplicação
EXPOSE 9191

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
