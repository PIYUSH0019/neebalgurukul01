package Day2Assignment;
import java.util.Scanner;
public class CosineSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		double sum = 1;
		double num = 1;
		double fact = 1;
		
		x = Math.toRadians(x);
		
		for (double i = 1; i<=19; i++) {
			fact = fact * i;
			if (i%2==0) {
				num = -num*x*x;
				sum = sum + num/fact;
			}
		}System.out.println(sum);
		sc.close();
	}

}
