package com.bhushan.bullsAndCows.generateNumber;

import java.util.Scanner;

import com.bhushan.bullsAndCows.utils.RandomNumberUtils;

public class PlayAsNumberGenerator {
	
	public void playGame()
	{
		NumberGeneratorPlayer player=new NumberGeneratorPlayer();
		
		int bulls=0;
		int cows=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("I have thought of a number...Let's see how many tries you take to guess !! \n");
		while(bulls !=3)
		{
			System.out.println("Enter your guess \n");
					
			int length;
			int guess=sc.nextInt();
			length=RandomNumberUtils.getDigitCount(guess);
			while(!RandomNumberUtils.checkIfDigitsAreUnique(guess) || length !=3)
			{
				if(length!=3)
				{
					System.out.println("Please Enter a number with exactly 3 digits! \n"
							+ "Enter your guess");
				}
				else
				{
					System.out.println("Please Enter a number with unique digits! \n"
							+ "Enter your guess");
				}
				
				guess=sc.nextInt();
				length=RandomNumberUtils.getDigitCount(guess);
			}
			cows=player.getCows(guess);
			bulls=player.getBulls(guess);
			
			System.out.println("You Got "+ bulls + " Bulls and " + cows + " Cows !!\n");
//					+ "Against ->"+ player.getGeneratedNumber()+"\n");
			
		}
		
		System.out.println("Woah! You are bang on!\n "
				+ "Congratulations!!! \n");
	}
	
}
 