package Practiceset;

public class Transpose {

	public static void main(String[] args) 
	{
    int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
    int t[][] = new int[3][3];
    
    for(int i=0;i<a.length; i++)
    {
    for(int j=0;j<a.length; j++)
    {
    	t[i][j] = a[j][i];
    }
    }
    for(int i=0; i<a.length; i++)
    {
    	
    	for(int j=0; j<a.length; j++)
    	{
    	System.out.print(a[i][j] +" ");
    }
    	System.out.println("");
	}
    System.out.println("transpose after matrix is ");
    for(int i=0; i<a.length; i++)
    {
    	for(int j=0; j<a.length; j++)
    	{
    	System.out.print(t[i][j] + " ");
    }
    	System.out.println("");
	}
	}
}
