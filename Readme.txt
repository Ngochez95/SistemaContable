Alumno: Góchez Landaverde, Nelson Humberto. Carnet: GL15012
Sistemas Contables 2017-Ingeniero Ricardo Ayala
Explicación Sistema contable realizado en  lenguaje de programación JAVA
Pasos para abrir el proyecto en IDE netbeans.
Al descomprimir el archivo llamado sistemaContable se encontrará dentro de él una carpeta extra llamada librerias además del código fuente como el proyecto compilado "un .jar".
1)Abrir el proyecto en el IDE, surgirá un problema por dependencias de librerias, 
damos click en solventar problemas y nos ubicamos en la carpeta librerias que contiene el proyecto y las agregamos todas.
2)El sistema contable está diseñado con un menú vertical en el que se encuentran todas las capacidades con el que cuenta el proyecto.
***Esquema de menús y submenús.***
		*Catálogo de cuentas
			*Catálogo de cuentas
			*Ver catálogo de cuentas
		*Procesos contables
			*Procesamiento de partidas
		*Reportes
			*Libro diario
			*Libro Mayor
		*Respaldo
			*Generar respaldo
		*Salir
			*Salir del sistema de contabilida

***FUNCIONAMIENTO***
*Catálogo de cuentas
El formulario de catálogo de cuentas nos brinda la facilidad de poder ingresar nuevas cuentas, buscar cuentas, modificar cuentas ya creadas y también eliminarlas.
*Ver catálogo de cuentas
Brinda detalle de todas las cuentas con la que cuenta el catálogo de cuentas con sus respectivas dependencias padre.
*Procesamiento de partidas
Interfaz que proporciona la creación de libro diario y al mismo tiempo la genereación de las transacciones pertenecientes al libro diario
Pasos:
	1)Agregar la fecha 
	2)Seleccionar del comboBox la cuenta que será afectada en la transacción
	3)Seleccionar si la cuenta será cargada o abonada
	4)Selecionar el checkboox si la transaccion a realizar será de ajuste
	5)Ingresar el monto de la transacción
	6)Ingresar el concepto del libro diario
Cuando los cargos y los abonos al final de la tabla sean iguales podemos seleccionar el botón de grabar, ya que si nos cargos y los abonos difieren no se permitirá realizar dicha acción.
*Libro Diario
Genera un formulario con un componete llamado JDateChooser el cual es utilizado para pasar parámetros al reporte creado en Jasper Studio. Los cuales son FechaInical y FechaFinal
*Generación de Respaldo
Se genera una intefaz la cual nos mapea la base de datos y nos brinda las tablas que ella contiene, para generar un respaldo primero tenemos que seleccionar el tipo de respaldo ya sea parcial o total. luego buscamos el directorio en el cual deseamos almacenar el archivo y agregamos su respectivo nombre
brindamos el fomato de salida del respaldo el cual puede ser .sql o .backup
Seleccionamos todas las tablas que deseamos respaldar y se habilitará el botón de respaldar damos click y el respaldo se genera.
Si se desea montar el respaldo de nuevo tendremos que generar primero un respaldo .backup y luego montarlo al dar click en el botón respaldar.





