package Practiceset;

public class GCD {

	public static void main(String[] args) 
	{
		int max=0;
		
		int a1[] = {36,24,25,26};
		int min=a1[0];
		for(int i=0; i<a1.length; i++)
		{
			if(a1[i]<min)
			{
				min = a1[i];
			}
			if(a1[i]>max)
			{
				max = a1[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
      while(max%min!=0)
      {
    	 int  result = max%min;
    	   max = min;
    	   min =result;  
      }
      int gcd = min;
      System.out.println("GCD is "+gcd);
	}
	

}
