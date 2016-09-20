package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
   {
	   line=s;
   }

	public void setLine(String s)
	{
		line=s;
	}

	public int getCount()
	{
		Scanner josh = new Scanner(line);
		int count=0;
		
		while(josh.hasNext()){
			josh.next();
			count++;
		}
		josh.close();
		
		return count;
	}

	public String getLine()
	{
		return "count = " + getCount();
	}

	public String toString()
	{
		return line + "\n" + getLine();
	}
}