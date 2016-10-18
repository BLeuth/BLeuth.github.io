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
			
			for(int y=0; y<s; y++){			
				matrix[y][timeAround]=i;
				i++;
			}
			i--;
			for(int x=0; x<s; x++){
				matrix[s-1][x]=i;
				i++;
			}
			i--;
			for(int z=s-1; z>=0; z--){
				matrix[z][s-1]=i;
				i++;
			}
			i--;
			for(int w=s-1; w>0; w--){
				matrix[0][w]=i;
				i++;
			}	
			i--;
			timeAround++;		
		}while(timeAround<3/*=s*/);
	}

	public String toString( )
	{
		String output="";//+Arrays.deepToString(matrix);
		for(int x=0;x<s;x++){
			output+=Arrays.toString(matrix[x])+"\n";
		}
		return output;
	}
}