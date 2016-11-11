package strings;

import java.util.ArrayList;

public class Pirate {

	String text = "";
	ArrayList<String> wChange = new ArrayList<String>();
	
	public Pirate(String string){
		text=string;
		loadArray(string);
		arrayChange();
	}
	
	public void loadArray(String string){
		for(String a : string.split("\\s")){
			wChange.add(a);
		}
	}
	
	public void arrayChange(){
		for(int i=0; i<wChange.size(); i++){
			String string = wChange.get(i);
			if(wChange.get(i).contains(string)){
				wChange.set(i, wChange.get(i).replaceAll("hello", "ahoy"));
			}
		}
	}
	
	public String pirateText(){
		String pText="";
		for(int i=0; i<wChange.size(); i++){
			pText+=wChange.get(i) + " ";
		}
		return pText;
	}
	
	public String toString(){
		return pirateText();
	}
}
