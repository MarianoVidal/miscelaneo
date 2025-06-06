# Ejercicio 16: Filtro de imagenes
## Inciso A
![Diagrama UML 1](./diag_uml_1.png)<br>
[Código UML 1](./source1.uml)
### Notas
- Se puede ver que la librería adopta el patrón Strategy para encapsular los algoritmos de sus filtros.
- Lo que se hace desde la clase PNGFilterLauncher es:
- - Crear un Map y colocar dentro referencias a objetos que representan diferentes filtros
  - Pedir que el usuario le envíe al programa como argumento la ubicación de la imagen input, output, y los filtros deseados
  - Procesar los argumentos recibidos y agregar a la lista _activeFilters_ los filtros solicitados por el usuario
  - Leer la imagen desde la ubicación (comprobar si es válida)
  - Procesar la imagen para que sea transformable desde el programa
  - Aplicarle los filtros a la imagen, recorriendo la lista de filtros activos y aplicando uno por uno
  - Guardar la imagen final en la ubicación declarada
- a. Si, se distingue, pero la implementación no es la mas óptima. En este caso no hay mucho problema porque el orden de los filtros se mantiene cuando se pasan como argumentos para el programa, pero si se quisiera implementar esto mismo en una red social, tendría que replantearse el diseño
- b. Creo que sí.
- c. El único olor que encuentro es que las estrategias piden como parámetro la imagen en vez de la clase que hace el rol de Contexto en este sistema, el PNGFilterLauncher. Esto indica que quizás se tenga que utilizar el patrón Decorator.
## Inciso B
![Diagrama UML 2](./diag_uml_2.png)<br>
[Código UML 2](./source2.uml)
### Notas
- Se utiliza el patrón Decorator.
- a. Si, se distingue, aunque no hay ningún DecoradorConcreto
- b. Creo que sí.
## Inciso C
![Diagrama UML 3](./diag_uml_3.png)<br>
[Código UML 3](./source3.uml)
### Notas
- Se debe encontrar una forma de armar una secuencia de filtros de manera que se respeten las reglas dadas.
- Esto se podría controlar en tiempo de ejecución con estructuras de control, pero más fácil podría ser utilizar el patrón Builder y controlar la construcción de las secuencias de filtros de uno u otro tipo.
- El patrón Builder no siento que se haya aplicado de manera correcta o completa, porque los únicos pasos que comparten ambos constructores son el final, el de construcción de la secuencia. Pero encapsular y separar el proceso de construcción de una secuencia, y generalizar o reutilizar el comportamiento que se reusa es un beneficio.
- Podría declarar todos los métodos en la interfaz y pedir que se implementen en ambos constructores, así aumentaría la transparencia, pero habrían muchos métodos vacíos y siento que es mas de lo que se pide para el ejercicio.
- Para consultar: ¿Está bien planteada la solución?
