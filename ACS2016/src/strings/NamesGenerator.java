package strings;

public class NamesGenerator {

	String fName="";
	String lName="";
	String color="";
	String finalName="";
	
	public NamesGenerator(String f, String l, String c){
		fName=f;
		lName=l;
		color=c;
		
		addPrefix();
		jumbleStuff();
		addSuffix();
	}
	
	public void addPrefix(){
		int random=(Math.random()<=.5) ? 1:2;
		if(random==1)
			finalName= "Mr. ";
		else
			finalName= "Ms. ";
	}
	
	public void jumbleStuff(){
		int rand = (int)(Math.random()*5+1);	
		if(rand==1)
			finalName+= color+fName;
		else if(rand==2)
			finalName+= color+lName;
		else if(rand==3)
			finalName+= lName.substring(0, (lName.length()/2))+color;
		else if(rand==4)
			finalName+= color.substring(0, color.length()/2)+lName;
		else if(rand==5)
			finalName+= color+lName.substring(0,lName.length()/2)+" "+fName.substring(0, fName.length()/2);
	}
	
	public void addSuffix(){
		int rand = (int)(Math.random()*3+1);
		if(rand==1)
			finalName+=" I";
		else if(rand==2)
			finalName+=" XXX";
	}

	public String toString(){
		return finalName;
	}
}
