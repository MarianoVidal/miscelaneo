# Ejercicio 1: SingleThreadTCPFramework
## Punto ii)
- De las cuatro alternativas, yo solo consideraría la segunda y la cuarta.
- La primera alternativa es la mas fácil y rápida de implementar, pero a su vez, también es la mas inflexible, ya que no permite que se evaluen varias palabras, y que si se tiene que modificar el método o la variable haya que tener cuidado con mantener las referencias.
- La tercera es menos limitante, porque se podrían implementar mas cosas como, por ejemplo, recibir una palabra en base a un algoritmo, o al azar, o una palabra que ingrese el usuario, pero la desventaja de ser solo una palabra en el momento sigue estando.
- Las otras dos soluciones, en cambio, permiten verificar mas de una palabra a la vez, y dep aso permiten modularizar y delegar la implementación de este chequeo.
- La cuarta es mejor que la otra en el sentidode que permite ncapsular, intercambiar algoritmos de evaluación en tiempo de ejecución, y simplificar o eliminar la lógica condiconal, mientras que para la otra siempre va a hacer falta volver al mismo lugar en el código par agregar, modificar, o eliminar un chequeo.
- Sin embargo, para el caso del ServidorTCP siento que elegir la cuarta opcion es esforzarse de más, además, en cualquier caso, el desarrollador siempre tine la opción de crear otro método y aplicar el patrón Strategy.
## Solución propuesta
![Diagrama UML](./diag_uml.png)<br>
[Código UML](./source.uml)
### Notas
-
- 
