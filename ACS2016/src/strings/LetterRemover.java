package strings;

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover(String sent, char look)
	{
		setRemover(sent,look);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		String regex = "[" + lookFor + "]";
		cleaned = cleaned.replaceAll(regex, "");
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n"+ removeLetters();
	}
}
