package Practiceset;

import java.util.Arrays;

public class Nuniqueelements {

	public static void main(String[] args) 
	{
		        int n = 5;
		        int[] result = findNUniqueIntegersSumToZero(n);
		        System.out.println(Arrays.toString(result));
		    }

		    public static int[] findNUniqueIntegersSumToZero(int n) {
		        if (n <= 0 || n % 2 == 0) {
		            throw new IllegalArgumentException("n must be a positive odd number.");
		        }

		        int[] arr = new int[n];
		        int sum = 0;

		        // Generate n - 1 random integers
		        for (int i = 0; i < n - 1; i++) {
		            int randomInt = (int) (Math.random() * 2001) - 1000; // Generates random integers between -1000 and 1000
		            arr[i] = randomInt;
		            sum += randomInt;
		        }

		        // Calculate the nth integer to ensure the sum is zero
		        arr[n - 1] = -sum;

		        return arr;
		    }
		}

	
