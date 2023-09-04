
package day1;
import java.util.Scanner;
public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a = x/100;
		int b = x/10%10;
		int c = x%10;
		// fromula
		int arm;
		arm = a*a*a + b*b*b + c*c*c;
		
		if(x==arm) {
			System.out.println("its an armstrong no");
		}else {
			System.out.println("its not an armstrong no");
		}
		
	}

}
