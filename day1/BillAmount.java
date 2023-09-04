package day1;
import java.util.Scanner;
public class BillAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Unit");
		int Tunit = sc.nextInt();
		double amount ;
		
		if (Tunit<=100) {
			amount =Tunit*4;
		}else if (Tunit<=300){
			amount= 400+((Tunit-100)*5);
		}else {
			amount = 400+1000+ ((Tunit-300)*10);
			
		}
		System.out.println("Name: "+ name);
		System.out.println("Total_Unit: "+ Tunit);
		
		if (amount<1000){
			System.out.println("amount: "+ amount);
		}else {
				amount = amount + (amount*5/100);
				amount = amount +((amount*18)/100);
				System.out.println("Amount: "+ (amount));
		}
		
	}

}
