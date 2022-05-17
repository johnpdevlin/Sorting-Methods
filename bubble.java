package sorting;
import java.util.Random;

public class bubble {
		   
		public static void bubbleSort(int[] a) { 
		int outer, inner;

		for (outer = a.length - 1; outer > 0; outer--) { 
		   for (inner = 0; inner < outer; inner++) { 
		      if (a[inner] > a[inner + 1]) { 
		           int temp = a[inner]; 
		           a[inner] = a[inner + 1]; 
		           a[inner + 1] = temp; 
		        	}
		   		}
			}
		}
		public static void main(String[] args) {
			
			Random rand = new Random();
			int[] numbers = new int[10];
			    
			for (int i = 0; i < numbers.length; i++) {
			   numbers[i] = rand.nextInt(100);
			 }
			    
			System.out.println("Before:" + numbers);
			System.out.println("Sorting...");
			bubbleSort(numbers);
			System.out.println("After: " + numbers);
	}

}
