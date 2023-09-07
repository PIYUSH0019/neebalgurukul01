package Day4Assignment;
import java.util.Scanner;
public class prob5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array num :");
        int N=sc.nextInt();
        int a[]=new int [N];
         System.out.println("Enter Number :");
        for(int i=0;i<N;i++){
           
             a[i]=sc.nextInt();
           
        }
        int min = 0;
        for(int i=0; i<N; i++) {
            if( a[i]<a[min])
            {
               min = i;
            }
        }
        System.out.println("Index Smallest Element in the Array :  "+min);
	}
   
}


