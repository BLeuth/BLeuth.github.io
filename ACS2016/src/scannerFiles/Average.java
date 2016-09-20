package scannerFiles;

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

   public Average(String string){
	   line = string;
   }

	public void setLine(String string){
		line = string;
	}




	private int getLowest()
	{
		int lowest=Integer.MAX_VALUE;
		Scanner suh = new Scanner(line);
		while(suh.hasNextInt()){
			if(suh.nextInt()<lowest)
				lowest=suh.nextInt();
		}

		suh.close();
		return lowest;
	}

	public double getAverage()
	{
		double average=0.0;
		Scanner suh = new Scanner(line);
		
		double total=0;
		double sum=0;
		
		while(suh.hasNextInt()){
			total+=suh.nextInt();
			sum++;
		}
		
		average = (total-(double)getLowest())/(sum-1.00);

		return average;
	}

	//write a getLine method




	public String toString(){
		return line + "\n" + "average = " + getAverage();
	}




}