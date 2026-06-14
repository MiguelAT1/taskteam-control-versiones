# TaskTeam Control Versiones

## Descripción del Proyecto

TaskTeam Control Versiones es un proyecto académico desarrollado para el curso Herramientas de Desarrollo, con el objetivo de aplicar el uso de sistemas de control de versiones mediante Git y GitHub en un entorno colaborativo.

El sistema permite gestionar tareas mediante una aplicación web desarrollada con Angular en el frontend y Spring Boot en el backend.

---

## Objetivos

- Aplicar buenas prácticas de control de versiones.
- Gestionar ramas utilizando Git Flow.
- Realizar Pull Requests y revisiones de código.
- Resolver conflictos de fusión.
- Implementar Integración Continua mediante GitHub Actions.
- Gestionar versiones utilizando Tags y Releases.

---

## Tecnologías Utilizadas

### Control de Versiones
- Git
- GitHub

### Gestión de Proyecto
- Trello

### Frontend
- Angular
- TypeScript
- HTML
- CSS

### Backend
- Java 21
- Spring Boot
- Maven

### Automatización
- GitHub Actions

---



## Flujo de Trabajo

El proyecto se desarrolló utilizando Git Flow:

### Ramas principales

- main
- develop

### Ramas de trabajo

Frontend:
- feature/frontend-ui
- feature/frontend-integracion

Backend:
- feature/backend-api
- feature/backend-tests

DevOps y documentación:
- feature/devops-documentacion

Conflictos:
- feature/conflicto-prioridad-a
- feature/conflicto-prioridad-b

---

## Funcionalidades Implementadas

### Frontend

- Interfaz principal de tareas.
- Formulario para registro de tareas.
- Listado de tareas.
- Integración con servicios.

### Backend

- Modelo Tarea.
- Servicio de gestión de tareas.
- Controlador REST.
- Pruebas unitarias.

### DevOps

- Workflow de GitHub Actions.
- Integración continua (CI).
- Ejecución automática de pruebas.

---

## GitHub Actions

Se configuró GitHub Actions mediante el archivo:

```text
.github/workflows/ci.yml
```

Cada vez que se realiza un Push o Pull Request, GitHub ejecuta automáticamente las validaciones configuradas para verificar el correcto funcionamiento del proyecto.

---

## Gestión de Versiones

### Release v1.0

Incluye:

- Frontend Angular.
- Backend Spring Boot.
- API REST de tareas.
- Pruebas unitarias.
- Flujo colaborativo básico.

### Release v1.1

Incluye:

- GitHub Actions.
- Integración continua.
- Resolución de conflictos de fusión.
- Mejoras en el flujo colaborativo.
- Optimización de la documentación.


## Conclusiones

- Git permitió organizar el desarrollo colaborativo mediante ramas y Pull Requests.
- GitHub Actions facilitó la automatización de tareas y validaciones.
- La resolución de conflictos permitió comprender el proceso de integración de cambios.
- Los Releases facilitaron el control y seguimiento de versiones del proyecto.
