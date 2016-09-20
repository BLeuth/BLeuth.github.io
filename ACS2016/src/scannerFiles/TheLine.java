package scannerFiles;

import static java.lang.System.*;

import java.util.Scanner;

public class TheLine
{
   private String line;

   public TheLine()
   {
   }

   public TheLine(String s)
   {
	   line=s;
   }

	public int getLargest()
	{
		Scanner idk = new Scanner(line);
		int largest = Integer.MIN_VALUE;
		while(idk.hasNextInt()){
			int num=idk.nextInt();
			if(num>largest){
				largest=num;
			}
			
		}
		idk.close();
		return largest;
	}

	public String toString( )
	{
		return line + "\nlargest = " + getLargest();
	}
}
