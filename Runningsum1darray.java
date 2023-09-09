package Practiceset;

public class Runningsum1darray 
{

	public static void main(String[] args) 
	{
   int a1 [] = {1,1,1,1,1};
   
   int runningsum[]=new int[a1.length];
   
   int sum=0;
   for(int i=0; i<a1.length; i++)
   {
	
	sum = sum+ a1[i];
	runningsum[i]=sum;
   }
  for(int i:runningsum)
  {
	  System.out.println(i);
  }
	}

}
