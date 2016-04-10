package threadingProblem.comp303Winter2016.module09.m09l2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Shared data structure for my synchronization examples.
 */
public class Account
{
	private final Lock aLock = new ReentrantLock();
	private final Condition aEnoughCash = aLock.newCondition();
	
	private int aBalance;

	public Account(int pBalance)
	{
		aBalance = pBalance;
	}
	
	public void credit(int pAmount)
	{ 
		aLock.lock();
		try{
			aBalance += pAmount; 
			aEnoughCash.signal(); // wakes a thread waiting on this condition - 
								  //let's other threads know that this thread is done using the shared data for now - the other threads are free to use it
		}
		finally
		{
			aLock.unlock();
		}
		
	}
	
	public void debit(int pAmount) 
	{ 
		aLock.lock();
		try
		{
			while( aBalance < pAmount ) // tell other threads which add funds to add funds if balance has insufficient funds 
			{
				try
				{
					aEnoughCash.await(); //The current thread suspends its execution until it is signalled or interrupted letting other threads add funds
				}
				catch (InterruptedException e)
				{
					return;
				}
			}
			aBalance -= pAmount;
			aEnoughCash.signal();// added
		}
		finally
		{
			aLock.unlock();
		}
	}
	
	public int getBalance() 
	{
		aLock.lock();
		try
		{
			return aBalance; 
		}
		finally
		{
			aLock.unlock();
		}
	}
}
