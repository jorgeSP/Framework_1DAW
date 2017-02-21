HISTORIAL PRUEBAS FRAMEWORK

 ------------Modo Normal--------------
	     [Opciones de la App]
-(Formato fecha){se daran a elegir entre 4 formatos distintos("xx/xx/xxxx,"xx-xx-xxxx","xxxx/x/xx","xxxx-xx-xx")}
-(conversion de moneda){se dara a elegir la moneda en 4 tipos:(Euros,Libras,Dolares,Bitcoins)}
-(Decimales){Se podran mostrar las cantidades hasta en 5 decimales}
-(Cambio idioma){Estara disponible la App en 3 idiomas:Español,Ingles,Italiano}
-(Modo Dummies){Podremos entrar en modo dummies desde ajustes para realizar pruebas de la App}
-(Fichero App){Podremos elegir en que tipo de fichero deseamos que trabaje la aplicacion,Ficheros disponibles TXT,XML}
-(Tema Personalizacion){Podremos personalizar las ventanas de nuestra app en 6 modos distintos: METAL,GTXK,MOTIF,NINBUS,WINDOWS95,WINDOWS }
  -(Pestaña volver)OK {devuelve al menu principal de usuarios y opciones de la aplicacion}	     
	      [Usuario Cliente]
-sistema de logeo OK
-CRUD(sistema registro) OK {Daremos la opcion a registrarse como cliente a un usuario en la App,Solo se aceptara la cuenta si los datos de dni i nombre de usuario no coinciden con ninguno de algun cliente ya existente}
-CRUD(lectura datos)OK {el usuario solo podra leer los datos de la cuenta en la que se haya logeado}
-CRUD(modificar datos)OK {el usuario solo podra cambiar los datos de su propia cuenta,control de cuenta mediante dni i usuario (si se intenta modificar o crear una cuenta y los datos introducidos concuerdan con los de algun usuario ya registrado seran rechazados de manera inmediata)}
-CRUD(borrado usuario)OK {el usuario solo podra borrar su propia cuenta}
    -(Abrir OnDemand)OK {el usuario podra abrir ficheros externos,cuando la app este modo xml estara restringido a abrir solo ficheros en formato xml,cuando este en modo txt estara disponible solo abrir ficheros modo txt}
    -(guardar OnDemand)OK{el usuario podra guardar ficheros externos,cuando la app este modo xml estara restringido a guardar solo ficheros en formato xml,cuando este en modo txt estara disponible solo guardar ficheros en modo txt}
    -(Pestaña volver)OK {devuelve al menu principal de usuarios y opciones de la aplicacion}
    -(Exit)OK {Salimos de la aplicacion}

	       [Usuario Admin]
-sistema de logeo OK {Solo podremos logearnos si introducidos los datos de usuario y contraseña concurrentes con los datos de la cuenta previa creada}
-CRUD(sistema registro) OK {Daremos la opcion a registrarse como usuario admin solo a aquellos que tengan la clave secreta proporcionada por el SUPERADMIN,Solo se aceptara la cuenta si los datos de dni i nombre de usuario no coinciden con ninguno de algun admin ya existente}
-CRUD(lectura datos)OK {el usuario admin tendra acceso para leer tanto los usuarios admin como los usuarios clientes de toda la aplicacion,se daran dos opciones de lectura de usuarios(LEER TODOS LOS USUARIOS , BUSCAR USUARIO POR DNI-NOMBRE-APELLIDO)}
-CRUD(modificar datos)OK {El usuario admin tendra acceso para modificar cualquier dato tanto de usuarios admins como de usuarios clientes,hay control de introduccion de datos en nombre de usuario i dni si se intenta cambiar algun dato i este ya esta siendo usado por algun usuario sera rechazado}
-CRUD(borrado usuario)OK {El usuario admin usuario admin tendra acceso para borrar cualquier cuenta tanto de usuarios admins como de usuarios clientes}
     -(Ordenar usuarios) {El usuario admin podra ordenar tanto la lista de clientes como la lista de admins,en el caso de admins se podran ordenar por:(Dni,Usuario,Nombre,Apellidos,Fecha nacimiento,Edad,Fecha contratacion,Sueldo),en el caso de clientes por:(Dni,Usuario,Nombre,Apellidos,Fecha nacimiento,Edad)}
     -(Abrir OnDemand)OK {el usuario admin podra abrir cualquier copia de seguridad previamente hecha,formatos aceptados(XML,TXT)}
     -(Abrir OnDemand)OK {el usuario admin podra restaurar de una copia de seguridad la base de datos tanto de los usuarios clientes como de los usuarios admins,Formatos admitidos(TXT,XML)}
     -(Pestaña volver)OK {devuelve al menu principal de usuarios y opciones de la aplicacion}
     -(Exit)OK {Salimos de la aplicacion}

	      [Usuario Normal]
-CRUD(crear usuario) OK {El usuario normal podra introducir algunos datos pero estos solo permaneceran en la aplicacion mientras este conectado el usuario,cuando apage la aplicacion se borraran}
-CRUD(lectura datos)OK {El usuario normal solo podra leer los datos introducidos por el mismo}
     -(Pestaña volver)OK {devuelve al menu principal de usuarios y opciones de la aplicacion}
     -(Exit)OK {Salimos de la aplicacion}

 ------------Modo Dummies--------------