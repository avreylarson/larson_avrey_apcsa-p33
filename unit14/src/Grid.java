public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int i = 0; i<rows; i++)
			for (int j = 0; j<cols; j++)
				grid[i][j] = vals[(int)(Math.random()*vals.length)];
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = "";
		for (String find : vals)
			if (countVals(find) > countVals(max)) 
				max = find;
		return max + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int mathcount = 0;
		for (String[] rows : grid) for (String r : rows)
				if (r.equals(val)) 
					mathcount++;
		return mathcount;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (String[] rows : grid) {
			for (String r : rows) output+=r + " ";
			output+="\n";
		}
		return output;
	}
}