package algorithm;

public class quickSort {

	static void quickSort(int[] A,int low,int high) {
		int pivot;
		if(high > low) {
			pivot = partition(A,low,high);
			quickSort(A,low,pivot-1);
			quickSort(A,pivot+1,high);
			
		}
	}
	
	static int partition(int[] A, int low, int high) {
		int left, right, temp, pivot_item = A[low];
		left = low;
		right = high;
		while(left < right) {
			//move left value while item < pivot
			while(A[left] <= pivot_item) {
				left++;
			}
			//move right value while item > pivot
			while(A[right] > pivot_item) {
				right--;
			}
			if (left < right) {
				temp = A[left];
				A[left] = A[right];
				A[right] = temp; 
				}					
		}
		// right is the final position for the pivot
					A[low] = A[right];
					A[right] = pivot_item;

		return right;
	}
	
	 static void printArray(int[] data, int n) 
	 { 
	     for (int i = 0; i < n; i++) 
	     System.out.print(data[i]+ " "); 
	       
	     System.out.println(); 
	 } 

	 public static void main (String[] args)  
	 { 
	     int[] data = { 4, 13, 54, 56, 49 }; 
	     int n = data.length; 
	     quickSort(data, 0, n-1); 
	     printArray(data, n); 
	 } 
	

}
