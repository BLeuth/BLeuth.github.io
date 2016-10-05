package reviewLabs;

import static java.lang.System.*;

public class MadLibRunner
{
	public static void main( String args[] )
	{
		MadLib bam = new MadLib("data/story.dat");
		
		out.println(bam+"\n");
	}
}
