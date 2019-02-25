//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = ' ';
		char loop = ' ';
		
		do {
			
			out.println("Rock-Paper-Sissors - pick your weapon[R,P,S]:: ");
			RockPaperScissors test = new RockPaperScissors(keyboard.next());
			out.println(test.toString());
			out.println(test.determineWinner() + "\n" );
			out.println("The game is over! Do you want to play again? (y or n)");
			loop = keyboard.next().charAt(0);
			
			
		}
		while(loop == 'y');		
		
	
	}
}

