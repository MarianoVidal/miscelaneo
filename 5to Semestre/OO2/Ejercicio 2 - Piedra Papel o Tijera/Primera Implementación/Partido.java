package unlp.oo2.ejercicio2;

// Esto no me gusta un choto

public class Partida {
	public String jugarPartida(Piedra opcion1, Piedra opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Piedra opcion1, Papel opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Papel opcion1, Papel opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Papel opcion1, Tijera opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Tijera opcion1, Tijera opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Tijera opcion1, Papel opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Tijera opcion1, Piedra opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Piedra opcion1, Tijera opcion2) {
		return opcion1.juegoContra(opcion2);
	}
	public String jugarPartida(Papel opcion1, Piedra opcion2) {
		return opcion1.juegoContra(opcion2);
	}
}
