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
		boolean cont=true;
		while(cont){
			int index = cleaned.indexOf(remove);
			if(index>-1){
				String a = cleaned.substring(0,index-1);
				String b = cleaned.substring(index+remove.length());
				cleaned= a+b;
			}
			else{
				cont=false;
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + "   " + remove + "\n" + removeStrings();
	}
}
