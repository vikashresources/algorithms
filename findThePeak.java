package algorithm;

public class findThePeak {
	//An array element is peak if it is NOT smaller than its neighbors
	static int findPeakUtil(int[] arr, int low, int high, int n) {
		// find the mid index
		int mid = low + (high-low)/2;  // (low + high)/2
		
		// compare middle element with its neighbor if neighbor exist i,e corner cases
		if((mid==0 || arr[mid-1] <= arr[mid]) && ((mid == n-1) || arr[mid+1] <= arr[mid]))
			return mid;
		
		// if the middle element is not peak and its left neighbor is 
		// greater than it, then left half must have a peak element
		
		else if(mid > 0 && arr[mid-1] > arr[mid])
			return findPeakUtil(arr, low, (mid-1),n);
		
		// if the middle element is not peak & its right neighbor is greater
		// than it then right half must have a peak element.
		else
			return findPeakUtil(arr, (mid+1),high ,n);
		
	}
	

	public static void main(String[] args) {
 		int[] arr = {1,3};
		int arr1[] = {1, 3, 20, 4, 1, 0};
		int arr2[] = {3,3,3,3};
		System.out.println("Finding a peak...!");
		System.out.print(arr[findThePeak.findPeakUtil(arr,0,arr.length-1,arr.length)]);
		System.out.print("\n");
		System.out.print(arr1[findThePeak.findPeakUtil(arr1,0,arr1.length-1,arr1.length)]);
		System.out.print("\n");
		System.out.print(arr2[findThePeak.findPeakUtil(arr2,0,arr2.length-1,arr2.length)]);
		System.out.print("\n");
	}

}
