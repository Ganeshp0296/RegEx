package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
		String firstName;
		public void firstName() {
			Scanner get = new Scanner(System.in);
			System.out.println("Enter Name: \t note:First Latter should capital");
			firstName = get.next();
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
	        if (matcher.find())
				System.out.println("Pattern matched");
			else
				System.out.println("Pattern not matched");
	    }
		public static void main(String[] args) {
			System.out.println("Welcome to regex");
			UserRegistration userRegestration = new UserRegistration();
			userRegestration.firstName();
		}
	}

	


