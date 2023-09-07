package Day4Assignment;

public class prob3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthlySales[] = { 125000,93000,80000,75000,84000,110000,105000,120000,90000,115000,123000,15000 };
		int quaterlySales [] = new int [4];
		String months[] = {"january","february", "march", "april", "may", "june", "july", "august", "september","october", "november", "december"};
		
		
		for (int i=0; i<12; i++) 
		{
			int perMonthSales = monthlySales[i];
			System.out.println(months[i]+" sales: " +perMonthSales);
			int quarter = i/3;
			quaterlySales[quarter] += perMonthSales;
			
		}
		String[]qnames = {"quarter1", "quarter2", "quarter3", "quarter4"};
		for (int i=0; i<4; i++)
		{
			System.out.println(qnames[i]+" sales: " +quaterlySales[i]);
		}
		int totalSales=0;
		for(int sales:monthlySales) 
		{
			totalSales+=sales;
		}
		System.out.println(" total sales: "+totalSales);
	
	}
	

}
