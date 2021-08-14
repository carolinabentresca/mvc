# mvc

#Tema: Arquitectura de Software: Modelo-Vista-Controllado

#Proyecto Java: Java Application

#Paquete Modelo: 

  -Clase Conexio: Conexion a la base de datos "mybd", mediante JDBC.
  
  -Clase usuario: Entidad de la tabla "usuario".
  
  -Clase usuarioDao: Compuesta por los métodos "CRUD", para el mantenimiento a la base de datos "mybd".
  
#Paquete Vista: 

  -Clase usuarioFrm: interfaz de usuario, mediante un Jframe.
  
#Paquete Controlador: 

  -Clase usuarioController: Clase intermediario entre el Modelo y La Vista, gestionando transformaciones para adaptar los datos al mantenimiento de la base de datos.
  
#Paquete mvc1: 
  
  -Clase Mvc1: Es la clase principal, se instancia las clases "usuario", "usuarioDao", "usuarioFrm", "usuarioController", se ejecuta el proyecto mediante el    método"main".

