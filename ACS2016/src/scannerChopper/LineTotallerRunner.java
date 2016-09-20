package scannerChopper;

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
	   LineTotaller test = new LineTotaller("1 2 3 4 5 6");
	   System.out.println(test);

	   test = new LineTotaller("5 5 5");
	   System.out.println("\n"+test);
	}
}

