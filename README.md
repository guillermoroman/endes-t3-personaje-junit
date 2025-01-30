# Pruebas Unitarias - solucion.Personaje

Se desea desarrollar una clase en Java que represente a un personaje dentro de un videojuego de rol. Este personaje tendrá un nombre, una cantidad de salud y un nivel de experiencia que determinará su nivel en el juego.

Atributos:
- nombre (String)
- salud (int)
- experiencia (int) 

Acciones:
1. `recibirDaño`: El personaje puede recibir una cantidad de daño que reduce su salud. Si la salud alcanza 0 o un valor negativo, consideraremos que el personaje ha muerto. La misión del método es simplemente actualizar la salud del personaje registrando el daño si este es mayor o igual a cero.
2. `ganarExperiencia`: El personaje puede ganar puntos de experiencia, los cuales determinan su nivel en el juego. Este método tomará un número entero que sumará al atributo experiencia
3. `calcularNivel`: El nivel del personaje se calcula dividiendo su experiencia entre 100 y sumando 1. Este método no recibe argumentos, pero devuelve un número entero.
4. `estavivo`: Un personaje está vivo si su salud es mayor que 0. Este método no recibe argumentos y devuelve un valor booleano.
5. `imprimirNivel`: Muestra en pantalla el nivel actual del personaje con el mensaje: "El nivel actual del personaje " + nombre + " es: " + calcularNivel()


## **Actividades a realizar**
Para garantizar el correcto funcionamiento de la clase `Personaje`, se requiere realizar pruebas basadas en clases de equivalencia y valores límite. Se pude codificar la clase `Personaje` antes de organizar las pruebas o después.

### **1. Completar la tabla de clases de equivalencia**
Para cada uno de los métodos de la clase, identifica los valores de entrada válidos e inválidos y completa la tabla.


### **2. Completar la tabla de casos de prueba**
Planifica los casos de prueba necesarios para probar, al menos, todas las particiones de equivalencia y los valores límite.

### **3. Codificar las pruebas unitarias**
Utilizando JUnit, codifica las pruebas unitarias planeadas.

### **4. Implementa la clase Personaje**
Si decides codificar la clase al final, estarás utilizando la metodologías TDD (Test Driven Development) o desarrollo guiado por pruebas. Te será más cómodo en tal caso declarar la clase, así como sus métodos y dejar la implementación para el final. De esta forma no tendrás mensajes de errror al hacer llamadas a la clase y sus métodos.

