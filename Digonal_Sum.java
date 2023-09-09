package Important_Q_of_Test_Java;

public class Digonal_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat [][]= {{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}};
		
			int result = 0;
			
			int primarySum = 0;
			int secondrySum = 0;
			
			for (int i=0; i<mat.length; i++) {
				primarySum+=mat[i][i];
				secondrySum+=mat[i][mat.length - 1 - i];
			}
			result = primarySum + secondrySum;
			if (mat.length%2 != 0)
				result = result - mat[mat.length/2][mat.length/2];
				
				
				System.out.println(result);
			
	}

}
