import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DailyTaskTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Welcome message
        System.out.println("Welcome to your Daily Task Tracker!");
        System.out.println("This will help you remember your tasks for today.\n");

        // Step 2: Create an empty list to store tasks
        List<String> dailyTasks = new ArrayList<>();

        // Step 3: Ask the user how many tasks they want to add
        System.out.print("How many tasks do you want to remember today? ");
        int taskCount = Integer.parseInt(scanner.nextLine());

        // Step 4: Loop to get task names from user
        for (int i = 0; i < taskCount; i++) {
            System.out.print("Enter task #" + (i + 1) + ": ");
            String task = scanner.nextLine();
            dailyTasks.add(task);
        }

        // Step 5: Show all tasks entered
        System.out.println("\nHere's your task list for today:");
        for (int i = 0; i < dailyTasks.size(); i++) {
            System.out.println((i + 1) + ". " + dailyTasks.get(i));
        }

        // Step 6: Ask which tasks are done (by number)
        System.out.print("\nEnter the numbers of the tasks you've finished (e.g. 1 3): ");
        String[] doneInput = scanner.nextLine().split(" ");
        List<Integer> doneIndexes = new ArrayList<>();
        for (String s : doneInput) {
            try {
                int index = Integer.parseInt(s) - 1;
                if (index >= 0 && index < dailyTasks.size()) {
                    doneIndexes.add(index);
                }
            } catch (NumberFormatException e) {
                // Ignore invalid numbers
            }
        }

        // Step 7: Show updated status
        System.out.println("\nTask Status:");
        for (int i = 0; i < dailyTasks.size(); i++) {
            String status = doneIndexes.contains(i) ? "DONE" : "PENDING";
            System.out.println((i + 1) + ". " + dailyTasks.get(i) + " - " + status);
        }

        // Step 8: Goodbye message
        System.out.println("\nGreat job keeping track of your tasks! Keep it up!");

        scanner.close();
    }
}
