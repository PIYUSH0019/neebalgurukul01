package Day2Assignment;

public class TriangleShapeWithABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++)
		{
			for (int j=i*2-1; j>=i; j--){
				System.out.print(" "+(char)(j+64));
			}
			System.out.println();
		}
		for (int i=4; i>=1; i--) 
		{
			for (int j=i*2-1; j>=i; j--){
				System.out.print(" "+(char)(j+64));
			}
		}
	}

}
