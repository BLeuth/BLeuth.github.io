package scannerFiles;

import static java.lang.System.*;

import java.util.Scanner;

public class Box
{
   private String let;
   private int size;
   
   public Box(String string){
	   Scanner ahh = new Scanner(string);
	   let = ahh.next();
	   size = Integer.parseInt(ahh.next());
   }
   
   public void setBox(String string){
	   Scanner ahh = new Scanner(string);
	   let = ahh.next();
	   size = Integer.parseInt(ahh.next());
   }
    
	public String toString()
	{
		String output="";
		
		int count=0;
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				output+=let;
			}
			output+="\n";
		}


		return output+"\n";
	}
}
