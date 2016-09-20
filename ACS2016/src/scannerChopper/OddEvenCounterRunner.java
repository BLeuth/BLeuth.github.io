package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounterRunner
{
   public static void main(String args[])
   {
	   OddEvenCounter test = new OddEvenCounter("9 10 5 20");
	   System.out.println(test);
	   
	   test = new OddEvenCounter("1 3 5 7 9 2");
	   System.out.println("\n"+test);
	}
}

