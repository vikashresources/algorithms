package algorithm;

public class HeapSort {
	
	static void MaxHeapify(int[] A, int n ,int i) {
		int largest = i;
		int l = (i+1);
		int r = (2*i + 1);
		
		while(l <=n && A[l] > A[largest]) {
			largest = l;
		}
		while(r <=n && A[r] > A[largest]) {
			largest = r;
		}
		
		if(largest != i) {
			int temp = A[largest];
			A[largest] = A[i];
			A[i] = temp;
			MaxHeapify(A,n,largest);
		}
	}
	
	static void Sort(int[] A, int n) {
		for(int i=n/2;i>=1;i--)
		{
			MaxHeapify(A,n,i);
		}
		for(int i=n;i>=1;i--) {
			int temp = A[1];
			A[1] = A[i];
			A[i] = temp;
			MaxHeapify(A,n,1);
		}	
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
	     Sort(data,n); 
	     printArray(data, n); 
	 } 
	
}
