import java.util.ArrayList;
import java.util.Scanner;

public class Milesplit {
    public static void main(String[] args) {
        Times.fillArray(); // Fill the initial list of runners

        Scanner scanner = new Scanner(System.in);
        
        //name
        System.out.print("Enter your name:");
        String newName = scanner.nextLine(); 
        
        //time
        System.out.print("Enter the time (in the form of 1448 if running a 14:48 ) for the new runner: ");
        int newTime = scanner.nextInt();
        
        //create new runner
        Runner newRunner = new Runner(newName, newTime);
        insertRunnerInOrder(newRunner, Times.time);
       
        ///current runner
        System.out.println("Updated List of Runners:");
        for (int i = 0; i < Times.time.size(); i++) {
          Runner runner = Times.time.get(i);
            System.out.println((i + 1) + ")" + runner.getName() + " ~ " + runner.getTime());
        }
    }
    
    ///compare and insert
    public static void insertRunnerInOrder(Runner newRunner, ArrayList<Runner> runners) {
        int newIndex = 0; 
        while (newIndex < runners.size() && newRunner.getTime() > runners.get(newIndex).getTime()) {
        	newIndex++;
        }
        
        ///add runner to the list
        runners.add(newIndex, newRunner);
   }
    
  // public static void options(String[] args)
 ///  {
	//  Scanner userIntInput = new Scanner(System.in);
//	   System.out.println("Would you like to 1) see where you would fall in the list of runners or 2) see the list of already set runners?");
	   
	///  int  firstChoice = userIntInput.nextInt();
	//  if(firstChoice ==1) {
//		  System.out.println(runner.getName() + runner.getTime());
    //	} else if {secondChoice == 2){
    	//System.out.println(Times.time);
  ///  }
		  
	 
//}
}




				  
				      
	


	
