package Day4Assignment;

public class prob2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		
		int totalDays =arr.length;
		int curruntDay = 0;
		
		for (int i=0; i<totalDays; i++) 
		{
			if (arr[i]==1)
			{
				curruntDay++;
			}
		}
		double attendanceprecentage = (double) curruntDay/totalDays*100;
		System.out.println("totalDays : " +totalDays);
		System.out.println("curruntDays : " +curruntDay);
		System.out.println("attendance percentage : "   +attendanceprecentage);
		
	}

}
