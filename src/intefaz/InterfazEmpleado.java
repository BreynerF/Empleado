package intefaz;

import mundo.Empleado;
public class InterfazEmpleado {

	public static void main(String[] args) 
	{
		Empleado empleado1;
		
		empleado1 = new Empleado( "Breyner", 111262477, "Cra 3 # 14 - 59", 
				1500000.0, 8.0);
		
		System.out.println( empleado1.getNombre( ) );
		System.out.println( empleado1.getCedula( ) );
		System.out.println( empleado1.getDireccion( ) );
		System.out.println( empleado1.getSalarioBase( ) );
		System.out.println( empleado1.getPorcentajeRetencion( ) );
	}

}
