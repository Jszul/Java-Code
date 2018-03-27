// Insertion Sort

package sorting;
public class InsertionSortAlgorithm extends SortAlgorithm {
	
	public InsertionSortAlgorithm(int[ ] theArray) {
	    a = theArray;
	}
	
	public void sort( ) {
		int n = a.length;
		
		for(int i = 1; i < n; i++) {
			int temp = a[i];
			int j;
			for(j = i; j > 0 && a[j - 1] > temp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = temp;
		} 
	}
}

