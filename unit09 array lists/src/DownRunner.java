import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{					
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		for (int i: new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}) {
			ray.add(i);
		}
		System.out.println(ListDown.go(ray));
		System.out.println(ListDown.go(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99)));
		System.out.println(ListDown.go(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10)));
		System.out.println(ListDown.go(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455)));
	}
}