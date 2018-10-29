package _00_IntroToArrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arrayOfString = new String[5];

		//2. print the third element in the array
        System.out.println("Third element: " + arrayOfString[2]);

		//3. set the third element to a different value
        arrayOfString[2] = "Now, I have a value.";

		//4. print the third element again
        System.out.println("Third element: " + arrayOfString[2]);

        //5. use a for loop to set all the elements in the array to a string of your choice
        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfString[i] = "I'm the "+ i + " element is the array.";
        }
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
        for (int i = 0; i < arrayOfString.length; i++) {
            System.out.println(i + ": " + arrayOfString[i]);
        }
		
		//7. make an array of 50 integers
        int[] intArray = new int[50];
        Random randomInt = new Random();

		//8. use a for loop to make every value of the integer array a random number
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomInt.nextInt();
        }

		//9. without printing the entire array, print only the smallest number on the array
        //Arrays.sort(intArray);
        int smallest = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < smallest){
                smallest = intArray[i];
            }
        }
        System.out.println("The smallest value of this array is " + smallest);

		//10 print the entire array to see if step 8 was correct
        int loop = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (loop == 7){
                loop = 0;
                System.out.print(intArray[i] + "\n");
            } else {
                System.out.print(intArray[i] + "\t\t");
                loop++;
            }
        }

        System.out.println("\n");
		//11. print the largest number in the array.
        int largest = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > largest){
                largest = intArray[i];
            }
        }
        System.out.println("The largest value of this array is " + largest);

        //12. print only the last element in the array
        System.out.println("The last one: " + intArray[intArray.length-1] );

        /***************************************/
        //13 print the entire array after sort it
        Arrays.sort(intArray);
        loop = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (loop == 7){
                loop = 0;
                System.out.print(intArray[i] + "\n");
            } else {
                System.out.print(intArray[i] + "\t\t");
                loop++;
            }
        }

    }
}
