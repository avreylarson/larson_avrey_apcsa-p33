import static java.lang.System.*;

import java.util.Scanner;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setAmount(0);
		setLetter(' ');
	}

	public TriangleFive(char c, int amt)
	{
		setAmount(amt);
		setLetter(c);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{	
		
	    String s = "";
		char y = ' ';
		int usc = 0;
		int fighton=0;
		
		
		for (int i = 1; i <= amount; i++)   //ROW
		{	
			
			for (int j = amount; j >= i; j--) //COLUMN
			{
				
					y = (char) (letter + (char) (amount - j)); 
					usc = (int)y;
					if(usc<65 || usc>90)
								{usc = 65+fighton;
								y = (char)usc; }
				
				
				
				for (int k = 1; k <= j; k++) //CHAR PRINT IN EACH ROWXCOL
				{
					
					s = s + y;
				}
				if (y == 'A')
				{fighton +=1; }
				s = s + " ";
				
				
				
							
				
			}
			s=s+"\n";
			fighton=0;
			
					
		}	
		
	

		
		return s;
	}
}