package studio2;
import java.util.Scanner;

public class Ruin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			int trialRuns = 0;
			// 50% shot of winning or losing:
			double randNum = Math.random();
			boolean winorlose = (randNum >= 0.5);
			double win = 0;
			double lose = 0;
			System.out.print("What lose percentage would you like (as a decimal out of 1)");
			double chance = (in.nextDouble());
			System.out.print("What amount of money will you start with?");
			double lockStartAmount = (in.nextDouble());
			System.out.print("What would you like your win limit to be?");
			double winLimit = (in.nextDouble());
			double startAmount = lockStartAmount;
			
			//loop that runs the whole program
			while (trialRuns < 500) {
					while (startAmount > 0 && startAmount != winLimit)
			
					{
						randNum = Math.random();
						winorlose = (randNum >= chance);
						if (winorlose)
							startAmount++;
						else
							startAmount--;
						System.out.println(startAmount);
					}
					trialRuns++; //<- if we had a for loop we wouldn't need this
					if (startAmount == 0.0)
						lose++;
					else
						win++;
					startAmount = lockStartAmount;
	}
			System.out.println("We lost " + lose + " times. We won " + win + " times. You played " + trialRuns + " times.");
			double ruinRate = lose / 500;
			System.out.println("Your ruin rate is" + ruinRate);
	}
}

// hey we know how to use a for loop: for (i=0, i<=500, i++) see????? :):) love u nick