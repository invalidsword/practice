package threadingProblem.comp303Winter2016.module09.m09l2;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Bank
{
	public static void main( String[] args )
	{
		long start = System.currentTimeMillis();
		final Account[] accounts = new Account[50];
		for( int i = 0 ; i < accounts.length; i++ )
		{
			accounts[i] = new Account(20000);
		}
		Thread[] threads = new Thread[1000];
		for( int i = 0; i < threads.length; i++ )
		{
			threads[i] = new Thread(new Customer(accounts));
		}
		int i=0;
		
		//need for main thread to wait until all customers are done executing before printing the total
		for( Thread t : threads )
		{
			i++;
			System.out.println(i);
			try {
				t.join(); //causes the current thread (main) to pause execution until t's thread terminates
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		}
		// You need some code to wait for the customer threads to finish
		
		
		int total = 0;
		for( Account account : accounts)
		{
			total += account.getBalance();
		}
		long end = System.currentTimeMillis();
		System.out.println(end- start);
		System.out.println(total);
	}
}

class Customer implements Runnable
{
	private final Account[] aAccounts;
	private final Random aRandom = new Random();
	
	public Customer(Account[] pAccounts) { aAccounts = pAccounts; }
	
	@Override
	public void run()
	{

		for( int i = 0 ; i < 100000; i++)
		{
			aAccounts[aRandom.nextInt(aAccounts.length)].debit(10);
			aAccounts[aRandom.nextInt(aAccounts.length)].credit(10);
		}
	}
}
