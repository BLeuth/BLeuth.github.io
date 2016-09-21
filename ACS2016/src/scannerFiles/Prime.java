package scannerFiles;

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime(int num){
		number=num;
	}
	

	public void setPrime(int num)
	{
		number=num;
	}

	public boolean isPrime(){
		for(int i=2; i<number; i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}







	public String toString()
	{
		if(isPrime())
			return number + " Is Prime."; 
		return number + " Is Not Prime.";
	}
}
