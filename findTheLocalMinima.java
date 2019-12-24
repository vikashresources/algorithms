package algorithm;

public class findTheLocalMinima {

	static int findMinima(int[] arr, int low, int high, int n) {
		int mid = low + (high - low)/2;
		// find the corner cases
		if(((mid == 0 || (arr[mid-1]) > arr[mid])) && (mid == n-1 || arr[mid+1] > arr[mid]))
			return mid;
		
		else if(mid > 0 && arr[mid-1] < arr[mid])
			return findMinima(arr,low, (mid-1), n);
		
		else if(mid > 0 && arr[mid+1] < arr[mid])
			return findMinima(arr,(mid + 1), high, n);
		else
			{System.out.print("doesn't contain local minima element...");
		return -1;}
		
	}
	
	public static void main(String[] args) {
		System.out.print("Finding local minima...");
		int[] arr = {9, 6, 3, 14, 5, 7, 4};
		int arr1[] = {1, 2, 3};
		int arr2[] = {3, 2, 1};
		int arr3[] = {3,3,3,3};
		System.out.print(findTheLocalMinima.findMinima(arr, 0,arr.length-1, arr.length));
		System.out.print(findTheLocalMinima.findMinima(arr1, 0,arr1.length-1, arr1.length));
		System.out.print(findTheLocalMinima.findMinima(arr2, 0,arr2.length-1, arr2.length));
		System.out.print(findTheLocalMinima.findMinima(arr3, 0,arr3.length-1, arr3.length));
	}

}
