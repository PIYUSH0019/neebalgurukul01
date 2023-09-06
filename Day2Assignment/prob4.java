package Day2Assignment;

public class prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, 
			b = 1,
			c, count = 1;
		for (;count<=10;)
		{
			c=a+b;
			a=b;
			b=c;
			if (c%2==0) {  				    //check even no.
				System.out.print("  "+c);  // print result
				count++; 				   //updating count with even found
			}
		}
	}

}
