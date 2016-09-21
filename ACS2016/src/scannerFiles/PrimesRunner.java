package scannerFiles;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class PrimesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner data = new Scanner(new File("data/primes.dat"));
		int size = data.nextInt();

		for(int i=0; i<size; i++){
			data.nextLine();
			Prime lol = new Prime(data.nextInt());
			out.println(lol);
		}
	}
}
