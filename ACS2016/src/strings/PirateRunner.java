package strings;

import java.util.Scanner;

public class PirateRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ahoy me maty! Welcome to the English to Pirate Language Converter!");
		
		System.out.print("\nEnter some text you would like converted: ");
		String text = scan.next();
		
		Pirate run = new Pirate(text);
	}

}
