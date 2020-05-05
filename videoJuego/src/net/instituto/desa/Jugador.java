package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	public void moverDerecha() {
		this.x++;
	}
	
	public void moverIzquierda() {
		this.x--;
	}
	
	public void moverArriba() {
		this.y--;
	}
	
	public void moverAbajo() {
		this.y++;
	}
	
}
