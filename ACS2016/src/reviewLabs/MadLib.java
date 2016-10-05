package reviewLabs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	String fStory;
	
	public MadLib()
	{



	}

	public MadLib(String fileName)
	{
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			
			String bam = file.nextLine();
			
			ArrayList<String> story = new ArrayList<String>();

			for(String whoop : bam.split(" ")){
				story.add(whoop);
			}
			
			for(int i=0; i<story.size(); i++){
				if(story.get(i).equals("#")){
					story.set(i, getRandomNoun());
				}
				if(story.get(i).equals("@")){
					story.set(i, getRandomVerb());
				}
				if(story.get(i).equals("&")){
					story.set(i, getRandomAdjective());
				}
			}
			
			for (String s : story)
			{
			    fStory += s + " ";
			}
		
			file.close();
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			nouns = new ArrayList<String>();
			Scanner scan = new Scanner(new File("data/nouns.dat"));
			
			while(scan.hasNextLine()){
				nouns.add(scan.nextLine());
			}
		
			scan.close();
		
		
		}
		catch(Exception e)
		{
			out.println("Nouns aint workin");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			verbs = new ArrayList<String>();
			Scanner scan = new Scanner(new File("data/verbs.dat"));
			
			while(scan.hasNextLine()){
				verbs.add(scan.nextLine());
			}
	
			scan.close();
	
	
		}
		catch(Exception e)
		{
			out.println("Verbs aint workin");
		}
	}

	public void loadAdjectives()
	{
		try{
			adjectives = new ArrayList<String>();
			Scanner scan = new Scanner(new File("data/adjectives.dat"));
			
			while(scan.hasNextLine()){
				adjectives.add(scan.nextLine());
			}
	
			scan.close();
	
	
		}
		catch(Exception e)
		{
			out.println("Adjectives aint workin");
		}
	}

	public String getRandomVerb()
	{
		Random rand = new Random();
		int get = rand.nextInt(verbs.size());
		return verbs.get(get);
	}
	
	public String getRandomNoun()
	{
		Random rand = new Random();
		int get = rand.nextInt(nouns.size());
		return nouns.get(get);
	}
	
	public String getRandomAdjective()
	{
		Random rand = new Random();
		int get = rand.nextInt(adjectives.size());
		return adjectives.get(get);
	}		

	public String toString()
	{
	   return fStory +"\n\n\n";
	}
}
