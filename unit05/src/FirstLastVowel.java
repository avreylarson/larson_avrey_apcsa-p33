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
	   
	   String trial = "aeiouAEIOU";
	   if(trial.indexOf(finish) >= 0 || trial.indexOf(beginning) >= 0) {
		return "yes";
	   }
  
   		return "no";
} 
}