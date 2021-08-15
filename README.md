# mvc

#TEMA :   Arquitectura de Software :   "Modelo-Vista-Controlador"

#PROYECTO JAVA :   Java Application

#PAQUETE "Modelo" : 

  - CLASE "Conexio" :  Conexion a la base de datos "mybd", mediante JDBC.
  
  - CLASE "usuario" :  Clase Entidad (Entity) de la tabla "usuario".
  
  - CLASE "usuarioDao" :  Clase de métodos "CRUD": ("registrar","buscar","modificar","eliminar").
  
#PAQUETE "Vista" : 

  - CLASE "usuarioFrm" :  interfaz de usuario, mediante una Clase "Jframe".
  
#PAQUETE "Controlador" : 

  - CLASE "usuarioController" :   Intermediario entre "Modelo" y "Vista", gestionando transformaciones para adaptar los datos 
  al mantenimiento de la base de datos.
  
#PAQUETE "mvc1" : 
  
  - CLASE "Mvc1" :  Clase principal, se instancian las clases "usuario", "usuarioDao", "usuarioFrm", "usuarioController"
  y se ejecuta el proyecto mediante el método"main".

