//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numerator, denominator;
	//write two constructors
	public Rational () {
		setNumerator(1);
		setDenominator(1);
	}
	public Rational (int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}

	//write a setRational method
	public void setRational(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
		reduce();
	}

	//write  a set method for numeratorerator and denominatorominator
	public void setNumerator(int num) {
		numerator = num;
	}
	public void setDenominator(int denom) {
		denominator = denom;
	}
	
	public void add(Rational other)
	{
		numerator  = (numerator * other.denominator + other.numerator * denominator);
		denominator = (denominator*other.denominator);
		reduce();
	}

	private void reduce()
	{
		
		int gcd = gcd(numerator,denominator);
		numerator/=gcd;
		denominator/=gcd;

	}

	private int gcd(int numeratorOne, int numeratorTwo)
	{
		int gcd = 1;
		int smaller = numeratorOne;
		if(numeratorOne>numeratorTwo) {
			smaller = numeratorTwo;
		}
		for(int i = 1; i<=smaller; i++) {
			if(numeratorOne%i == 0 && numeratorTwo%i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone ()
	{
		return this;
	}


	//ACCESSORS

	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		
		if(obj instanceof Rational) {
			Rational compare = (Rational) obj;
			return compare.getDenominator() == denominator && compare.getNumerator() == numerator;
		}

		return false;
	}

	public int compareTo(Rational other)
	{

		if(equals(other)) {
			return 0;
		}
		double frac = (double) numerator/denominator;
		double otherFrac = (double) other.numerator/other.denominator;
		if((double) otherFrac < (double)frac) {
			return 1;
		}
		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return numerator+"/"+denominator;
	}
}