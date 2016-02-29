
public class employeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee employee1 = new employee();
		
		employee1.setName("Susan Meyers");
		employee1.setIdNumber(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");
		
		employee employee2 = new employee();
		
		employee2.setName("Mark Jones");
		employee2.setIdNumber(39119);
		employee2.setDepartment("IT");
		employee2.setPosition("Programmer");
		
		employee employee3 = new employee();
		
		employee3.setName("Joy Rodgers");
		employee3.setIdNumber(81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
		
		
		System.out.println("Name          ID Number        Department          Position");
		System.out.println("----------------------------------------------------------------------");		
		System.out.println(employee1.getName() + "   " + employee1.getIdNumber() + "           " + employee1.getDepartment() + "          " + employee1.getPosition());
		System.out.println(employee2.getName() + "     " + employee2.getIdNumber() + "           " + employee2.getDepartment() + "                  " + employee2.getPosition());
		System.out.println(employee3.getName() + "    " + employee3.getIdNumber() + "           " + employee3.getDepartment() + "       " + employee3.getPosition());
		

	}

}
