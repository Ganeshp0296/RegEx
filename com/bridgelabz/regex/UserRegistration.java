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
		
		private void lastName() {
			String lastName;
			Scanner get = new Scanner(System.in);
			System.out.println("Enter LastName: \t note:First Latter should capital");
			lastName = get.next();
	        String regex = "^[A-Z]{1}[a-z]{2,}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(lastName);
	        if (matcher.find())
				System.out.println("Pattern matched");
			else
				System.out.println("Pattern not matched");
	    }
		
		private void email() {
			String email;
			Scanner get = new Scanner(System.in);
			System.out.println("Enter LastName: \t note:First Latter should capital");
			email = get.next();
			String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}?(.[a-z]{2,3}){0,1}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			if (matcher.find())
				System.out.println("Pattern matched");
			else
				System.out.println("Pattern not matched");
		}
		
		
		private void mobileValidation() {
			String mNumber;
			Scanner get = new Scanner(System.in);
			System.out.println("Enter Mobile Number : \t Eg:91 8542365232");
			mNumber = get.next();
			String regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(mNumber);
			if (matcher.find())
				System.out.println("Pattern matched");
			else
				System.out.println("Pattern not matched");
		}
		
		public static void main(String[] args) {
			System.out.println("Welcome to regex");
			UserRegistration userRegestration = new UserRegistration();
			userRegestration.firstName();
			userRegestration.lastName();
			userRegestration.email();
			userRegestration.mobileValidation();
			
		}
	}

	


