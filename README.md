# Prueba tecnica - Seccion 2

## Nombre 
* **Espejel Gonzalez, Alberto Raul**

## Objetivo 馃搵
Creaci贸n e implementaci贸n de una aplicaci贸n

### Problem谩tica

Problema: Calcular el numero faltante de un conjunto de los primeros 100 n煤meros naturales del cual se extrajo uno.

### Especificaciones 馃搵

* La aplicaci贸n debe de implementarse en el lenguaje de acuerdo con el perfil 		
* Se debe de implementar una clase que represente al conjunto de los primero 100 n煤meros
* La clase implementada debe de tener el m茅todo Extract para extraer un cierto n煤mero deseado
* La clase implementada debe de poder calcular que numero se extrajo y presentarlo
* Debe de incluir validaci贸n del input de datos (numero, n煤mero menor de 100)
* La aplicaci贸n debe de poder ejecutarse con un argumento introducido por el usuario que haga uso de nuestra clase y muestre que pudo calcular que se extrajo ese n煤mero

## Comandos 馃洜

### Dockerizar y correr la aplicaci贸n
Ejecutar los siguientes comandos en una terminal situada en la carpeta ra铆z de este repositorio
* Generar el .jar de la aplicaci贸n
```
.\mvnw.cmd clean package -DskipTests
```
* Construir la im谩gen de Docker
```
docker build -t seccion2:1 .
```
* Generar el contenedor de Docker
```
docker run -p 8080:8080 -d --name seccion2 seccion2:1
```
* Finalizar la ejecuci贸n del contenedor (Opcional)
```
docker stop seccion2
```
