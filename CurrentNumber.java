package Practiceset;

public class CurrentNumber 
{

	public static void main(String[] args) 
	{
    int c1[] = {8,1,2,2,3};
        
    for(int j=0; j<c1.length; j++)
    {
    	int count = 0;
    for(int i=0; i<c1.length; i++)
    {
    	if(c1[i]>c1[j])
    	{
    	count++;
    	}	
    }
    System.out.println(count);
	}
	}
}
