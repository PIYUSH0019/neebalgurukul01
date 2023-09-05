package Day2Assignment;
import java.util.Scanner;
public class Quardrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter x :");
		
		int y = sc.nextInt();
		System.out.println("Enter y :");
		
		if (x==0 && y==0) {
			System.out.println("origin");
		}
		if (x==0 && y!=0) {
			System.out.println("y-axis");
		}	
		else if (x!=0 && y==0) {
				System.out.println("x-axis");
		 }
		else if (x>0 && y>0) {
			System.out.println("Q1");
		}
		else if (x<0 && y>0) {
			System.out.println("Q2");
		}
		else if (x<0 && y<0) {
			System.out.println("Q3");
		}
		else if (x>0 && y<0) {
			System.out.println("Q4");
		}
		sc.close();
	  }
	
}
