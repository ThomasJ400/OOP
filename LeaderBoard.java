/**
* Author: Thomas Jones
* Date of Creation: 17/01/18
* Date of Last Edit: 17/01/18
* Purpose: Read data from file.
**/

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class LeaderBoard
{
	public static void main(String [] args) throws FileNotFoundException
	{
		System.out.println("Leaderboard");
		leaderBoard();
	}
	public static void leaderBoard() throws FileNotFoundException
	{
		File leaderboardFile = new File("Leaderboard.txt");
		Scanner lbFileScan = new Scanner(leaderboardFile);

		if(leaderboardFile.exists())
		{
			while(lbFileScan.hasNextLine())
			{
				System.out.println(lbFileScan.nextLine());
			}
		}
		lbFileScan.close();
	}
}
