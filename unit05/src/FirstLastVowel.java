//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String beginning = a.substring(0, 1);
	   String finish = a.substring(a.length()-1, a.length());
	   
	   if(finish.indexOf("aeiouAEIOU") == -1 || beginning.indexOf("aeiouAEIOU") == -1)
		return "no";
	}
   		return "yes";
}