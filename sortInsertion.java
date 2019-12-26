package algorithm;

// Insertion Sort
class sortInsertion 
{ 

static void sortInsertion(int[] data, int size) 
 { 
	int key,j;
	for(int i = 1 ; i <= size-1 ; i++) {
		key = data[i];
		j=i;
		while(j >=1 && data[j-1] > key ) {
			data[j] = data[j-1];
			j--;
		}
		data[j] = key;			 
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
     int[] data = { 4, 5, 3, 2, 1 }; 
     int n = data.length; 
     sortInsertion(data, n); 
     printArray(data, n); 
 } 
}
