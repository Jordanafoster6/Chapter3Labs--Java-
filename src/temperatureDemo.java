import java.util.Scanner;

public class temperatureDemo {

	public static void main(String[] args) 
	{
		
		temperature t1 = new temperature(100);
		
		System.out.println("----------------------------");
		System.out.printf("Fahrenheit: %.2f \n", t1.getFahrenheit());
		System.out.println("----------------------------");
		System.out.printf("Celcius: %.2f \n", t1.getCelcius());
		System.out.printf("Kelvin: %.2f \n", t1.getKelvin());
		System.out.println("---------------------------- \n");
		
		
	}
	
}
