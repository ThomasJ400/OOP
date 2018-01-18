/**
* Author: Thomas Jones
* Date of Creation: 18/01/18
* Date of Last Edit: 18/01/18
* Purpose: increase, decrease, bonus, and megaBonus a score variable for a player.
* Version: 1.0
**/

import java.util.Scanner;

public class ScoreV1
{//Start of Class

	public static void main(String [] args)
	{//start of main method	
		Scanner scan = new Scanner(System.in);
		String name = "";
		int playerScore = 0;
		
		System.out.print("Enter Your Name: ");
		name = scan.nextLine();
		
		playerScore = increaseScore(playerScore);
		System.out.println("Your score in the main method is: " + playerScore);
	}//end of main method
	
	public static int increaseScore(int score)
	{//start of increaseScore method
		score++;
		System.out.println("Your score in the increaseScore method is: " + score);
		return score;
	}//end of increaseScore method
	
	public static void decreaseScore(int score)
	{//start of decreaseScore method
		score--;
	}//end of decreaseScore method
	
	public static void bonusScore(int score)
	{//start of bonusScore method
		score = score + 10;
	}//end of bonusScore method
	
	public static void megaBonusScore(int score)
	{//start of megaBonusScore method
		score = score * 10;
	}//end of megaBonusScore method
	
}//End of Class