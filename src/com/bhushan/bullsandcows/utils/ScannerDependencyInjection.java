package com.bhushan.bullsAndCows.utils;

import java.util.Scanner;


//TODO : justify why singleton pattern is not used.
public class ScannerDependencyInjection {

	// static variable scanner of type Scanner
	private static Scanner scanner = null; 
	
	private ScannerDependencyInjection() 
    { 
		this.scanner=new Scanner(System.in);
    } 
	public static Scanner getInstance() 
    { 
        if (scanner == null) 
        {
        	new ScannerDependencyInjection();
        }
        return scanner; 
    } 
}