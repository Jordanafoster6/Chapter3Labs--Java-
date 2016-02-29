import java.util.Scanner;

public class widgetPlantDemo {

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		widgetPlant plant1 = new widgetPlant();
		
		System.out.print("Enter how many widgets need to be produced.");
		plant1.setWidgetNumber(keyboard.nextInt());
		
		System.out.println("The number of days needed to produce " + plant1.getWidgetNumber() + " widgets is: " + plant1.daysOfProduction() + " day(s).");
		
		
	}
	
}
