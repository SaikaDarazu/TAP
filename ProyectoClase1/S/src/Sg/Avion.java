package Sg;

public class Avion {
	

	private int  modelo;
	private int numPasajeros;

	static Avion avion;
	private Avion() {
		super();
	}
	
	public static Avion SgAvion(){
		if (avion == null) {
			avion = new Avion();
		}
		return avion;
	}
	
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	
	

}
