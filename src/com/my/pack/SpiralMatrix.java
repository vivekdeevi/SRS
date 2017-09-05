package com.my.pack;

public class SpiralMatrix {

	public static void main(String[] args) 
	{
		new SpiralMatrix();
	 }
	 
	 public SpiralMatrix() 
	 {
	  int[][] matrix = {
	   {1,  2,  3,  4},
	   {5,  6,  7,  8},
	   {9, 10, 11, 12},
	   {13, 14, 15, 16}
	  };
	  for(int i=0;i<matrix.length;i++)
	  {
		  for(int j=0;j<matrix[0].length;j++)
		  {
			  System.out.print(matrix[i][j]+" ");
		  }
		  System.out.println();
	  }
	   
	  printMatrix(matrix);
	 }
	  
	 private void printMatrix(int[][] matrix){
	 
	  int rowStart=0;
	  int rowLength=matrix.length-1;
	  System.out.println(rowLength);
	   
	  int colStart=0;
	  int colLength = matrix[0].length-1;
	  System.out.println(colLength);
	   
	  while(rowStart <= rowLength && colStart <= colLength)
	  {
	   
	   for (int i = rowStart; i <= colLength; i++)
	   {
	    System.out.print(matrix[rowStart][i] + " ");
	   }
	 
	   for (int j = rowStart+1; j <= rowLength; j++) 
	   {
	    System.out.print(matrix[j][colLength] + " ");
	   }
	    
	   if(rowStart+1 <= rowLength)
	   {
	    for (int k = colLength-1; k >= colStart; k--) {
	     System.out.print(matrix[rowLength][k] + " ");
	    }
	   }
	   if(colStart+1 <= colLength)
	   {
	    for (int k = rowLength-1; k > rowStart; k--)
	    {
	     System.out.print(matrix[k][colStart] + " ");
	    }
	   }
	    
	   rowStart++;
	   rowLength--;
	   colStart++;
	   colLength--;
	  }
	 }
	}


