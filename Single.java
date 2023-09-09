package Practiceset;

public class Single {

	public static void main(String[] args) 
	{
	int	nums[] = {2,2,4,4,1};
	int single =0;
for(int i=0; i<nums.length; i++)
{
single ^= nums[i];
}
System.out.println(single);
	}

}
