/* 
 * CSC 300 Sections 602,611 Homework assignment 1, Problem 3 
 */
package hw1solution;

import edu.princeton.cs.algs4.StdOut;

public class Timer {
	private int minutes, seconds;
	
	// In the constructor, you may assume that m >= 0 and
	// that 0 <= s < 60.
	public Timer(int m, int s) {
		minutes = m;
		seconds = s;
	}

	public String toString() {
		String ans = "" + minutes + ":";
		if (seconds == 0) return ans + "00";
		else if (seconds < 10) return ans + "0" + seconds;
		return ans + seconds;
	}
	
	public void tick() {
		if (seconds == 0) {
			seconds = 59;
			minutes--;
		}
		else seconds--;
	}		

	public boolean isZero() {
		return minutes == 0 && seconds == 0;
	}
}