package Practiceset;

public class Replace {
	    // Function to replace every element with the
	    // next greatest element
	    static void nextGreatest(int arr[], int n)
	    {
	        for (int i = 0; i < n; i++) {
	            int max_value = -1;
	            for (int j = i + 1; j < n; j++) {
	                max_value = Math.max(max_value, arr[j]);
	            }
	            arr[i] = max_value;
	        }
	    }
	  
	    // A utility Function that prints an array
	    static void printArray(int arr[], int size)
	    {
	        for (int i = 0; i < size; i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	  
	    // Driver program to test above function
	    public static void main(String[] args)
	    {
	        int arr[] = { 17,18,5,4,6,1 };
	        int size = arr.length;
	        nextGreatest(arr, size);
	        System.out.println("The modified array is: ");
	        printArray(arr, size);

	}

}
