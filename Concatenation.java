package Practiceset;

import java.util.Scanner;

public class Concatenation {

    public static void main(String[] args) {
        int i;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int a1[] = new int[n];
        for (i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("The added array elements are  ");
        for (i = 0; i < n; i++) {
            System.out.print(a1[i] + " ");
        }

        // Copying one array's elements to another
        int b1[] = new int[a1.length];
        for (int j = 0; j < b1.length; j++) {
            b1[j] = a1[j];
        }

        System.out.println("\nThe copied array elements are  ");
        for (int k = 0; k < b1.length; k++) {
            System.out.print(b1[k] + " ");
        }
        
        int mergearray[] = new int[a1.length + b1.length];
        
        for (i = 0; i < a1.length; i++) {
            mergearray[count] = a1[i];
            count++;
        }
        
        for (i = 0; i < b1.length; i++) {
            mergearray[count] = b1[i];
            count++;
        }
        
        System.out.println("\nThe final merged array is ");
        for (int l = 0; l < mergearray.length; l++) {
            System.out.print(mergearray[l] + " ");
        }
    }
}
