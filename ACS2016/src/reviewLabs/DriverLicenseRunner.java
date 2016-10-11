package reviewLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DriverLicenseRunner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String sAns="";
		for(int i=1; i<=20; i++){
			System.out.print("Answer for question "+i+": ");
			String blamo = scan.next();
			if(ok(blamo)){
				sAns+=blamo;
			}
			else{
				System.out.println("Try Again");
				i--;
			}
		}
		
		DriverLicense boom = new DriverLicense(sAns);
		System.out.println(boom);
		
		
	}
	
	public static boolean ok(String a){
		if(a.equalsIgnoreCase("a")){
			return true;
		}
		else if(a.equalsIgnoreCase("b")){
			return true;
		}
		else if(a.equalsIgnoreCase("c")){
			return true;
		}
		else if(a.equalsIgnoreCase("d")){
			return true;
		}
		else{
			return false;
		}
	}

}
