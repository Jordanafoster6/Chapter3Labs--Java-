
public class circle {

	private double radius;
	private final double PI = 3.14159;

	public circle()
	{
		
	}
	public circle(double r)
	{
		radius = r;
	}
	
	public void setRadius(double rad)
	{
		radius = rad;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return PI * radius * radius;
	}
	public double getDiameter()
	{
		return radius * 2;
	}
	public double getCircumference()
	{
		return 2 * PI * radius;
	}
	
	
	
}
