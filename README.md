# proyectoFinal
proyectoDAM
### Sistema de Gestión de Bases de Datos: MySQL con XAMPP  

## Descripción  
LionGame es una aplicación que permite a los usuarios registrarse, iniciar sesión y gestionar su información de manera segura mediante una conexión con MySQL, utilizando XAMPP como entorno de servidor local.  
El sistema está desarrollado en Java y usa JDBC para la comunicación con la base de datos.  

## Requisitos Previos  
Antes de comenzar, asegúrate de tener las siguientes herramientas instaladas:  

- **JDK 17 o superior**  
  [Descargar Java](https://www.oracle.com/java/technologies/javase-downloads.html)  
- **XAMPP**  
  [Descargar XAMPP](https://www.apachefriends.org/es/index.html)  
- **Eclipse IDE**  
  [Descargar Eclipse](https://www.eclipse.org/downloads/)  

## Configuración de MySQL en XAMPP  
### 1. Iniciar MySQL en XAMPP  
- Abre **XAMPP Control Panel** y activa **MySQL**.  
- Opcionalmente, también puedes activar **Apache** si necesitas un servidor web.  

### 2. Crear la base de datos  
- Accede a **phpMyAdmin** desde `http://localhost/phpmyadmin`.  
- Crea una base de datos llamada `"proyecto"`.  
- Ejecuta el siguiente script SQL para definir la tabla de usuarios:  

## Configuración del Driver JDBC  
Para conectar la aplicación con MySQL utilizando **JDBC**, sigue estos pasos:  

### 1. Descarga del driver JDBC  
Descargar el driver JDBC desde el sitio oficial de **MySQL Connector/J**:  
👉 [Descargar MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/)  

### 2. Agregar el driver en Eclipse  
1. Abrir **Eclipse** e ir a `"Project → Properties → Java Build Path → Libraries → Add External JARs"`.  
2. Seleccionar el archivo **`mysql-connector-java-X.X.X.jar`** que has descargado.  
3. Aplicar los cambios y guardar la configuración.
```sql
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    apellido VARCHAR(50),
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    pais VARCHAR(50),
    genero VARCHAR(20),
    nombre VARCHAR(50),
    pin VARCHAR(10)
);
