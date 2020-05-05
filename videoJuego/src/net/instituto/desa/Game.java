package net.instituto.desa;

public class Game {
	static final String ABAJO = "Abajo";
	static final String ARRIBA = "Arriba";
	static final String IZQUIERDA = "Izquierda";
	static final String DERECHA = "Derecha";
	Jugador j;
	
	public void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			j.moverDerecha();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			j.moverIzquierda();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			j.moverArriba();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			j.moverAbajo();
		}
	}
}
