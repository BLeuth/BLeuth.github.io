package strings;

import java.util.Scanner;

public class NamesRunner {

	public static void main(String[] args) {
		
		boolean cont = true;
		
		System.out.println("Welcome to Names Generator");
		
		while(cont){
			Scanner scan =new Scanner(System.in);
			
			System.out.print("\nEnter your first name: ");
			String fName = scan.next();
			System.out.print("Enter your last name: ");
			String lName = scan.next();
			System.out.print("Enter your favorite color: ");
			String fColor =scan.next();

			
			NamesGenerator bam = new NamesGenerator(fName,lName,fColor);
			System.out.println("\nName:\n"+bam);
			
			System.out.println("\nWould you like to go again? (y/n)");
			String more = scan.next();
			
			if(more.equalsIgnoreCase("n")){
				cont = false;
				scan.close();
			}
		}
		System.out.println("\nThanks for using NameGenerator");
	}

}
