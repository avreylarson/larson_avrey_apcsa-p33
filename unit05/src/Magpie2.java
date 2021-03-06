/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hey, let's have a conversation!";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
		if (statement.length() < 1)
		{
			response = "Please say something.";
		}
		else if (statement.indexOf("UCLA") >= 0
				|| statement.indexOf("USC") >= 0
				|| statement.indexOf("Harvard") >= 0
				|| statement.indexOf("Princeton") >= 0)
		{
			response = "Tell me more about your top colleges.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
	
		else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
	    {
	      response = "Tell me more about your pets.";
	    }
	    else if (statement.indexOf("CompSci") >= 0)
	    {
	      response = "CompSci might be the greatest subject of all time.";
	    }
	    else if (statement.indexOf("hi") >= 0 || statement.indexOf("welcome") >= 0 || statement.indexOf("hello") >= 0)
	    {
	      response = "Hi person";
	    }
	    else if (statement.indexOf("fun") >= 0 || statement.indexOf("life") >= 0)
	    {
	      response = "That is just great";
	    }
	    else if (statement.indexOf("fight on") >= 0 || statement.indexOf("go trojans") >= 0 || statement.indexOf("beat ND") >=0 || statement.indexOf("we run LA") >= 0)
	    {
	      response = "fight on baby!!";
	    }
	    else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
		    response = "You cannot be serious.";
		}
		else if (whichResponse == 5)
		{
			response = "That is amazing.";
		}

		return response;
	}
}
