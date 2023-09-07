package Day4Assignment;

public class prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ev = {850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445};

        int totalTimeTakenByVehical = 0;

       
        for (int i = 0; i < ev.length; i =i+2) {
            int onTime = ev[i];
                int offTime = ev[i + 1];
            int onH = onTime / 100;
            int onM = onTime % 100;
              int offH = offTime / 100;
            int offM = offTime % 100;
               int passHours = offH - onH;
            int passMinutes = offM - onM;

            totalTimeTakenByVehical += (passHours * 60 + passMinutes);
        }

        int hours = totalTimeTakenByVehical / 60;
        int minutes = totalTimeTakenByVehical % 60;

        System.out.println("Expected running time: " + hours + " hr " + minutes + " min");
		
		}
   }	
		


