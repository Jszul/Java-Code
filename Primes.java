/* 
 * CSC 300 Sections 602,611 Homework assignment 1, Problem 1 
 */
package hw1solution;

public class Primes {
	private int prevPrime = 1;
	
	public int nextPrime() {
		for (int i=prevPrime+1; ; i++)
			if (isPrime(i)) {
				prevPrime = i;
				return prevPrime;
			}
	}
	
	private boolean isPrime(int p) {
		for (int i=2; i<p; i++)
			if (p%i == 0) return false;
		return true;           
	}
}
