// Quicksort
package sorting;
public class QuickSortAlgorithm extends SortAlgorithm {
	
	public QuickSortAlgorithm(int[ ] theArray) {
	    a = theArray;
	}
	
	public void sort( ) {
		int start = 0;
		int end = a.length - 1;
		quickSort(start, end);
	}
	
	public void quickSort(int start, int end) {
		if (start < end) {
			int middle = partition(start, end);
			quickSort(start, middle - 1);
			quickSort(middle, end);
		}
	}
	
	public int partition(
		int p, int q) {
		
		int pivot = a[(p + q) / 2];
		while (p <= q) {
			while(a[p] < pivot) {
				p++;
			}
			while(pivot < a[q]) {
				q--;
			}
			if (p <= q) {
				int temp = a[p];
				a[p] = a[q];
				a[q] = temp;
				p++;
				q--;
			}
		}
		return p;
	}
}
