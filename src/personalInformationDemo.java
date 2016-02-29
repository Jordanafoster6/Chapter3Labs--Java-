
public class personalInformationDemo {
	
	public static void main(String[] args) 
	{
		personalInformation p1 = new personalInformation();
		
		p1.setName("Jordan");
		p1.setAddress("61 Rebecca Drive");
		p1.setAge(21);
		p1.setPhone("618-420-3646");
		
		personalInformation p2 = new personalInformation();
		
		p2.setName("Ben");
		p2.setAddress("2336 Newhart");
		p2.setAge(20);
		p2.setPhone("618-610-8248");
		
		personalInformation p3 = new personalInformation();
		
		p3.setName("Jimmy");
		p3.setAddress("2552 Benton");
		p3.setAge(22);
		p3.setPhone("618-660-6768");
		
		System.out.println("----------------------------");
		System.out.println("Instance one");
		System.out.println("----------------------------");
		System.out.println("Name: " + p1.getName());
		System.out.println("Address: " + p1.getAddress());
		System.out.println("Age: " + p1.getAge());
		System.out.println("Phone Number: " + p1.getPhone());
		System.out.println("---------------------------- \n");
		
		System.out.println("----------------------------");
		System.out.println("Instance two");
		System.out.println("----------------------------");
		System.out.println("Name: " + p2.getName());
		System.out.println("Address: " + p2.getAddress());
		System.out.println("Age: " + p2.getAge());
		System.out.println("Phone Number: " + p2.getPhone());
		System.out.println("---------------------------- \n");
		
		System.out.println("----------------------------");
		System.out.println("Instance three");
		System.out.println("----------------------------");
		System.out.println("Name: " + p3.getName());
		System.out.println("Address: " + p3.getAddress());
		System.out.println("Age: " + p3.getAge());
		System.out.println("Phone Number: " + p3.getPhone());
		System.out.println("---------------------------- \n");
	}

}
