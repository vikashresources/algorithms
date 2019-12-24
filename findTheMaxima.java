  package algorithm;

public class findTheExtrema {

	static int countTheMaxima(int[] arr, int n) {
		int count = 0;
		for(int i = 1; i < n-1 ; i++) {
			if(arr[i-1] < arr[i] && arr[i+1] < arr[i]) {
				count++;
			}
			
			if(arr[i-1] > arr[i] && arr[i+1] > arr[i]) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 1 }; 
		int a[] = {1, 5, 2, 5};
		int arrInt[] = {1, 2, 3};
		System.out.print(countTheMaxima(arr, arr.length));
		System.out.print(countTheMaxima(a, a.length));
		System.out.print(countTheMaxima(arrInt, arrInt.length));
	}

}
