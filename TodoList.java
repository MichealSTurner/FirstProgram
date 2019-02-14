import java.util.Scanner;

public class TodoList {
	public static void main(String[] args) {

		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.println("This is your to do list!\n");
		System.out.println("How many tasks do you have?");

		int amountTask = input1.nextInt();
		int nextTask = 0;
		int nextLabel = 1;
		String[] tasks = new String[amountTask];

		System.out.println("Let's get your list in order..");

		do {
			System.out.println("Please enter a task: ");
			tasks[nextTask] = nextLabel + "." + input2.nextLine();
			nextTask++;
			System.out.println("That's " + nextLabel);
			nextLabel++;
		} while (nextTask < amountTask);

		System.out.println("Great, now here is your to do list!");

		for (String todoList : tasks) {
			System.out.println(todoList);
		}
	}
}