
public class temperature {

	private double ftemp, c, k;
	
	public temperature()
	{
		
	}
	public temperature (double temp)
	{
		ftemp = temp;
	}
	
	public void setFahrenheit(double temp)
	{
		ftemp = temp;
	}
	public double getFahrenheit()
	{
		return ftemp;
	}
	
	public double getCelcius()
	{
		c = (5.0 / 9.0) * (ftemp - 32.0);
		return c;
	}
	public double getKelvin()
	{
		k = ((5.0 / 9.0) * (ftemp - 32.0)) + 273.0;
		return k;
	}
	
}
