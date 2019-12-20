package mypackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		
		String input;
		String message = null;
		int i;
		int checkSum = 0;
		
		System.out.print("What is your message? ");
		
		input = scnr.nextLine();
		input = input.toUpperCase();
		message = input.replace(" ", "");
		
		System.out.print("Your encoded message is ");
		
		for (i = 0; i <= message.length(); i++) {
			int n = (int)message.charAt(i);
			checkSum = checkSum + n;
			if (i < message.length() - 1) {
			System.out.print(((int)message.charAt(i) - 64) + " - ");
		}
			else {
				System.out.println(n - 64);
				System.out.println("Message Checksum is " + checkSum);
				
			}
		}
	}

}
