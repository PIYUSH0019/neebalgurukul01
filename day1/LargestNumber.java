package day1;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 7;
		int b = 3;
		int c = 5;
	
		int z;
		int it;
		z = a>b?a:b;
		it = z>c?c:a;
		
		
		System.out.println(z);
	}

}
