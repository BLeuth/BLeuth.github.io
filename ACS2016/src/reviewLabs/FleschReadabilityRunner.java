package reviewLabs;


public class FleschReadabilityRunner {


	public static void main( String args[] ){
		
		FleschReadability bam = new FleschReadability("http://www.rfrank.net/projects/cslabs-final/1410-flesch/Gettysburg.txt");	
		System.out.println(bam);
		
		bam = new FleschReadability("http://www.rfrank.net/projects/cslabs-final/1410-flesch/test-6th-grader.txt");
		System.out.println(bam);
		
		bam = new FleschReadability("http://www.rfrank.net/projects/cslabs-final/1410-flesch/test-college-grad.txt");
		System.out.println(bam);
		
		bam = new FleschReadability("http://www.gutenberg.org/cache/epub/1524/pg1524.txt");
		System.out.println(bam);
	}
}

