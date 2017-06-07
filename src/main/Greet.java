package main;

import java.util.Scanner;

import object.Greeter;

public class Greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello!");
		System.out.println("What is your name?");
		
		String user = in.next();
		
		System.out.println("Choose a number between one and ten.");
		
		int number = in.nextInt();
		
		in.close();

		Greeter greeter = new Greeter(number);
		
		greeter.sayHi(user);

	}

}
