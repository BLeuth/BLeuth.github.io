package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenCounter
{
	private String line;

   public OddEvenCounter()
   {
   }

   public OddEvenCounter(String s)
   {
	   line=s;
   }

	public void setLine(String s)
	{
		line=s;
	}

	public int getEvenCount()
	{
		Scanner drR = new Scanner(line);
		int count= 0;
		while(drR.hasNext())
			if(drR.nextInt()%2==0)
				count++;
		drR.close();
		return count;
	}

	public int getOddCount()
	{
		Scanner drR = new Scanner(line);
		int count= 0;
		while(drR.hasNext())
			if(drR.nextInt()%2!=0)
				count++;
		drR.close();
		return count;
	}

	public String toString( )
	{
		return line + "\neven count = " + getEvenCount()
		+ "\nodd count = " + getOddCount();
	}
}
