# Foro en Línea - API REST

Este proyecto es una aplicación backend desarrollada en Java que utiliza una API REST para gestionar los tópicos de un foro en línea. La aplicación permite crear, editar, eliminar y consultar tópicos, almacenando los datos en una base de datos MySQL.

## Funcionalidades

- **Crear tópicos**: Recibe solicitudes POST para agregar nuevos tópicos al foro.
- **Consultar tópicos**: Permite obtener información detallada de los tópicos almacenados.
- **Editar tópicos**: Habilita la modificación de los detalles de un tópico existente mediante solicitudes PUT.
- **Eliminar tópicos**: Soporta la eliminación de tópicos con solicitudes DELETE.
- **Seguridad**: Implementa **Spring Security** para proteger los endpoints y gestionar la autenticación y autorización.
- **Pruebas automatizadas**: Incluye pruebas automatizadas para garantizar la calidad y el correcto funcionamiento del código.

## Estructura de un Tópico

Cada tópico tiene la siguiente estructura:

- `id`: Identificador único del tópico (Long).
- `título`: Título del tópico (String).
- `mensaje`: Contenido del mensaje del tópico (String).
- `fechaDeCreación`: Fecha y hora de creación del tópico (LocalDateTime).
- `estatus`: Estado del tópico (activo/inactivo) (Boolean).
- `autor`: Nombre del autor del tópico (String).
- `curso`: Curso relacionado al tópico (String).

## Endpoints de la API

- **POST /topicos**: Crea un nuevo tópico.
- **GET /topicos**: Lista todos los tópicos.
- **GET /topicos/{id}**: Obtiene un tópico específico por su ID.
- **PUT /topicos/{id}**: Edita un tópico existente.
- **DELETE /topicos/{id}**: Elimina un tópico.

## Ejemplo de Solicitud POST

```json
{
  "título": "Dudas sobre Java",
  "mensaje": "¿Cómo manejar excepciones en Java?",
  "fechaDeCreación": "2025-01-21T14:30:00",
  "estatus": true,
  "autor": "Juan Pérez",
  "curso": "Programación en Java"
}
