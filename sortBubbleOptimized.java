package algorithm;

// optimized bubble sort
class sortBubbleOptimized 
{ 

static void sortBubble(int[] data, int size) 
 { 
	int temp, optimized = 1;
     for (int step = 0; step <size - 1 && optimized == 1 ; ++step)  
     { 
    	 optimized = 0;
         for (int i = 0; i<size-step-1; ++i) {
        	 if(data[i] < data[i+1]) {
        		 temp = data[i];
        		 data[i] = data[i+1];
        		 data[i+1] = temp;
        		 optimized = 1;
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
