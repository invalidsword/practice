package threadPractice;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumberBox 
{
	
	private final Lock aLock = new ReentrantLock();
	private final Condition aCond = aLock.newCondition();
	
	private int aNum = 0;
	
	
	public void add(int pNum)
	{
		aNum += pNum;
	}
	
	public void whatsInTheBox()
	{
		System.out.println(aNum);
	}
}
