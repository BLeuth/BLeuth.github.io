package scannerFiles;

import java.util.Scanner;
import static java.lang.System.*;
import java.io.IOException;
import java.io.File;

public class AverageRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner skip = new Scanner(new File("data/average.dat"));
		int size = skip.nextInt();
		skip.nextLine();
		
		for(int i=0; i<size; i++){
			
			String line = skip.nextLine();
			Average stuff = new Average(line);
			System.out.println(stuff + "\n");
		}
	}
}
