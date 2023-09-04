package day1;

public class Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Totaldays = 1020;
		
		int Years = Totaldays/365;
		
		int Months = (Totaldays%365) / 30;
		
		int Weeks = ((Totaldays%365)%30) / 7;
		
		int Days = (((Totaldays%365)%30)%7)/1;
		
		System.out.println(Years+"Years "+ Months +"Months "+ Weeks +"Weeks "+ Days+ "Days");
		
		
	}

}
