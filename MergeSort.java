package algorithm;

public class MergeSort {

	static void mergeSort(int[] A,int low,int high) {
		int mid;
	      if(low < high) {
	    	  mid = (low+high)/2;
	    	  mergeSort(A,low,mid);
	    	  mergeSort(A,mid+1,high);
	    	  merge(A,low,mid,high);
	    	  
	      }
			
		}
	
	static void merge(int[] A,int low,int mid,int high) {
		int i,j,k;
		int B[] = new int [5]; 
		i = low;
		j = mid+1;
		k=low;
		
		while(i<=mid && j <= high) {
			if(A[i] <= A[j]) {
				B[k] = A[i];
				i++;
			} else {
				B[k] = A[j];
				j++;
			}
			k++;
		}
		if(i > mid) {
			while(j<=high) {
				B[k] = A[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=mid) {
				B[k] = A[i];
				i++;
				k++;
			}
		}
		
		for(int l=low;l<=high;l++)
			A[l] = B[l];
		
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
	     mergeSort(data, 0, n-1); 
	     printArray(data, n); 
	 } 
	

}
