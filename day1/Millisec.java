package day1;

public class Millisec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int TotalMillisec = 7000234;
		
		int TotalSeconds = (TotalMillisec/1000) %60;
		
		int TotalMinutes = (TotalMillisec/ 1000/60) % 60;
		
		int TotalHours = ((TotalMillisec/ 1000 / 60/60));
		
		System.out.println(TotalHours + ":" + TotalMinutes + ":" +TotalSeconds);

	}

}
