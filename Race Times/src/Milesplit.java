import java.util.ArrayList;
import java.util.Scanner;

public class Milesplit {
    public static void main(String[] args) {
        Times.fillArray(); // Fill the initial list of runners

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name:");
        String newName = scanner.nextLine();

        System.out.print("Enter the time (in the form of 1448 if running a 14:48 ) for the new runner: ");
        int newTime = scanner.nextInt();
        //create new runner
        Runner newRunner = new Runner(newName, newTime);

        insertRunnerInOrder(newRunner, Times.time);

        // Print the updated list of runners
        System.out.println("Updated List of Runners:");
        for (int i = 0; i < Times.time.size(); i++) {
          //  Runner runner = Times.time.get(i);
            System.out.println((i + 1) + ")" + runner.getName() + " ~ " + runner.getTime());
        }
    }

    public static void insertRunnerInOrder(Runner newRunner, ArrayList<Runner> runners) {///already takes the new runner and the old list just in the void parameters
        int newIndex = 0; // - tells where the runner will be inserted into the code
/// takes the runner and the list of runners and inserts in ascending orders
        while (newIndex < runners.size() && newRunner.getTime() > runners.get(newIndex).getTime()) {///as long as the list of runners is a size the loop will continue to go through it
        	//runners.size is the existing list of runners
            newIndex++;///tells to go through the next runner on the list
        }//new

        runners.add(newIndex, newRunner); //-adds the new runner to the array list
    }
//   public static void options(String[] args) {
	//   Scanner userIntInput = new Scanner(System.in);
	   //System.out.println("Would you like to 1) see where you would fall in the list of runners or 2) see the list of already set runners?");
	   //
	   //int  firstChoice = userIntInput.nextInt();
	   //if(firstChoice ==1) {
		  // System.out.println(runners.getName() + runners.getTime());
		  
	  // }
	    
   }



				  
				      
	


	
