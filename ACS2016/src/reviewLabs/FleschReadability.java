package reviewLabs;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FleschReadability {

	public ArrayList<String> words = new ArrayList<String>();
	public ArrayList<String> sentences = new ArrayList<String>();
	public String fName = "";
	
	public FleschReadability(String string){
		
		fName=string;
		
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
				big+=scan.nextLine()+" ";
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
		int ah=0; int hm=0;
		String boom="";
		ArrayList<String> syl = new ArrayList<String>();
		for(int i=0; i<wordCount(); i++){
			
			boom += words.get(i)+" ";
		}
		System.out.println("BOOM!!! " + boom);
		for(String string : boom.split("[aeiouy]+?\\w*?[^e]"/*"[aeiouAEIOU][aeiouAEIOU]*[^\\s]"*//*[aeiouAEIOU]*^\\s"*/)){
			syl.add(string);
			ah++;
		}
		for(String string : boom.split("[aeiouAEIOU][aeiouAEIOU]*[^\\s]")){
			hm++;
		}
		System.out.println(syl.toString());
		count=syl.size();
		
		return (ah+hm)/2;
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
		score = 206.835-(avgSentl()*1.015)-((sylCount()/265)*84.6);
		System.out.println("readSentl: "+avgSentl()*1.015);
		System.out.println("readWordl: "+avgWordl()*84.6);
		return score;
	}
	
	public String readIndex(){
		double score = readScore();
		if(score>=91)
			return "5th Grade";
		if(score>=81)
			return "6th Grade";
		if(score>=71)
			return "7th Grade";
		if(score>=61)
			return "8th and 9th Grade";
		if(score>=51)
			return "10th to 12th Grade";
		if(score>=31)
			return "College Student";
		if(score>=0)
			return "College Graduate";
		return "Are you sure you entered a text?";
	}
	
	public String toString(){
		return "Word ArrayList: "+Arrays.toString(words.toArray())+"\nSentence ArrayList: "+Arrays.toString(sentences.toArray())+"\nSourceFile: "+fName+"\nWord Count: "+wordCount()+"\nSylable Count: "+sylCount()+"\nSentence Count: "+sentCount()
		+"\nReadability Score: "+readScore()+"\nEducational Level: "+ readIndex();
	}
}
