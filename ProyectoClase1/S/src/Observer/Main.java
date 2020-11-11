package Observer;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Pantalla pantalla = new Pantalla();
		Pantalla2 pantalla2 = new Pantalla2();
		
		Sensor sensor = new Sensor();
		sensor.setObservers(pantalla);
		sensor.setObservers(pantalla2);
		sensor.encender();
		


}}
