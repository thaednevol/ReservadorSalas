Requerimientos Reservas Laboratorio
===================================

- Objetivo de la solución
- Antecedentes
- Alcance
- Requerimientos no funcionales
- Requerimientos funcionales
 
Objetivo de la solución
-----------------------

Desarrollar una solución que permita automatizar el proceso de reservas y programación de las salas de laboratorio.

Antecedentes
------------

El proceso de reserva y programación de las salas de laboratorio se hace actualmente de forma manual a través de un formato [Figura 1]

Los profesores solicitan la sala y el encargado hace la reserva.

Alcance
-------

El nuevo sistema debe permitir realizar la reserva de salas de laboratorio desde un aplicativo accesible desde la web. Se debe garantizar la identidad de los profesores que solicitan las reservas.
Se debe permitir configurar las salas en el sistema y el administrador debe poder supervisar la asignación.


Requerimientos no funcionales
-----------------------------

- El sistema debe soportar hasta 20 transacciones por minuto
- El sistema debe visualizarse en Google Chrome desde la versión 30, Mozilla Firefox versión 30 e Internet Explorer versión 10.
- Se usará Centos 6.5 como sistema operativo, Tomcat 6 y MySql 5.4

Requerimientos funcionales
--------------------------

**Gestión de Usuarios**

*Función:* 

Administra los perfiles de los usuarios

*Descripción* 

Debe permitir el registro de usuarios nuevos, los cuales quedan en espera de aprobación por parte del administrador

*Entradas* 

Nombre, cédula, correo, contraseña y departamento

*Fuente* 

El usuario registra los datos solicitados 

*Salida* 

Correo al administrador y al nuevo usuario informando del registro. El registro queda en estado: “Por aprobar”

*Destino*

Aprobación por el administración

*Acción*

Todos los campos son obligatorios y validados. Un usuario se puede registrar por una única vez.

*Precondición*

El correo y el documento no deben estar registrados en el aplicativo

*Postcondición*

El usuario no puede realizar transacciones en hasta que sea aprobado por el adminstrador

*Efecto secundario*

La solicitud se refleja en la consola de  administrador.

**Aprobación de usuarios**

*Función*

Aprobar usuarios nuevos

*Descripción*

Se debe mostrar al administrador los nuevos registro de usuarios y darle la posibilidad de aprobarlos o rechazarlos

*Fuente*

Solicitudes en estado “Por aprobar” 

*Salida*

Cambio de estado a “Activo” o “Rechazado”

*Destino*

Se envia un correo electronico al usuario con el nuevo estado

*Acción*

El administrador debe visualizar los registros en estado “Por aprobar”, así como los datos del registro de usuario. Debe tener la opción de activar o rechazar al usuario nuevo

*Precondición*

N/A

*Postcondición*

Se envía un correo al usuario con el nuevo estado

*Efecto secundario*

N/A

**Gestión de correos**

*Función*

Modificar o agregar destinatarios para notificaciones

*Descripción*

Debe permitir al administrador agregar, editar o borrar correos para recibir las notificaciones del sistema

*Entradas*

Correo electrónico

*Fuente*

Formulario en pantalla

*Salida*

Lista de correos de notificación actualizada

*Destino*

N/A

*Acción*

Se debe mostrar, al administrador, la lista de correos registrados para recibir notificaciones y darle la opción de agregar nuevos, borrar o editar.

*Precondición*
N/A

*Postcondición*

N/A
Efecto secundario

Las notificaciones generadas por el sistema serán enviadas a todos los correos registrados

**Gestión de Salas**

*Función*

Administración de propiedades de las salas

*Descripción*

Se debe permitir la creación, edición y eliminación de las salas, así como de sus atributos 

*Entradas*

Nombre de la sala, capacidad de estudiantes y software disponible

*Fuente*

Administrador del sistema suministra los datos solicitados

*Salida*

Sala se agrega a salas disponibles

*Destino*

N/A

*Acción*

Se debe permitir, al administrador, crear, editar o eliminar las salas que serán programadas

*Precondición*

No se puede eliminar una sala que tiene reservas futuras

*Postcondición*

N/A

*Efecto secundario*
La nueva sala se agrega a las opciones del proceso de reserva


**Filtrar salas**

*Función*

De acuerdo a criterios de entrada obtener las salas adecuadas

*Descripción*

El usuario ingresa las fechas, horas, número de estudiantes y software solicitado para obtener las opciones viables

*Entradas*

*Fecha, hora, duración y software solicitado, número de estudiantes*

*Fuente*

El usuario llena la solicitud

*Salida*

Retorna las salas factibles y su calendario para la semana de la solicitud, la hora solicitada resaltada

*Destino*

Reserva de la sala

*Acción*

Conforme a las entradas del filtro se muestran las salas opcionadas, mostrando la hora seleccionada en la semana, y dando la opción de programar la reserva. Se puede solicitar la instalación de software adicional

*Precondición*

N/A

*Postcondición*

La reserva debe quedar en la hora y sala adecuada

*Efecto secundario*

El administrador recibe una notificación de la reserva, así como del software adicional solicitado

Version
----

1.0

Desarrolladores
-----------


* [E Hurtado] 
* [L Quiroga]

License
----

MIT

**Free Software, Hell Yeah!**

[L Quiroga]:http://twitter.com/luferquisa
