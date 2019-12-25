package algorithm;

public class sortSelection {

	static int[] applySelectionSort(int[] arr, int n) {
		int temp;
		for(int i = 0;i<n;i++) {
			for(int j = i; j < n;j++ )
			{
				// for changing order, change > operator
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr; 
	}
	
	public static void main(String[] args) {
	 int[] arr = {13,25,11,12,14};
	 System.out.print("Performing Selection Sort...\n");
	 for (int s : applySelectionSort(arr,arr.length)) {
		 System.out.print(s + "\n");
	 };
	}

}
