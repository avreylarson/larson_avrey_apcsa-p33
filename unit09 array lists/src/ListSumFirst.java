//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int count = 0;
		boolean count_exists = false;
		for (int i = 1; i < ray.size(); i++) {
			if (ray.get(i) > ray.get(0)) {
				count += ray.get(i);
				count_exists = true;
			}
		}
		if (!count_exists) {
			return -1;
		}
		return count;
	}
}

	