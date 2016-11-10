package strings;

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		StringRemover run = new StringRemover();
		
		run.setRemover("sxsssxssxsxssexssxsesss", "xs");
		System.out.println(run);
		
		run.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
		System.out.println("\n"+run);
		
		run.setRemover("xR-MxR-MHelloxR-M ", "R-M");
		System.out.println("\n"+run);
	}
}
