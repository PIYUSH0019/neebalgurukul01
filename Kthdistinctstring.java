package Practiceset;

public class Kthdistinctstring 
{	
		    public static void main(String[] args) {
		        String[] arr1 = {"d", "b", "c", "b", "c", "a"};
		        int k1 = 2;
		        String result1 = findKthDistinctString(arr1, k1);
		        System.out.println(result1);
		    }

		    public static String findKthDistinctString(String[] arr, int k) {
		        if (arr == null || arr.length == 0 || k <= 0) {
		            return "";
		        }

		        String result = "";
		        int count = 0;

		        for (int i = 0; i < arr.length; i++) {
		            boolean isDistinct = true;
		            for (int j = 0; j < i; j++) {
		                if (arr[i].equals(arr[j])) {
		                    isDistinct = false;
		                    break;
		                }
		            }

		            if (isDistinct) {
		                count++;
		                if (count == k) {
		                    result = arr[i];
		                    break;
		                }
		            }
		        }

		        return result;
		    }
		}

	
