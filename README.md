# Servicio de Sincronización de Órdenes

Este servicio permite gestionar órdenes de manera asíncrona utilizando Spring Boot. Al recibir una solicitud, responde inmediatamente mientras continúa procesando en segundo plano.

## Características

- **Asíncrono**: Procesa tareas sin bloquear la respuesta.
- **Rápido**: Responde inmediatamente al cliente.
- **Configuración**: Puedes ajustar el pool de hilos.

## Requisitos

- Java 17+
- Maven 3.6+
- Spring Boot 2.5+

## Instalación

1. Clona el repositorio:

    git clone https://github.com/alberto-navarrete/spring-boot-backend-base-ws-async
    cd spring-boot-backend-base-ws-async
   
2. Compila el proyecto

    mvn clean install´
   
3. Ejecuta la aplicación

    mvn spring-boot:run
    
4. PRUEBA LA APLICACIÓN

    curl --header "Content-Type: application/json" --request POST --data '{"orden":"xyz","valores":"xyz"}' http://localhost:8080/sincroniza/orden