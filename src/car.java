
public class car {

	private int yearModel;
	private String make;
	private int speed;
	
	public int getYearModel()
	{
		return yearModel;
	}
	public String getMake()
	{
		return make;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	public car()
	{
		
	}
	public car(int mod, String m)
	{
		yearModel = mod;
		make = m;
		speed = 0;
	}
	public void accelerate()
	{
		speed += 5;
	}
	public void brake()
	{
		speed -= 5;
	}
}
