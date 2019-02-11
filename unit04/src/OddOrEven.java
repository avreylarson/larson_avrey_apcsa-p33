//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class OddEven{
		  private int c;
		  public OddEven(int y){
		    c = y;
		  }
		  public void getOddEven(){
		    if (c % 2==0) {
		      System.out.println(c + " is odd: False");
		      System.out.println(c + " is even: True");
		    } else {
		      System.out.println(c + " is odd: True");
		      System.out.println(c + " is even: False");
		    }
		  }
		}