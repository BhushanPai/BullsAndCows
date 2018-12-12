package com.bhushan.bullsAndCows.utils;

import java.util.HashSet;

public class RandomNumberUtils {

	public static boolean checkIfDigitsAreUnique(int number)
	{
		int length=0;
		HashSet<Integer> digitSet=new HashSet<>();
		while(number>0)
		{
			digitSet.add(number%10);
			number/=10;
			length++;
		}
		return digitSet.size()==length;
	}
}
