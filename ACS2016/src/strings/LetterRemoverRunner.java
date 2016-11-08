package strings;

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover run = new LetterRemover("I am Sam I am   a",'a');	
		System.out.println(run);
		
		run = new LetterRemover("Josh is super cool",'o');
		System.out.println(run);
											
	}
}