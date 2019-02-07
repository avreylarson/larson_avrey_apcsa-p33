//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner (in); 
		int x1, x2, y1, y2;
		
		for (int i=0; i<=3; i++) {
			out.print("Please enter X1: ");
			x1 = keyboard.nextInt(); 
			
			out.print("Please enter Y1: ");
			y1 = keyboard.nextInt(); 
			
			out.print("Please enter X2: ");
			x2 = keyboard.nextInt(); 
			
			out.print("Please enter Y2: ");
			y2 = keyboard.nextInt(); 
			
			Distance trial = new Distance();
			trial.calcDistance();
			trial.print();
			
		}
		
			
	}
}