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
		Scanner suh = new Scanner(line);
		int lowest = Integer.MAX_VALUE;
		while(suh.hasNextInt()){
			int wha = suh.nextInt();
			if(wha<lowest)
				lowest=wha;
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
		average = Math.round(average*100)/100D;
		suh.close();
		return average;
	}

	//write a getLine method




	public String toString(){
		return line + "\n" + "average = " + getAverage();
	}




}