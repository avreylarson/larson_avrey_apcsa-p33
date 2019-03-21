public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		boolean dec = true;
		for(int i = 1; i < numArray.length - 1; i++) {
			if(numArray[i] <= numArray[i+1]) {
				dec = false;
				break;
			}
		}
		return dec;
	}	
}