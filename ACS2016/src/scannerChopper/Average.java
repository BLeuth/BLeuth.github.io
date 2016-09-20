package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

   public Average()
   {
   }

   public Average(String s)
   {
	   line=s;
   }

	public void setLine(String s)
	{
		line=s;
	}

	
	public int getCount()
	{
		Scanner pen = new Scanner(line);
		int count=0;
		
		while(pen.hasNext()){
			count++;
			pen.next();
		}
		
		pen.close();
		return count;
	}


	public int getSum()
	{
		Scanner pen = new Scanner(line);
		int sum=0;
		
		while(pen.hasNext()){
			sum+=pen.nextInt();
		}
		
		pen.close();
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = (double)getSum()/(double)getCount();
		return average;
	}

	public String getLine()
	{
		return "Average = " + getAverage();
	}

	public String toString()
	{
		return line + "\n" + getLine();
	}
}