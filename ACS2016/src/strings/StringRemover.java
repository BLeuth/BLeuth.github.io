package strings;

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	public StringRemover(){
	}
	

	public void setRemover(String s, String rem)
	{
		sentence=s;
		remove=rem;
	}

	public String removeStrings()
	{
		String cleaned = sentence;
		String regex = ".[" + remove + "]";
		cleaned = cleaned.replaceAll(regex,"");
		return cleaned;
	}

	public String toString()
	{
		return sentence + "   " + remove + "\n" + removeStrings();
	}
}
