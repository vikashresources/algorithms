package algorithm;

public class findTheLocalMinima {

	static int findMinima(int[] arr, int low, int high, int n) {
		int mid = low + (high - low)/2;
		// find the corner cases
		if(((mid == 0 || (arr[mid-1]) > arr[mid])) && (mid == n-1 || arr[mid+1] > arr[mid]))
			return mid;
		
		else if(mid > 0 && arr[mid-1] < arr[mid])
			return findMinima(arr,low, (mid-1), n);
		
		else
			return findMinima(arr,(mid + 1), high, n);
		
	}
	
	public static void main(String[] args) {
		System.out.print("Finding local minima...");
		int[] arr = {9, 6, 3, 14, 5, 7, 4};
		System.out.print(findTheLocalMinima.findMinima(arr, 0,arr.length-1, arr.length));

	}

}
