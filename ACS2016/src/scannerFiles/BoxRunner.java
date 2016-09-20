package scannerFiles;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class BoxRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner beeb = new Scanner("data/box.dat");
		int size = beeb.nextInt();
		beeb.nextLine();
		
		for(int i=0; i<size; i++){
			String line = beeb.nextLine();
			Box bob = new Box(line);
			System.out.println(bob);
		}
	}
}
