
// Selection Sort

package sorting;
public class SelectionSortAlgorithm extends SortAlgorithm {
	
	public SelectionSortAlgorithm(int[ ] theArray) {
	    a = theArray;
	}
	
	public void sort( ) {
		int n = a.length;	
	    for(int i = 0; i < n; i++) {
	     	int min = i;
	       	for(int j = i + 1; j < n; j++) {
	       	    if (a[j] < a[min]) {
	       	    	min = j;
	       	    }
	       	}
	    	// Swap a[j] and a[min]
	    	int temp = a[min];
	    	a[min] = a[i];
	    	a[i] = temp;
		}
	}
}
