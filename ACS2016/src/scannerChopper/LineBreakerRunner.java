package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreakerRunner
{
   public static void main(String args[])
   {
	   LineBreaker test = new LineBreaker("1 2 3 4 5 6 7 8 a b c d",4);
	   System.out.println(test);
	   
	   test = new LineBreaker("R J E O I S D H",2);
	   System.out.println("\n"+test);
	}
}