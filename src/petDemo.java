import java.util.Scanner;

public class petDemo {
	
	public static void main(String[] args) 
	{

		Scanner keyboard = new Scanner(System.in);
		pet pet1 = new pet();
		
		System.out.print("Enter the name of your pet.");
		pet1.setName(keyboard.nextLine());
		
		System.out.print("Enter the type of pet you have.");
		pet1.setType(keyboard.nextLine());
		
		System.out.print("Enter the age of your pet.");
		pet1.setAge(keyboard.nextInt());
		
		System.out.println("----------------------------");
		System.out.printf("Pet Name: %s \n", pet1.getName());
		System.out.printf("Pet Type: %s \n", pet1.getType());
		System.out.printf("Pet Age: %d \n", pet1.getAge());
		System.out.println("----------------------------");
		
	
	}
	
}
