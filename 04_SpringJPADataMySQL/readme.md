Crear un proyecto Spring JPA-DATA
-
Crear un proyecto spring como en el ejemplo anterior, pero esta
vez elegir los siguientes starters:

1. Spring JPA DATA, dentro de SQL
2. La bbdd que vamos la usar, en mi caso voy a usar MySql pero 
tambien podemos elegir H2 (con H2 podemos levantar una BBDD en 
memoria, con MySql)

Lo siguiente, seria crar la entiedad y la anotamos. En este caso
la entidad Coche.

Para este ejemplo habria que crear un schema en la bbdd que se llame
concesionario. En el fichero "application.properties" esta la configuracion a nuestra bbdd. Si usamos H2 en vez de MySql pues
no habria que hacer la configuracion de BBDD ya que por defecto
Spring levantaria la bbdd en memoria.