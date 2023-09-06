package Day2Assignment;
import java.util.Scanner;
public class Print5to1inNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i ;
		int j ;
		for (i= 5; i>=1; i--) 
		{
			for (j=i; j<=5; j++) {
				 System.out.print(j);
			
			} System.out.println();
		
		}
	}

}
