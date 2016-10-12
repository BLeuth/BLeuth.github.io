package reviewLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HistoryVisualization {
	
	public int[] ages = new int[191]; //this number may be incorrect

	
	
	public HistoryVisualization(String filename){
		
		try {
			Scanner ah = new Scanner(new File(filename));
			
			int i=0;
			while(ah.hasNextLine()){
				/*String line = ah.nextLine();
				int huh = Integer.parseInt(line.replaceAll("[\\D]", ""));
				System.out.print(huh);
				if(line.matches("[\\d]")){
					ages[i] = huh;
				}*/
				String line = ah.nextLine();
				
				if(hasNum(line)){
					int huh = Integer.parseInt(line.replaceAll("[\\D]", ""));
					
					ages[i] = huh;
					i++;
					System.out.print(i);
				}
				
				/*if((line.replaceAll("[\\D]","")).matches("[\\d]")){
					int huh = Integer.parseInt(line.replaceAll("[\\D]", ""));
					ages[i] = huh;
					i++;
				}*/
			}
			
			ah.close();
			
		} catch (FileNotFoundException e) {
			System.out.print("File aint goin");
		}
		
	}
	
	public boolean hasNum(String string){
		Scanner scan = new Scanner(string);
		if(scan.hasNextInt()){
			return true;
		}
		return false;
	
	}

	
	public String toString(){
		return Arrays.toString(ages)+"";
	}

}
