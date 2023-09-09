package Practiceset;

public class DiagonalSum {
    public static void main(String[] args) {
        int primarySum = 0;
        int secondarySum = 0;
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Diagonal of sum");

        for (int i = 0; i < a.length; i++) {
            primarySum += a[i][i];
            secondarySum += a[i][a.length - 1 - i];
        }

        System.out.println("Primary diagonal sum: " + primarySum);
        System.out.println("Secondary diagonal sum: " + secondarySum);

        // Calculate the total sum
        int totalSum = primarySum + secondarySum;

        // Subtract the middle element if the matrix has an odd size
        if (a.length % 2 != 0) {
            int middleIndex = a.length / 2;
            totalSum -= a[middleIndex][middleIndex];
        }

        System.out.println("Total diagonal sum: " + totalSum);
    }
}
