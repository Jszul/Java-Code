/* 
 * CSC 300 Sections 602,611 Homework assignment 1, Problem 2 
 */

package hw1solution;

public class Money {
	private int dollars, cents;
	
	// in the Money constructor, you may assume that d >= 0,
	// and that 0 <= c < 100
	public Money(int d, int c) {
		dollars = d;
		cents = c;
	}
	
	public String toString() {
		String ans = "$" + dollars + ".";
		if (cents == 0) return ans + "00";
		else if (cents < 10) return ans + "0" + cents;
		else return ans + cents;
	}
	
	public Money add(Money other) {
		int d = dollars + other.dollars;
		int c = cents + other.cents;
		if (c >= 100) {
			d += 1;
			c -= 100;
		}
		return new Money(d,c);   // replace this
		
	}
	
	public Money tax(double rate) {
		int allCents = dollars * 100 + cents;
		int tax = (int) ((allCents * rate)/100.);
		System.out.println(tax);
		int d = tax / 100;
		int c = tax - d * 100;
	    return new Money(d,c);   // replace this
	   
	}
}
