import java.util.Scanner;

public class Game
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		//Menu
		do
		{
			System.out.println("1. View Rules");
			System.out.println("2. Play Game");
			System.out.println("3. View Leaderboard");
			System.out.println("4. Exit");
			System.out.print("Select an option: ");
			choice = scan.nextInt();

			//switch
			switch(choice)
			{
				case 1:
					viewRules();
				break;
				case 2:
					play();
				break;
				case 3:
					viewLeaderboard();
				break;
				case 4:
					exit();
				break;
				default:
					System.out.println("Error!");
				break;
			}
		} while(choice != 4);
	}

	public static void play()
	{
		System.out.println("Playing Game...");
	}

	public static void exit()
	{
		System.out.println("Exiting");
		System.exit(0);
	}

	public static void viewRules()
	{
		System.out.println("Welcome to Xs and Os");
		System.out.println("Rule 1: To win, take turns make a straight line in your chosen character X or O.");
		System.out.println("Rule 2: The line can be horizontal, vertcial or diagonal.");
		System.out.println("Rule 3: If the opponent achieves this first, you lose.");
	}

	public static void viewLeaderboard()
	{
		System.out.println("Leaderboard");
		System.out.println("1. Tom 5000");
		System.out.println("2. Jon 4500");
		System.out.println("3. Ron 3000");
		System.out.println("4. Jim 2500");
		System.out.println("5. Jak 500");
	}
}