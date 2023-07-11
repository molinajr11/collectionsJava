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
- Las listas tienen un index y un valor que es un object.
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
# ArrayList
ArrayList array= new ArrayList<>(); Delcaracion que recibira hetereogeneous data.
ArrayList<Integer>numbers=new ArrayList<Integer>(); Declaracion con un tipo definido de dato.
Inicial size 10 elements.

# ArrayList vs List
list es una interface.
ArrayList list es una implementacion de la interface list.
cuando declaramos List<String> ejemplo= new ArrayList<String>(); decimos que el tipo de variable de referencia es de tipo list y que podemos cabiar despues este tipo de implementacion haciendolo flexible.
Sin embargo si hay casos que es necesario declarar la variable de referencia como implementacion 
ArrayList <String> ejemplo = new ArrayList<String>(); porque hay metodos que solo tiene esa implementacion.

# Liked list
- Las linked cada objeto se guarda en un espacio de memoria y se llaman nodos. los nodos pueden interactuar entre si sin importar el orden.
- Las linked list al ser una implementacion de List(I) tiene los metodos de list de array list y tambien 
puede utilizar los metodos le Queque(I).
- Cada nodo tiene tres partes [elemento previo][elemento][sigiente elemento].
- Se puede agregar toda una coleccion de tipo list(I) en como un nodo en un linked list. addAll(collection).
Se prefiere usar el array list cuando se busca hacer mas operaciones de obtener data porque en el linked list
es mas demorado ya que el va nodo por nodo buscando el elemento que se necesita.
Se prefiere usar el LinkedList cuando se desea insertar o borra data por que es mas rapido y mas eficiente.

# HashSet Set(I)
- No permite elementos duplicados.
3- No concerva el orden de insercion.
- HashCode // es la forma en que se guarda la información en memoria.
- Permite hetereogeneous data.
- Permite guardar null.
- inicial size 16 elements.
Es conveniete implementar esta coleccion cuando la mayoria de operaciones son de busqueda.
- Tiene load Factor es un porcentaje del 70% que se usa para inidicar cuando agregar mas espacio en un hashSet
este valor puede ser personalizado igual que el tañano del hashSet mediante el constructor.

# Linked-HashSet
- La unica diferencia con el hashSet es que conserva el orden de insercion de los datos.

# Queue (I) fifo
- primero en entrar primero en salir 
- contiene las clases priority Queue y Linked-List por eso linked-List puede usarse como un queue.
- contiene las interfaces Dequeue, ArrayDeque
# priority Queue.
- Conserva el orden de insercion de los datos.
- permite elementos duplicados.
- Solo permite datos homogeneos.
metodos:
- add() retrun true/exeption. offer() retrun true/null.
- element ()  true/exeption. peek() retrun true/null.
- remove () true/exeption. poll() retrun true/null.

# HashMap (c)
Es muy util y optimo cuando se desean hacer operaciones de busqueda.
- seguarda en memoria con o hasTable.
- el orden de ingreos no es preservado.
- No permite guardar valores duplicados en la llave.
- Permite valores duplicados en el objeto.
- Permite llave de valor null pero solo una en toda la colleccion.
- Permite varios valores null como objetos.
Metodos:
- put(Key,value) agrega datos.
- putAll(map m) agrega otro map.
- get(key) retorna el valror.
- remove(key) retorna el valor.
- containKey(key) retorna true of false.
- containValue (Value) retorna true or false.
- isEmpty() verifica si el map esta vacio retorna true or false.
- size() tamaño del map.
- clear () limpia todo el mapa.
- keySet() retorna todas las llaves del map. Set porque no permite llaves duplicadas.
- values() retorna todos los valores del mapa.
- entrySet() retorna la llave y el valor del mapa uno por uno.
# Entry interface es una implementacion de hashMap (i).
Es usada para usar cada par o entry del hasMap.
- metodos.
getValue().
setValue(object).
