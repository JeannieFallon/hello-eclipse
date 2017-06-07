package main;

import java.util.Scanner;

import object.Greeter;

public class Greet {

	public static void main(String[] args) {
		
		String name = new String();
		int number = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello!");
		System.out.println("What is your name?");
		
		name = in.next();
		
		do {
			System.out.println("Enter a number between one and ten.");
			while(!in.hasNextInt()) {
				System.out.println("Invalid input. Enter a number between one and ten.");
				in.next();
			}
			number = in.nextInt();
		} while(number < 1 || number > 10);
		
		in.close();
		
		Greeter greeter = new Greeter(number);
		greeter.sayHi(name);

	}

}
