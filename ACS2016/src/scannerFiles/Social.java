package scannerFiles;

import static java.lang.System.*;

import java.util.Scanner;

public class Social
{
   private String socialNum;

	public Social()
	{
	}

	public Social(String soc)
	{
		socialNum=soc;
	}

	public void setSocial(String soc)
	{
		socialNum=soc;
	}

	public int getSum()
	{
		Scanner adam = new Scanner(socialNum);
		adam.useDelimiter("-");
		
		int sum=0;
		while(adam.hasNextInt()){
			sum+=adam.nextInt();
		}
		adam.close();
		return sum;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a sum of " + getSum();
	}
}