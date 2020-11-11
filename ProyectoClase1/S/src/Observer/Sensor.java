package Observer;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Sensor {
	//Variable auxiliar para un contador
	private int x = 0;
	
	
	ArrayList<PantallaObserver> observers;
	static double temperatura = 0;
	
	public Sensor() {
		super();
		observers = new ArrayList<>();
	}
	//Encendemos el sensor generando numeros aleatorios por 10 iteraciones.
	public void encender() throws InterruptedException {
		do{
			actualizarTemperatura();		
		x = x+1;
		TimeUnit.SECONDS.sleep(1);
	}while(x<10);
	}
	
	//Get y sets de observadores
	public ArrayList<PantallaObserver> getObservers() {
		return observers;
	}

	public void setObservers(PantallaObserver o) {
		this.observers.add(o);
	}

	private double generarRandom(){
		
	    double x = (Math.random()*((60-15)+1))+15;
	
	    return x;
	
	}
	
	private double detectarTemperatura()
	{
		return generarRandom();
	}
	//Cada vez que se detecta una temperatura se llama,
	//si la temperatura es distinta a la anterior realiza una update
	
	private void actualizarTemperatura() {
		
		if(temperatura!=detectarTemperatura()) {
			temperatura = detectarTemperatura();
			notificarObserver();
			
		}
	}
	
	public void notificarObserver() {
		
		for (PantallaObserver o : observers) {
			o.update();
			
		}
	}
	
	
}
