public class BankAccount
{
	double accountNo;
	double balance;
	
	BankAccount()
	{//Default Constructor Start
		balance = 0;
		accountNo = 1; //Ideally random number generator.
	}//Default Constructor End
	
	BankAccount(double acc, double bal)
	{//Constructor Start
		
	}//Constructor End
	
	double withdraw(double amount)
	{//Withdraw method Start
		if((balance-amount)>0)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Insufficient Funds!");
		}
	}//Withdraw method End
	
	double lodge(double amount)
	{//Withdraw method Start
		balance += amount;
	}//Withdraw method End
}