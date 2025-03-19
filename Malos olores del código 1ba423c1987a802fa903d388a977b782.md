# Malos olores del código

---

El siguiente texto es un resumen del capítulo 3 del libro [*Refactoring: Improving the Design of Existing Code*](https://github.com/maribvidal/Facultad/blob/main/Recursos/OO/OO_fowler_refactoring.pdf) y del [documento de Criterios y heurísticas de diseño de la cátedra de OO1](https://docs.google.com/document/d/1cLC1ElucX91k0rvhcFILJt7JzrsJcGKTYbs6AAMUNsU/edit?pli=1&tab=t.0#heading=h.s1rzkdyacobh).

- **Aclaración**: El libro denomina *campo* a cualquier nombre de una declaración, variable o clase, y *módulo* a cualquier estructura de datos (función, clase)

## Nombre Misterioso

- **Explicación**
    - Ocurre cuando no nos queda claro para qué sirve una variable o que hace una función
- **Solución**
    1. Si es una función —> **Change Function Declaration**
    2. Si es una variable —> **Rename Variable**
    3. Si es el nombre de una clase o un método —> **Rename Field**

## Código Repetido

- **Explicación**
    - Ocurre cuando ves el mismo fragmento de código en varios lugares
- **Solución**
    1. Si un fragmento de código se repite en varios métodos —> **Extract Function**
    2. Si un fragmento de código no es igual pero se parece a otro —> **Slide Statements**
    3. Si un método se repite en clases hermanas —> **Pull Up Method** 

## Método Largo

- **Solución**
    1. Si se pueden extraer partes de la función que tienen sentido —> **Extract Function**

## Lista Larga de Parámetros

- **Solución**
    1. Si se puede obtener un parámetro de otro —> **Replace Parameter with Query**
    2. Si varios parámetros corresponden a un objeto —> **Preserve Whole Object**
    3. Si varios parámetros siempre se pasan juntos —> **Introduce Parameter Object**
    4. Si un parámetro se usa para controlar lo que ocurra —> **Remove Flag Argument**

## Datos Globales

- **Explicación**
    - Ocurre cuando hay variables que pueden ser accedidas y modificadas desde cualquier lugar
- **Solución**
    1. Aplicar encapsulamiento —> **Encapsulate Variable**

## Datos Alterables (Mutable Data)

- **Explicación**
    - Ocurre cuando una variable se usa por razones diferentes o su acceso no está controlado
- **Solución**
    1. Para controlar el acceso —> **Encapsulate Variable**
    2. Si una variable se utiliza para guardar cosas diferentes —> **Split Variable**
    3. Si una variable se puede calcular en otro lugar —> **Replace Derived Variable with Query**

## Cambio Disonante (Divergent Change)

- **Explicación**
    - Ocurre cuando un módulo es cambiado de formas diferentes por razones diferentes
- **Solución**
    1. Si un fragmento de código está realizando dos cosas a la vez —> **Split Phase**
    2. Si hay mas comunicación entre las llamadas —> Crear módulos apropiados y **Move Function** para dividir el proceso
    3. Si dos funciones mezclan dos tipos de procesamiento dentro de sí —> **Extract Function**
    4. Si son clases —> *Extract Class*
    
    Faltan aclaraciones
    

## Arreglo Abarcativo (Shotgun Surgery)

- **Explicación**
    - Ocurre cuando una modificación en un lugar hace que tengas que cambiar pequeñitas cosas en varios lugares
- **Solución**
    1. Para reunir todos los cambio en un solo módulo —> **Move Function**, **Move Field**
    2. Si hay un monton de métodos operando sobre datos parecidos —> **Combine Functions into Class**
    3. Si hay métodos que transforman una estructura de datos —> **Combine Functions into Transform**
    4. Si los métodos en común pueden combinar sus resultados lógicamente —> **Split Phase** 

## Envidia de Atributos

- **Explicación**
    - Ocurre cuando un método de un objeto pasa mas tiempo comunicándose con métodos o datos de otros objetos en vez de repartir la tarea y delegarla
- **Solución**
    1. Si un método interactúa mucho con una variable/método —> **Move Function**
    2. Si es solo una parte del método la que produce la envidia —> **Extract Function**
    3. Como heurística, poner juntas las cosas que cambian juntas

## Acumulaciones de Datos (Data Clumps)

- **Explicación**
    - Ocurre cuando varios datos/campos suelen ser usados en los mismos lugares
- **Solución**
    1. Se podría crear un nuevo objeto que tenga los datos —> **Extract Class**
    2. Si varios parámetros frecuentemente o siempre van juntos —> **Introduce Parameter Object**, **Preserve Whole Object**

## Obsesión por los Primitivos

- **Explicación**
    - Ocurre cuando utilizamos un tipo primitivo para un objeto que en realidad necesita un tipo de dato mas sofisticado
- **Solución**
    1. Simplemente **Replace Primitive with Object**
    2. Si el primitivo se utiliza para controlar un switch statement o algo por el estilo —> **Replace Type Code with Subclasses, Replace Conditional with Polymorphism**
    3. Si los primitivos aparecen de a grupo —> **Extract Class**, **Introduce Parameter Object**

## Switch Statements

- **Explicación**
    - Ocurre cuando utilizamos una estructura de control por los msmos motivos en varios lugares. Quizás sea bueno aprovechar el polimorfismo
- **Solución**
    1. **Replace Conditional with Polymorphism**

## Reinventando la Rueda (Loops)

- **Explicación**
    - Ocurre cuando programo comportamiento que sospecho que ya está programado
- **Solución**
    1. **Replace Loop with Pipeline**

## Elemento Ocioso

- **Explicación**
    
    Ocurre cuando un módulo que creamos se utiliza poco
    
- **Solución**
    1. Si un método se utiliza poco y en uno o dos lugares —> **Inline Function**
    2. Si pasa lo mismo con una clase —> **Inline Class**
    3. Si una clase/interfaz de la jerarquía se utiliza poco o nada —> **Collapse Hierarchy**

## Generalidad Especulativa

- **Explicación**
    - Ocurre cuando controlamos casos especiales en nuestro código, o agregamos clases en la jerarquía tratando de adelantarnos a lo que pudiera ocurrir en el futuro
- **Solución**
    1. Si hay clases abstractas que no hacen mucho —> **Collapse Hierarchy**
    2. Si hay delegación innecesaria —> **Inline Function**, **Inline Class**
    3. Si un parámetro de un método no se utiliza —> **Change Function Declaration**
    4. Si el único uso de un módulo son casos de prueba —> **Remove Dead Code**

## Variables Temporales

- **Explicación**
    - Ocurre cuando una clase tiene variables que solo utiliza en casos especiales
- **Solución**
    1. Si son varias variables que tiene sentido que estén juntas —> **Extract Class**
    2. Si es una variable usada en un código condicional —> **Introduce Special Case**

## Cadenas de Mensajes

- **Explicación**
    - Ocurre cuando se forman cadenas de métodos largas
- **Solución**
    1. Si algún miembro de la cadena se puede encargar de una parte —> **Hide Delegate**
    2. Si se puede extraer una parte de la cadena —> **Extract Function**, **Move Function**

## Intermediario (Middle Man)

- **Explicación**
- **Solución**

## Acoplamiento Fuerte (Insider Trading)

- **Explicación**
- **Solución**

## Clase Larga

- **Explicación**
- **Solución**

## Clases Substitutas con Interfaces Diferentes

- **Explicación**
- **Solución**

## Clase Anémica

- **Explicación**
- **Solución**

## No quiero mi herencia (Refused Bequest)

- **Explicación**
- **Solución**

## Comentarios

- **Explicación**
- **Solución**