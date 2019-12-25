package algorithm;

//Java program for modifying Selection Sort 
//so that it becomes stable. 
class sortBubble 
{ 

static void bubbleSort(int[] data, int size) 
 { 
	int temp;
     for (int step = 0; step <size - 1; ++step)  
     { 
         for (int i = 0; i<size-step-1; ++i) {
        	 if(data[i] < data[i+1]) {
        		 temp = data[i];
        		 data[i] = data[i+1];
        		 data[i+1] = temp;
        	 }
         }   
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
     sortBubble(data, n); 
     printArray(data, n); 
 } 
}
