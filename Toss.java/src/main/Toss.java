package main;

import java.util.Random;

public class Toss
{
	final static int LEN = 20;
	static Random rand = new Random();
	public static void main(String args[])
	{
		int[] dies = new int[LEN];
		for(int i = 0; i < 20; i++)
		{
			dies[i] = rand.nextInt(6) + 1;
		}
		
		boolean inRun = false;
		for(int i = 0; i < 20; i++)
		{
			if(inRun)
			{
				if(dies[i] != dies[i - 1])
				{
					System.out.print(")");
					inRun = false;
				}
			}
			if(!inRun)
			{
				if(dies[i] == dies[i + 1])
				{
					System.out.print("(");
					inRun = true;
				}
			}
			System.out.print(dies[i]);
		}
		if(inRun)
		{
			System.out.println(")");
		}
	}
}

