package Observer;

public class Pantalla2 implements PantallaObserver{
	
	public Pantalla2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(Sensor.temperatura>=20) {
			
		System.out.println("Hace Calor");
		}else {
			System.out.println("Hace Fresco");
		}
	}



}