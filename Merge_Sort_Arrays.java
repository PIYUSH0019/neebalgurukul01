package Important_Q_of_Test_Java;
import java.util.Arrays;
public class Merge_Sort_Arrays {
	
	public static void main(String[] args) {
		int a[]= {1,3,5};
		int b[]= {2,2,9};
		
		
		int[] merge = Merge_Sort_Arrays.merge(a, b);
		
		System.out.println(Arrays.toString(merge));
	}

	public static int[] merge(int arr1[], int arr2[]) {

		int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1 + n2;
        int[] res = new int[n3];
        int i = 0, j = 0, k = 0;

        while (i < n1 & j < n2) {
            if (arr1[i] > arr2[j]) {
                res[k++] = arr2[j++];
            } else {
                res[k++] = arr1[i++];
            }
        }

        if (i == n1) {
            // copy arr 2 into res
            while (j < n2) {
                res[k++] = arr2[j++];
            }
        } else {
            // copy arr 1 into res
            while (i < n1) {
                res[k++] = arr1[i++];
            }
        }


        return res;
    }
}
