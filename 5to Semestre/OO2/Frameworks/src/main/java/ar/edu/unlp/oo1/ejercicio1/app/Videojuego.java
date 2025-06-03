public class Videojuego {

    public Personaje personajeConMasDaño() {
        return this.personajes.stream()
            .max(
            		(p1, p2) -> Int.compare(a1.calcularDaño(), a2.calcularDaño))
            	)
            ).orElse(null);
    }


    public void imprimirInfo(Personaje p) {
        System.out.println(p.getNombre() + " tiene como daño " + p.getDaño());
        
        // CODE SMELL: Feature Envy, Switch Statement
        // REFACTORING: 
        
        if (p.getTipoAtaque().getClass() == AtaqueHechizo.class) {
            System.out.println("Ataque tipo hechizo");
            System.out.println("Este ataque dobla tu fuerza");
        } else {
            System.out.println("Ataque tipo Ataque Básico");
            System.out.println("Este ataque mantiene tu fuerza");
        }
    }
}