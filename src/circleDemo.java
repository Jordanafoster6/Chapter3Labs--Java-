import java.util.Scanner;

public class circleDemo {

	public static void main(String[] args) 
	{
	
		Scanner keyboard = new Scanner(System.in);
		circle c1 = new circle();
		
		System.out.print("Enter the radius of your circle.");
		c1.setRadius(keyboard.nextDouble());
		
		System.out.println("----------------------------");
		System.out.printf("Radius: %.2f \n", c1.getRadius());
		System.out.println("----------------------------");
		System.out.printf("Area: %.2f \n", c1.getArea());
		System.out.printf("Diameter: %.2f \n", c1.getDiameter());
		System.out.printf("Circumference: %.2f \n", c1.getCircumference());
		System.out.println("----------------------------");

		
		
	}
	
}
