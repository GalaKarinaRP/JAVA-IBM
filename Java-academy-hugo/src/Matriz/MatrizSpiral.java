package Matriz;

public class MatrizSpiral {

	public static void main(String[] args) {
		int filas = 4;
		int columnas = 4;		
		
		 boolean derecha = true, izquierda = false, abajo = false;
		  int[][] matriz = new int[ filas ][ columnas ];
		  int x = 0, y = -1;

		  for( int k = 1; k <= columnas * filas; k++ ) {
		    if( izquierda ) {
		      y --;
		      if( y == -1 ) {
		        y = 0; x --;
		        izquierda = false;
		      } else if( matriz[ x ][ y ] != 0 ) {
		        y ++; x --;
		        izquierda = false;
		      }
		    } else if( derecha ) {
		      y ++;
		      if( y == columnas ) {
		        y = columnas - 1; x ++;
		        derecha = false;
		        abajo = true;
		      } else if( matriz[ x ][ y ] != 0 ) {
		        y --; x ++;
		        derecha = false;
		        abajo = true;
		      }
		    } else if( abajo ) {
		      x ++;
		      if( x == filas ) {
		        x = filas - 1; y --;
		        abajo = false;
		        izquierda = true;
		      } else if( matriz[ x ][ y ] != 0 ) {
		        y --; x --;
		        abajo = false;
		        izquierda = true;
		      }
		    } else {
		      x --;
		      if( x == -1 || matriz[ x ][ y ] != 0 ) {
		        x ++; y ++;
		        derecha = true;
		      }
		    }

		    matriz[ x ][ y ] = k;
		  }

		  for( int i = 0; i < filas; i++ ) {
		    for( int j = 0; j < columnas; j++ ) {
		      System.out.print( matriz[ i ][ j ] + "\t" );
		    }
		    System.out.println();
		  }

		
		}

	

}
