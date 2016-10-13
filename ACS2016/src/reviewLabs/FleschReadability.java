package reviewLabs;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FleschReadability {

	public ArrayList<String> words = new ArrayList<String>();
	public ArrayList<String> sentences = new ArrayList<String>();
	
	public FleschReadability(String string){
		
		try {
			URL url = new URL(string);
			Scanner scan = new Scanner(url.openStream());
						
			while(scan.hasNextLine()){
				String line = scan.nextLine();

				for(String lame : line.split("\\s|\\.\\s*|\\,\\s*")){
					words.add(lame);
				}
			}
			
			scan = new Scanner(url.openStream());
			String big="";
			while(scan.hasNextLine()){
				big+=scan.nextLine();
			}
			
			for(String bam : big.split("\\.\\s*|\\:\\s*|\\;\\s*|\\?\\s*|\\!\\s*")){
				sentences.add(bam);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace(); System.out.println("URL no go");
		}
	}
	
	public int wordCount(){
		return words.size();
	}
	
	public int sentCount(){
		return sentences.size();
	}
	
	public int sylCount(){
		int count=0;
		for(int i=0; i<wordCount(); i++){
			ArrayList<String> syl = new ArrayList<String>();
			String boom = words.get(i);
			for(String string : boom.split("[[aeiouAEIOU][aeiouAEIOU]*]")){
				syl.add(string);
			}
			count+=syl.size();
		}
		return count;
	}
	
	public double avgWordl(){
		double avg=0.0;
		for(int i=0; i<words.size(); i++){
			avg += words.get(i).length();
		}
		avg = avg/words.size();
		System.out.println("avg wl " +avg);
		return Math.round(avg);
	}
	
	public double avgSentl(){
		double avg=0.0;
		ArrayList<String> thingies = new ArrayList<String>();
		
		for(int i=0; i<sentences.size(); i++){
			for(String sup : sentences.get(i).split("\\s|\\.\\s*|\\,\\s*")){
				thingies.add(sup);
			}
		}
		
		avg = (double)thingies.size()/(double)sentences.size();
		System.out.println("avg sl " +avg);
		return Math.round(avg);
	}
	
	public double readScore(){
		double score=0;
		//score = 206.835-((avgSentl()*1.015)+(avgWordl()*84.6));
		score = 206.835-(avgSentl()*1.015)-(374/265);
		System.out.println("readSentl: "+avgSentl()*1.015);
		System.out.println("readWordl: "+avgWordl()*84.6);
		return score;
	}
	
	public String readIndex(){
		return "";
	}
	
	public String toString(){
		return "Word ArrayList: "+Arrays.toString(words.toArray())+"\nSentence ArrayList: "+Arrays.toString(sentences.toArray())+"\nWord Count: "+wordCount()+"\nSylable Count: "+sylCount()+"\nSentence Count: "+sentCount()
		+"\nReadability Score: "+readScore();
	}
}
