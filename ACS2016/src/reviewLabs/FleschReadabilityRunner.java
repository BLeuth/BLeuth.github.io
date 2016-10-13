package reviewLabs;

public class FleschReadabilityRunner {

	public static void main( String args[] ){
		
		FleschReadability bam = new FleschReadability("http://www.rfrank.net/projects/cslabs-final/1410-flesch/Gettysburg.txt");
		
		System.out.println(bam);
	}
}
