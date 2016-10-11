package reviewLabs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DriverLicense {
	
	public String[] cAns = new String[20];
	public String[] sAns = new String[20];

	public DriverLicense(String studentA){
		loadCorrectAns();
		
		int i=0;
		for(String pi : studentA.split("")){
			sAns[i]= pi;
			i++;
		}
	}
	
	public void loadCorrectAns(){
		try {
			Scanner answers = new Scanner(new File("data/DriveScoreAns.dat"));
			String ans = answers.nextLine();
			
			int i=0;

			for(String pi : ans.split(" ")){
				cAns[i]= pi;
				i++;
			}			
			
		} catch (FileNotFoundException e) {
			System.out.println("Driver Scores ain't loadin");
		}
	}
	
	public boolean passed(){
		if(totalIncorrect()<6)
			return true;
		return false;
	}
	
	public int totalCorrect(){
		int count=0;
		for(int i=0; i<20; i++){
			if(cAns[i].equalsIgnoreCase(sAns[i])){
				count++;
			}
		}
		return count;
	}
	
	public int totalIncorrect(){
		return 20-totalCorrect();
	}
	
	public String questionsMissed(){
		String missed ="";
		for(int i=0; i<20; i++){
			if(!cAns[i].equalsIgnoreCase(sAns[i])){
				missed+=i+" ";
			}
		}
		return missed;
	}
	
	
	public String toString(){
		if(passed())
			return "\nStudent Passed\nTotal Correct: " + totalCorrect()+"\nTotal Incorrect: " +totalIncorrect()+"\nQuestions Missed: " +questionsMissed();
		return "\nStudent Failed\nTotal Correct: " + totalCorrect()+"\nTotal Incorrect: " +totalIncorrect()+"\nQuestions Missed: " +questionsMissed();
	}
}
