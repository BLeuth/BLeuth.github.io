package reviewLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HistoryVisualization {
	
	public int[] ages = new int[191]; //this number may be incorrect

	
	
	public HistoryVisualization(String filename){
		
		try {
			Scanner ah = new Scanner(new File(filename));
			
			for(int i=0; i<201; i++){
				String huh = ah.nextLine();
				getAge(huh);
			}
			
		} catch (FileNotFoundException e) {
			System.out.print("File aint goin");
		}
		
	}
	
	public int getAge(String string){
		
		return 0;
	}
	
	public String toString(){
		return "";
	}

}
