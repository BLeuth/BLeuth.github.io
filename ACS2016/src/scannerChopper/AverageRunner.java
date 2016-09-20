package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
   public static void main( String args[] )
   {
	   Average test = new Average("9 10 5 20");
	   System.out.println(test);
	   
	   test = new Average("48 52 29 100 50 29");
	   System.out.println("\n" + test);
	}
}

