# API REST para Gestión de Clínica - Proyecto Spring Boot

Este es un proyecto de API REST para la gestión de una clínica desarrollado utilizando Spring Boot y MySQL.

## Requisitos Previos

- Java JDK 8 o superior instalado: [Java Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
- MySQL instalado y configurado: [MySQL Downloads](https://dev.mysql.com/downloads/)

## Configuración del Proyecto

1. Clona el repositorio:

    ```bash
    git clone git@github.com:Allam9573/backend_clinica.git
    ```

2. Configura la base de datos en `src/main/resources/application.properties`:

    ```properties
    spring.jpa.hibernate.ddl-auto=validate
    spring.datasource.url=jdbc:mysql://localhost:3306/nombre_base_datos
    spring.datasource.username=usuario_bd
    spring.datasource.password=contraseña_bd
    ```

3. Ejecuta la aplicación:

    ```bash
    ./mvnw spring-boot:run
    ```

   o usando Maven:

    ```bash
    mvn spring-boot:run
    ```

4. La API estará disponible en [http://localhost:8080](http://localhost:8080).

## Estructura del Proyecto

- `src/main/java/com/tuempresa/clinica`: Contiene los archivos fuente Java.
- `src/main/resources`: Contiene archivos de configuración.

## Tecnologías Utilizadas

- Spring Boot
- Spring Data JPA
- MySQL

## Endpoints de la API

- `GET /pacientes`: Obtiene la lista de pacientes.
- `GET /medicos`: Obtiene la lista de médicos.
- `POST /citas`: Crea una nueva cita.
- ...

## Contribuciones

¡Contribuciones son bienvenidas! Si encuentras errores o mejoras, por favor crea un issue o envía un pull request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE.md](LICENSE.md) para más detalles.
