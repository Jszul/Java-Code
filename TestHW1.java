package hw1solution;

/* This main method tests the 3 classes which you must write
 * for Homework 1.  These are by no means exhaustive tests,
 * and I may test your code on a different main method
 * when grading them.  
 * 
 * The output of this main should be:
 
2 3 5 7 11 13 17 19 23 29 
$2.99 + $50.01 = $53.00
Tax on $50.01 is $5.12
2:05 2:04 2:03 2:02 2:01 2:00 1:59 1:58 1:57 1:56 
115 more seconds elapsed

 */
import edu.princeton.cs.algs4.StdOut;

public class TestHW1 {
	public static void main(String[ ] args) {
		Primes primes = new Primes();
		int p = primes.nextPrime();
		while (p<30) {
			StdOut.printf("%d ", p);
			p = primes.nextPrime();
		}
		StdOut.println();
		Money m1 = new Money(2,99);
		Money m2 = new Money(50,01);
		StdOut.printf("%s + %s = %s\n", m1, m2, m1.add(m2));
		StdOut.printf("Tax on %s is %s\n", m2, m2.tax(10.25));
		StdOut.printf("Tax on %s is %s\n",  new Money(10,00), new Money(10,00).tax(10.25));
		Timer t = new Timer(0,15);  // 2 minutes 5 seconds
		for (int i=0; i<10; i++) {
		  StdOut.printf("%s ", t);
		  t.tick();
		}
		int secs = 0;
		while (!t.isZero()) {
		  t.tick();
		  secs ++;
		}
		StdOut.print("\n");
		StdOut.printf("%d more seconds elapsed\n", secs);
	}
}
