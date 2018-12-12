package com.bhushan.bullsAndCows.generateNumber;

import com.bhushan.bullsAndCows.utils.RandomNumberUtils;

public class NumberGeneratorPlayer {
	int generatedNumber;
	
	public NumberGeneratorPlayer()
	{
		int tempGeneratedNumber=100 + (int)(Math.random() * ((999 - 100) + 1));
		while(!RandomNumberUtils.checkIfDigitsAreUnique(tempGeneratedNumber))
		{
			tempGeneratedNumber=100 + (int)(Math.random() * ((999 - 100) + 1));
		}
		
		this.generatedNumber=tempGeneratedNumber;
	}
	
	public int getCows(int guess)
	{
		int cows=0;
		int guessCounter=0;
		while(guessCounter<3)
		{
			int guessDigit=guess%10;
			int tempNumber=generatedNumber;
			guessCounter++;
			int generatedNumberCounter=0;
			while(tempNumber>0)
			{
				int tempDigit=tempNumber%10;
				tempNumber/=10;
				generatedNumberCounter++;
				if(tempDigit==guessDigit && guessCounter!=generatedNumberCounter)
				{
					cows++;
				}
			}
			guess/=10;
		}
		
		return cows;
	}
	
	public int getBulls(int guess)
	{
		int bulls=0;
		int tempNumber=generatedNumber;
		while(guess>0)
		{
			int guessDigit=guess%10;
			int tempDigit=tempNumber%10;
			if(tempDigit==guessDigit)
			{
				bulls++;
			}	
			tempNumber/=10;
			guess/=10;
		}
		
		return bulls;
	}
	
	public int getGeneratedNumber() {
		return generatedNumber;
	}

	
	
}
