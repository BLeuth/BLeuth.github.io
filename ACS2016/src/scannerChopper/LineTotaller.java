package scannerChopper;

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{		
		line=s;
	}

	public void setLine(String s)
	{
		line=s;
	}

	public int getSum()
	{
		Scanner piggy = new Scanner(line);
		
		int total = 0;
		while(piggy.hasNext()){	
			total+=piggy.nextInt();
		}
		
		piggy.close();
		return total;
	}

	public String getLine()
	{
		return "sum = " + getSum();
	}

	public String toString()
	{
		return line + "\n" + getLine();
	}
}

