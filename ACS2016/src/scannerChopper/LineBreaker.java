package scannerChopper;

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
   private String line;
   private int breaker;

   public LineBreaker()
   {
   	this("",0);
   }

   public LineBreaker(String s, int b)
   {
	   line=s;
	   breaker=b;
   }

	public void setLineBreaker(String s, int b)
	{
		line=s;
		breaker=b;
	}

	public String getLine()
	{
		return line;
	}

	public String getLineBreaker()
	{
		Scanner watch = new Scanner(line);
		String box ="";
		int count=0;
		
		while(watch.hasNext()){
			if(count<breaker){
				box+=watch.next();
				count++;
			}
			else if(count>=breaker){
				box+="\n";
				count=0;
			}
		}
		watch.close();
		return box;
	}

	public String toString()
	{
		return line + "\n" + getLineBreaker();
	}
}
