import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd_index = 0;
		boolean odd_found = false;
		int even_index = 0;
		for (int i = 0; i < ray.size(); i++) {
			if (ray.get(i)%2 == 1 && !odd_found) {
				odd_index = i;
				odd_found = true;
			}
			else if (ray.get(i)%2 == 0 && odd_found) {
				even_index = i;
			}
		}
		if (!odd_found || even_index == 0) {
			return -1;
		}
		else {
			return even_index - odd_index;
		}
	}
}