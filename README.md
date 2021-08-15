# mvc

#TEMA :   Arquitectura de Software :   "Modelo-Vista-Controllado"

#PROYECTO JAVA :   Java Application

#PAQUETE "Modelo" : 

  -CLASE "Conexio" :  Conexion a la base de datos "mybd", mediante JDBC.
  
  -CLASE "usuario" :  Clase Entidad (Entity) de la tabla "usuario".
  
  -CLASE "usuarioDao" :  Compuesta por los métodos "CRUD": ("registrar","buscar","modificar","eliminar"), para el mantenimiento a la base de datos "mybd".
  
#PAQUETE "Vista" : 

  -CLASE "usuarioFrm" :  interfaz de usuario, Compuesta con los ("btnRegistrar1","btnBuscar","btnModificar","btnEliminar","btnLimpiar") mediante un "Jframe".
  
#PAQUETE "Controlador" : 

  -CLASE "usuarioController" :  Clase intermediario entre el "Modelo" y la "Vista", gestionando transformaciones para adaptar los datos 
  al mantenimiento de la base de datos.
  
#PAQUETE "mvc1" : 
  
  -CLASE "Mvc1" :  Es la clase principal, se instancian las clases "usuario", "usuarioDao", "usuarioFrm", "usuarioController", 
  se ejecuta el proyecto mediante el método"main".

