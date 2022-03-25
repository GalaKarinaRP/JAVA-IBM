package Matriz;

import java.util.Arrays;

public class Matriz {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 5;
		
		int[][] matriz = new int[num1][num2];		
		
		for( int f = 0; f < matriz.length; f++ )
		{				
			 for(int c=0; c<matriz[f].length; c++)
			 {	
				if(f == 0){
					matriz[f][c] = 1;
				}	
				 if ( c == f ) {
					 matriz[f][c] = 1;					
				 }
				 
				 if(f + c == matriz.length-1){
					 matriz[f][c] = 1;
	             }	
				 
				 if(f == matriz.length-1){
					 matriz[f][c] = 1;
	             }					 
	         }
		}
		
		PrintMatriz(matriz);		

	}
	
	
	public static void PrintMatriz(int[][] matriz) {
		
		for( int i = 0; i < matriz.length; i++ ) {
			System.out.println(Arrays.toString(matriz[i]));	
		}
	}

}
