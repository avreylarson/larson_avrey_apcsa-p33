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
		int iffer = 0;
		int iffer1=0;
		
		
		for (int i = 1; i <= amount; i++)   //ROW
		{	
			
			for (int j = amount; j >= i; j--) //COLUMN
			{
				
					y = (char) (letter + (char) (amount - j)); 
					iffer = (int)y;
					if(iffer<65 || iffer>90)
								{iffer = 65+iffer1;
								y = (char)iffer; }
				
				
				
				for (int k = 1; k <= j; k++) //CHAR PRINT IN EACH ROWXCOL
				{
					
					s = s + y;
				}
				if (y == 'A')
				{iffer1 +=1; }
				s = s + " ";
				
				
				
							
				
			}
			s=s+"\n";
			iffer1=0;
			
					
		}	
		
	

		
		return s;
	}
}