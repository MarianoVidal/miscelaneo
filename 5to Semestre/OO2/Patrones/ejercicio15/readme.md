# Ejercicio 15: Armado de PCs
## Solución propuesta
![Diagrama UML](./diag_uml.png)
[Código UML](./source.uml)
### Notas
- Como lo veo, en este ejercicio hay que aplicar tanto el patrón Builder, para construir las diferentes configuraciones de PCs y facilitar que se puedan crear otras configuraciones, y el patrón Composite, ya que el GabineteGamer puede contener componentes dentro suyo y es, a su vez, un Componente
- ¿Los gabinetes tendrían todos varios componentes, osea serían Composites, o solo es el GabineteGamer? En cualquier caso queda rara la jerarquía
- 
