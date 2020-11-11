package Sg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Avion avion  = Avion.SgAvion();
		avion.setModelo(21344);
		avion.setNumPasajeros(12);
		
		System.out.println("Primera llamada");
		System.out.println(avion.getModelo());
		System.out.println(avion.getNumPasajeros());
		Avion avion2  = Avion.SgAvion();
		
		System.out.println("Segunda llamada");
		System.out.println(avion2.getModelo());
		System.out.println(avion2.getNumPasajeros());
		
	}

}
