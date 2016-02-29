
public class carDemo {

	public static void main(String[] args) {
		car c1 = new car(2015, "Koenigsegg Agera R");
		
		c1.accelerate();
		c1.accelerate();
		c1.accelerate();
		c1.accelerate();
		c1.accelerate();
		
		System.out.println("The current speed of the " + c1.getMake() + " is " + c1.getSpeed() + "mph." );
		
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		
		System.out.println("The current speed of the " + c1.getMake() + " is " + c1.getSpeed() + "mph." );
	}
}
