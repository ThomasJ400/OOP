/**
* Author: Thomas Jones
* Date of Creation: 17/01/18
* Date of Last Edit: 17/01/18
* Purpose: Read rules from file.
**/

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

class Rules
{
	public static void main(String [] args) throws FileNotFoundException
	{
		System.out.println("Rules");
		rules();
	}
	public static void rules() throws FileNotFoundException
	{
		File rulesFile = new File("Rules.txt");
		Scanner rulesFileScan = new Scanner(rulesFile);

		if(rulesFile.exists())
		{
			while(rulesFileScan.hasNextLine())
			{
				System.out.println(rulesFileScan.nextLine());
			}
		}
		rulesFileScan.close();
	}
}