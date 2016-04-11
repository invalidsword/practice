package threadPractice;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberBox 
{
	
	private final Lock aLock = new ReentrantLock();
	private final Condition aHaveAdded = aLock.newCondition();
	
	private long aNum = 0;
	
	
	public void add(int pNum)
	{
		aLock.lock();
		try{
			aNum += pNum;
			aHaveAdded.signal();
		}
		finally
		{
			aLock.unlock();
		}
	}
	
	public void whatsInTheBox()
	{
		aLock.lock();
		try{
		System.out.println(aNum);
		}
		finally
		{
			aLock.unlock();
		}
	}
}
