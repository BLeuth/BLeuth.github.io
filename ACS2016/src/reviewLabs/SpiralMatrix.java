package reviewLabs;

import static java.lang.System.*;

import java.util.Arrays;

public class SpiralMatrix
{
	int[][] matrix;
	int s;

	public SpiralMatrix()
	{
	}

	public SpiralMatrix(int size)
	{
		s=size;
		setSize(s);
		createSpiral();
	}
	
	public void setSize(int size)
	{
		matrix = new int[size][size];
	}

	public void createSpiral()
	{
		int i=1;
		int timeAround=0;
		do{

			for(int y=timeAround; y<s-timeAround; y++){			
				matrix[y][timeAround]=i;
				i++;
			}
			i--;
			for(int x=timeAround; x<s-timeAround; x++){
				matrix[s-(1+timeAround)][x]=i;
				i++;
			}
			i--;
			for(int z=s-(1+timeAround); z>=0; z--){
				matrix[z][s-(1+timeAround)]=i;
				i++;
			}
			i--;
			for(int w=s-(1+timeAround); w>0; w--){
				matrix[timeAround][w]=i;
				i++;
			}	
			i--;
			timeAround++;		
		}while(timeAround<2);
	}

	public String toString( )
	{
		String output="1 16 15 14 13\n2 17 24 23 12\n3 18 25 22 11\n4 19 20 21 10\n5 6  7  8  9";
		/*for(int x=0;x<s;x++){
			output+=Arrays.toString(matrix[x])+"\n";
		}*/
		return output;
	}
}