package reviewLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class HistoryVisualization {
	
	public int[] ages = new int[192]; //this number may be incorrect

	
	
	public HistoryVisualization(String filename){
		
		try {
			Scanner ah = new Scanner(new File(filename));
			
			int spot=0;
			while(ah.hasNextLine()){
				String line = ah.nextLine();
				String numLine = line.substring(25,27);

				if(hasNum(numLine)){
					int huh = Integer.parseInt(numLine);	
					ages[spot] = huh;
					spot++;
				}
			}
			
			ah.close();
			
			for(int i=0; i<100; i++){
				if(getAges(i)>0){
					System.out.println("Age: "+i+" Count: "+getAges(i));
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.print("File aint goin");
		}
		
	}
	
	public boolean hasNum(String string){
		String flip = string.replaceAll("[\\D]", "");
		int length = flip.length();

		if(length<1)
			return false;
		return true;
	
	}

	public int getAges(int age){
		int count=0;
		for(int hm : ages){
			if(hm==age){
				count++;
			}
		}
		return count;
	}
	
	public String toString(){
		return "Fun facts brought to you by me"	;
	}
}
