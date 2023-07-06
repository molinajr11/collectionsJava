# collectionsJava
# Que es una coleccion 
Es un conjunto de objetos representados en una entidad.
El ARRAY es una colecion pero tiene problemas que solo permite guardar entidades de un solo tipo.
int a []= new [5]; todos los elementos seran de tipo int.
# Array tipo object: 
Permite guardar multiples tipos de objetos string , number , double , pero tiene problemas como
- tamaño limitado de cantidad de datos
- si no se llena el array los demas espacios declarados seran desperdicio.
- Los metodos de array definidos no estaran disponibles no son compatibles.
- es homogeneo Perteneciente o relativo a un mismo género, poseedor de iguales caracteres
# Collections Framework ventajas
- Es escalable en tiempo de ejecucion.
- permite data homogenea y hetereogenea.
- implementacion de estructura de datos. acceso a metodos ya definidos por el lenguaje.
# interface Collection root
Es la raiz de las colecciones en java que da operaciones basicas como eliminar, agregar, buscar,
recorrer. entre otros.
Es un conjunto comun de metodos para trabajar con colecciones tambien es la base para otras interfaces y clases
permite operar sobre colecciones de forma generica permitiendo flexibilidad y reutilizacion.
# Collections java.util package.
Es la clase de java que contiene diferentes metodos para usar con los objetos collection como arrayList,HashSet
TreeSet...
# List interface:
Es una interface hija de collection 
- concerva el orden enque se ingresan los datos a la lista.
-  tambien permite elementos duplicados esta interface tiene como clases:
- ArrayList.
- Linked list.
- stack -> and vector.
# Set interface:
- Es otra interface hija de collections
- no concerva el otrden de insercion
- no permite elementos duplicados
y tiene como clases 
- HashSet.
- LinkedHashSet.
# Queue interface
- Interface hija de collections
- Fifo (First in first out)
- prioridad para procesar datos.
# Map interface.
- No pertenece a la clase Collections.
- Permite guardar elementos con una llave (objeto) y un valor(objeto)
- La llave no puede ser duplicada. Debe ser unica.
- El valor si puede ser duplicado.
- Contiene las clases HashMap,LinkedHashMap y HashTable.
