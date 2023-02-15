# Prueba tecnica - Seccion 2

## Nombre 
* **Espejel Gonzalez, Alberto Raul**

## Objetivo 📋
Creación e implementación de una aplicación

### Problemática

Problema: Calcular el numero faltante de un conjunto de los primeros 100 números naturales del cual se extrajo uno.

### Especificaciones 📋

* La aplicación debe de implementarse en el lenguaje de acuerdo con el perfil 		
* Se debe de implementar una clase que represente al conjunto de los primero 100 números
* La clase implementada debe de tener el método Extract para extraer un cierto número deseado
* La clase implementada debe de poder calcular que numero se extrajo y presentarlo
* Debe de incluir validación del input de datos (numero, número menor de 100)
* La aplicación debe de poder ejecutarse con un argumento introducido por el usuario que haga uso de nuestra clase y muestre que pudo calcular que se extrajo ese número

## Comandos 🛠

### Dockerizar y correr la aplicación
Ejecutar los siguientes comandos en una terminal situada en la carpeta raíz de este repositorio
* Generar el .jar de la aplicación
```
.\mvnw.cmd clean package -DskipTests
```
* Construir la imágen de Docker
```
docker build -t seccion2:1 .
```
* Generar el contenedor de Docker
```
docker run -p 8080:8080 -d --name seccion2 seccion2:1
```
* Finalizar la ejecución del contenedor (Opcional)
```
docker stop seccion2
```
