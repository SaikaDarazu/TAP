package Observer;
import java.text.DecimalFormat;
public class Pantalla implements PantallaObserver{

	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public Pantalla() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("La Temperatura es: "+df2.format(Sensor.temperatura)+" grados");
	}
	
	
}
