package nestedFor;

import static java.lang.System.*;

public class TriangleTwo
{
   private int size;
   private String letter;

	public TriangleTwo()
	{
	}

	public TriangleTwo( String let, int sz)
	{
		letter=let;
		size=sz;
	}

	public void setTriangle(int count, String let)
	{
		letter=let;
		size=count;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for(int i=0; i<size; i++){
			for(int j=i; j<size; j++)
			{
				output+=letter;
			}
			output+="\n";
		}






		return output+"\n";
	}
}