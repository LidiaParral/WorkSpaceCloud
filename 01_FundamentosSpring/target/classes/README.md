Para hacer un proyecto Spring lo primero debemos de importar
las librerías de Spring, es decir los .jar

Para crear un JAR
1) Botón derecho sobre el proyecto y presionar el EXPORT
2) Exportar como "Jar File"
3) Elegir el destino donde se crea el JAR
4) Finish

Usar JAR en el proyecto:
1) Crear en el proyecto una carpeta llamada LIB
2) Meter dicho .JAR en el classPath, que es un fichero donde la VM de Java va a buscar
todas las clases para usar en el proyecto.
3) Botón derecho -> Confugure build path -> add la libreria


En la industria actual para importar librerias en un proyecto java se suele utilizar
MAVEN

MAVEN, es un software ampliamente utilizado en el desarrollo de software que nos ayuda a llevar el ciclo de vida de un programa entero, desde que empiezas a programarlo hasta que lo pones en producción. Una de las partes más importantes que tiene MAVEN es para las dependencias de las librerías de nuestra app.

Para crear un proyecto MAVEN podemos hacerlo:
1) Botón derecho sobre el proyecto
2) Configure
3) Convertir a proyecto MAVEN

Una vez hecho esto, podemos empezar a configurar las dependencias en el fichero pom.xml
Siempre debemos de ir al repositorio central de MAVEN: https://mvnrepository.com/repos/central

y copiar las dependencias en nuestro pom.xml


SPRING
--------

Lo primero que tenemos que hacer es crear el contexto de spring, podemos hacerlo de varias maneras, una es mediante ficheros xml



