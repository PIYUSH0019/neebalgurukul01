package Day2Assignment;

public class OneTof5CountingInSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=1; j--)
			{
				if (j==i) {
					System.out.print(" "+i);
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j=2; j<=5; j++)
			{
				if (j==i) {
					System.out.print(" "+i);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i=4; i>=1; i--)
		{
			for (int j=5; j>=1; j--)
			{
			if (j==i){
				System.out.print(" "+i);
				
			}else  {
				System.out.print(" ");
				}
			}
			for (int j=2; j<=5; j++)
			{
			if (j==i){
				System.out.print(" "+i);
				
			}
			else  {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}