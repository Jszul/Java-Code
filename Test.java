// Sorting2 Example
// Source code file Test.java
// Illustrate the Strategy Software Pattern
// The sorting algorithms are encapsulated
// into the classes InsertionSortAlgorithm,
// SelectionSortAlgorithm, and QuickSortAlgorithm.

import sorting.*;
public class Test {

	public static void main(String[] args) {
		
		int[ ] a = {45, 32, 11, 53, 45, 78, 9, 21};
		Sorter s = new Sorter( );
		s.setArray(a);
	    s.display( );
		s.setAlgorithm(new InsertionSortAlgorithm(a));
		// s.setAlgorithm(new SelectionSortAlgorithm(a));
		// s.setAlgorithm(new QuickSortAlgorithm(a));
		s.sort( );
        s.display( );
	}
}
