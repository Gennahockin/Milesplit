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

        Runner newRunner = new Runner(newName, newTime);

        insertRunnerInOrder(newRunner, Times.time);

        // Print the updated list of runners
        System.out.println("Updated List of Runners:");
        for (int i = 0; i < Times.time.size(); i++) {
            Runner runner = Times.time.get(i);
            System.out.println((i + 1) + ")" + runner.getName() + " ~ " + runner.getTime());
        }
    }

    public static void insertRunnerInOrder(Runner newRunner, ArrayList<Runner> runners) {
        int newIndex = 0;

        while (newIndex < runners.size() && newRunner.getTime() > runners.get(newIndex).getTime()) {
            newIndex++;
        }

        runners.add(newIndex, newRunner);
    }
}


				  
				      
	


	
