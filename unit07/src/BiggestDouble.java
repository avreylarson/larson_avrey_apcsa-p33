//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		setDoubles(0,0,0,0);
	
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	
	}

	public void setDoubles(double a, double b, double c, double d)
	{
				one=a;
				two=b;
				three=c;
				four=d;
				
	}

	public double getBiggest()
	{

		  return Math.max(Math.max(Math.max(one, two), three), four);
		
	}

	public String toString()
	{
	   return "biggest = "+ getBiggest();
	}
}