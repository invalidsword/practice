package threadingProblem.comp303Winter2016.module09.m09l2;

import java.util.Random;

public class Parent implements Runnable
{
	public static void main(String[] args)
	{
		Account account = new Account(0);
		new Thread( new Parent(account)).start();
		new Thread( new Teen(account,100)).start();
		new Thread( new Teen(account,150)).start();
		new Thread( new Teen(account,200)).start();
	}
	
	private Account aAccount;
	public Parent(Account pAccount) { aAccount = pAccount; }
	
	@Override
	public void run()
	{
		for( int i = 0; i < 1000; i++ )
		{
			try
			{
				aAccount.credit(1000);
				Thread.sleep(250);	//Causes the currently executing thread to sleep (temporarily cease execution)		
				System.out.println("Week " + aAccount.getBalance());

			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Teen implements Runnable
{
	private Account aAccount;
	private int aAllowance;
	private Random aRandom = new Random();
	
	public Teen( Account pAccount, int pAllowance )
	{
		aAccount = pAccount;
		aAllowance = pAllowance;
	}
	@Override
	public void run()
	{
		for( int i = 0; i < 150; i++ )
		{
			int spend = aRandom.nextInt(aAllowance);
			aAccount.debit(spend);
		}
	}
}
