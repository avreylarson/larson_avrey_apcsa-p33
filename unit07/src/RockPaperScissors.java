import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String humanChoice;
	private String computerChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		
		
		setPlayers(player);
		
	}

	public void setPlayers(String player)
	{
		
		int choice = (int)(Math.random()*3);
		switch(choice) {
		
		case 0 : computerChoice = "R"; 
							break;
		case 1 : computerChoice = "P"; 
							break;
		case 2 : computerChoice = "S";
							break;
		}
		humanChoice = player.toUpperCase();
	}

	public String determineWinner()
	{
		String winner="";
		if (computerChoice.equals(humanChoice))
	{
			winner = "!Draw Game!";
		
	}
		else if (computerChoice.equals("R"))
		{
			if (humanChoice.equals("P"))
			{
			winner = "! Player wins <<Paper Covers Rock>>!";
			}
			else if (humanChoice.equals("S"))
			{
				winner = "! Computer wins <<Rock Breaks Scissors>>!";
			}
	}
	else if (computerChoice.equals("P"))
	{
		if (humanChoice.equals("S"))
		{
				winner = "! Player wins <<Scissors Cuts Paper>>!";
		}
		else if (humanChoice.equals("R"))
		{
			winner = "! Computer wins <<Paper Covers Rocks>>!";
		}
	}
	else if (computerChoice.equals("S"))
	{
		if (humanChoice.equals("R"))
		{
				winner = "! Player wins <<Rock Breaks Scissors>>!";
		}
		else if (humanChoice.equals("P"))
		{
			winner = "! Computer wins <<Scissors Cuts Paper>>!";
		}
	}
		return winner;
}
	

	public String toString()
	{
		
		return "Player had " + humanChoice + "\n"+ "Computer had " + computerChoice;
	}
}