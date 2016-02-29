
public class widgetPlant {

	private int numberOfWidgets;
	private double daysToProduce;
	
	public void setWidgetNumber(int w)
	{
		numberOfWidgets = w;
	}
	public double getWidgetNumber()
	{
		return numberOfWidgets;
	}
	public double daysOfProduction()
	{
		double hoursPerDay = 16;
		double widgetsPerHour = 10;
		
		daysToProduce = (double) ((numberOfWidgets / widgetsPerHour) / hoursPerDay);
		return daysToProduce;
		
	}
	
}
