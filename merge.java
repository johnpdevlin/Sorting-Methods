package sorting;

import java.util.Random;

public class merge {

	private static void mergeSort(int[] inputArray) {
	    int inputLength = inputArray.length;
	    
	    if (inputLength < 2) {
	      return;
	    }
	    
	    int midIndex = inputLength / 2;
	    int[] leftHalf = new int[midIndex];
	    int[] rightHalf = new int[inputLength - midIndex];
	    
	    for (int i = 0; i < midIndex; i++) {
	      leftHalf[i] = inputArray[i];
	    }
	    for (int i = midIndex; i < inputLength; i++) {
	      rightHalf[i - midIndex] = inputArray[i];
	    }
	    
	    mergeSort(leftHalf);
	    mergeSort(rightHalf);
	    merge(inputArray, leftHalf, rightHalf);
	  }

	  private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
	    int leftSize = leftHalf.length;
	    int rightSize = rightHalf.length;
	    
	    int i = 0, j = 0, k = 0;
	    
	    while (i < leftSize && j < rightSize) { // looping until there are no more elements in one of the arrays
	      if (leftHalf[i] <= rightHalf[j]) {
	        inputArray[k] = leftHalf[i]; // iterates through to check if leftHalf[i] is equal to or less than rightHalf[j] and then assigns to the inputArray[k] if true and increments i.   
	        i++;
	      }
	      else {
	        inputArray[k] = rightHalf[j];
	        j++;
	// otherwise rightHalf[j] is equal to inpputArray[k] 
	      }
	      k++; // as inputArray[k] has been sorted correctly, the next index of inputArray must find the next sorted integer. The loop then continues until there are no elements in either the left or right array
	    }
	    
	    while (i < leftSize) {
	      inputArray[k] = leftHalf[i];
	      i++;
	      k++;
	    }
	    
	    while (j < rightSize) {
	      inputArray[k] = rightHalf[j];
	      j++;
	      k++;
	    }
	// the remaining unsorted elements can now be interated through and sorted. It will only iterate if there are unsorted elements in one of the arrays.  
	  }

	  private static void printArray(int[] numbers) {
	    for (int i = 0; i < numbers.length; i++) {
	      System.out.println(numbers[i]);
	    }
	  }

	  public static void main(String[] args) {
			     
		Random rand = new Random();
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {	
			numbers[i] = rand.nextInt(1000000);
			}
			    
		System.out.println("Before:");
		printArray(numbers);

	    mergeSort(numbers); 

	    System.out.println("\nAfter:");
	    printArray(numbers);
	}

}
