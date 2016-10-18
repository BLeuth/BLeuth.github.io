package reviewLabs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpiralMatrixRunner
{
	public static void main( String args[] ) throws IOException
	{
		SpiralMatrix bam = new SpiralMatrix(5);
		
		System.out.println(bam);
	}
}
