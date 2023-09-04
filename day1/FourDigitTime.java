package day1;

import java.util.Scanner;

public class FourDigitTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int x1 = x/100;
		if (x1==0) {
			x1=12;
		}else if (x1>12) {
			x1 = x1 -12;
		}
	int min = x%100;
	
	System.out.println(x1+":" + min);
	}
}


