public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow adder = new TotalRow();
		int[][] list1 = {{1,2,3},{5,5,5,5}};
		int[][] list2 = {{1,2,3},{5},{1},{2,2}};
		int[][] list3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		
		System.out.println("Row totals are :: " + adder.getRowTotals(list1));
		System.out.println("Row totals are :: " + adder.getRowTotals(list2));
		System.out.println("Row totals are :: " + adder.getRowTotals(list3));
		
		//add code here			
	}
}