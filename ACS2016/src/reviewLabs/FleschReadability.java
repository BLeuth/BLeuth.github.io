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
		System.out.println("avg wl" +avg);
		return avg;
	}
	
	public double avgSentl(){
		double avg=0.0;
		for(int i=0; i<sentences.size(); i++){
			avg += sentences.get(i).length();
		}
		avg = avg/sentences.size();
		System.out.println("avg sl" +avg);
		return avg;
	}
	
	public double readScore(){
		double score=0;
		score = 206.835-((avgSentl()*1.015)+(avgWordl()*84.6));
		return score;
	}
	
	public String readIndex(){
		return "";
	}
	
	public String toString(){
		return Arrays.toString(words.toArray())+"\n"+Arrays.toString(sentences.toArray())+"\n"+wordCount()+"\n"+sylCount()+"\n"+sentCount()
		+"\nrscore"+readScore();
	}
}
