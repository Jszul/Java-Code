// Sorter

package sorting;
public class Sorter {
	private SortAlgorithm algorithm = null;
	private int[ ] array; 
			
	public Sorter( ) { }
	
	public void setAlgorithm(
		SortAlgorithm theAlgorithm) {
		
		algorithm = theAlgorithm;
	}
	
	public void setArray(
		int[ ] theArray) {
		
		array = theArray;
	}
	
	public void sort( ) {
		if (algorithm != null) {
		    algorithm.sort( );
		}
	}
	
	public void display( ) {
		for(int n: array) {
			System.out.print(n + " ");
		}
		System.out.println( );
	}
}
