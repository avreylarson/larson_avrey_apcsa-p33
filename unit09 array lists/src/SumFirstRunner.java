import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{				
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		for (int i: new int[] {-99,1,2,3,4,5,6,7,8,9,10,5}) {
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {10,9,8,7,6,5,4,3,2,1,-99}) {
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
		
		for (int i: new int[] {10,20,30,40,50,-11818,40,30,20,10}) {
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
	}
}