package arraysDemo;

public class Tw2DArray {

	public static void main(String[] args) {

		
		//datatype arrayname[][] = new datatype[][];
		
		String names[][] = new String[2][4];
		
		names[0][0]= "Ram";
		names[0][1]= "Ram";
		names[0][2]= "Ram";
		names[0][3]= "Ram";
		
		
		names[1][0]= "Ram";
		names[1][1]= "Ram";
		names[1][2]= "Ram";
		names[1][3]= "Ram";
		
		int lenofrows = names.length;
		
		System.out.println("The length of 2D array is "+lenofrows);
		
		int lenofcols = names[0].length;
		
		System.out.println("The length of 2D array is "+lenofcols);
		
		System.out.println(names[1][2]);
		
		for(int rows=0;rows<lenofrows;rows++) {
			for(int cols=0;cols<lenofcols;cols++) {
				System.out.println("The total rows & columns are "+names[rows][cols]);
			}
		}
		
	}

}
