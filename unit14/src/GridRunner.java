import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid finder = new Grid(20, 20, "abcdefghijklmnopqrstuvwxyz123456789".split(""));
		System.out.println(finder);
		System.out.println(finder.findMax("abcdefghijklmnopqrstuvwxyz123456789".split("")));
	}
}