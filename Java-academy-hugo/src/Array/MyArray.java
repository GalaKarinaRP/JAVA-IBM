package Array;

import java.util.Arrays;

public class MyArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = new String[5];
		
		array[0] = "IBM";
		array[1] = "Java";
		array[2] = "Academy";
		array[3] = "Gala";
		array[4] = "Karina";
		
	   int[] numbers = new int[] {9,4,6,3,2,7,8,1,5};
	   System.out.println("Array desordenado: "+ Arrays.toString(numbers));		
	   sortArray(numbers);
		
	   System.out.println("Array desordenado: "+ Arrays.toString(array));
		
	   Arrays.sort(array); 
       System.out.println("Array Sort: "+ Arrays.toString(array));

	}
	
	public static void sortArray(int[] arr) {		
		boolean sorted = false;
		while(!sorted) {
			sorted=true;
			for(int i=0; i<arr.length -1 ; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					sorted = false;
				}
			}
		}
		System.out.println("Array Sort: " + Arrays.toString(arr));
	}

}
