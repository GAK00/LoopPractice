package loop.controller;

import java.util.Scanner;

public class LoopController
{
	Scanner scan;

	public LoopController()
	{
		scan = new Scanner(System.in);
	}

	public void start()
	{
		boolean continueSayingBaah = true;
		while (continueSayingBaah)
		{
			System.out.println("bahh");
			System.out.println("Should I say baahh again");
			if (!scan.nextLine().equalsIgnoreCase("yes"))
			{
				continueSayingBaah = false;
			}
		}
		System.out.println("Lets count to 100 Press Enter to contiue");
		scan.nextLine();
		for(int number = 0;number<=100;number++){
			System.out.println(number);
		}
		System.out.println("That was fun");
	}
}
