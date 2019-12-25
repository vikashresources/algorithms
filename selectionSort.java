package algorithm;
// Java program for implementation of Selection Sort 
class sortSelection
{ 
	void sort(int arr[],int size) 
	{ 
		int i,j,min,temp;
		
		for (i = 0; i < size-1; i++) 
		{ 
			min = i; 
			for (j = i+1; j < size; j++) {
				if (arr[j] < arr[min]) 
					min = j; }

			temp = arr[min]; 
			arr[min] = arr[i]; 
			arr[i] = temp; 
		} 
	} 


	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		sortSelection ob = new sortSelection(); 
		int arr[] = {64,25,12,22,11}; 
		ob.sort(arr,arr.length); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 

