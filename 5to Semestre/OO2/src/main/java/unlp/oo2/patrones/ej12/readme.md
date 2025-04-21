# Ejercicio 12: FileSystem
## Solución propuesta
![Diagrama UML](./diag_uml.png)
[Código UML](./source.uml) (Generado con Gemini)
### Notas
- Hay que usar el patrón Composite
- No creo que haya que controlar la adición de unidades a un Directorio, ya que un directorio puede contener directorios vacíos dentro. Lo qu sí habría que evitar es que un directorio se llegue a contener a si mismo
- No sé si haga falta meter funcionalidad para que se pueda crear archivos dentro de los directorios, pero por las dudas lo hago
- Tuve que definir métodos en común, tanto para las Hojas como para los Compuestos, que no tenían mucho sentido en las hojas, pero que eran necesarios para poder hacer algunas funciones que se piden.
