public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int distance=0;
		
		for (int i=0;i<1;i++)
		{
			if ((ray[i]%2) != 0)
			{ 
				
				for (int j=i;j<ray.length;j++)
				{
					if ((ray[j]%2)!=0)
					{
						distance++;
					}
					else
						return distance;
				}
				
			}
			
			
			if ((ray[i]%2) == 0)
			{ 
				
				for (int j=i;j<ray.length;j++)
				{
					if ((ray[j]%2)!=0)
					{
						distance++;
					}
					else
						return distance;
				}
				
			}
			
		
		}
			   
		
		return -1;
		
	}
}