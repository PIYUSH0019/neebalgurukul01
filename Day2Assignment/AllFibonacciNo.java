package Day2Assignment;
import java.util.Scanner;
public class AllFibonacciNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int count = 0;
		int i;
		
		for (i= 1; count<10; i++) {
	
		int fn = n1 + n2;
			n1 = n2;
			n2 = fn;
			if ( fn%2==0 ) {
		System.out.print(" " +fn+ " ");
		count++;
		}
	 }
  }

}