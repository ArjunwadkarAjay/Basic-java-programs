import java.util.*;
class Star extends Thread
{
public void run()
	{
	for(int i=1;i<=5;i++)	
	{		System.out.print("*");
		try
		{
		Thread.sleep(10);
		}catch(Exception e)
		{
			System.out.print(e);
		}
	}
	}

}
class slash extends Thread
{
public void run()
	{
	for(int i=1;i<=5;i++)	
	{		System.out.print("/");
		try
		{
		Thread.sleep(10);
		}catch(Exception e)
		{
			System.out.print(e);
		}
	}
	}

}
class MultiThread
{
static
 {
 System.out.println("Ajay Arjunwadkar"+" "+"Divison:A"+" "+"Roll No:305");
 }
public static void main(String args[])
	{
	Star S  = new Star();
	slash H = new slash();
	S.start();
	H.start();
	}

}
