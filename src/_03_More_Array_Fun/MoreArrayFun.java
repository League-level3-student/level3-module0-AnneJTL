package _03_More_Array_Fun;

import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
    public static void main(String[] args) {
        String[] strings = {"test", "autre"};
        String[] allString;
        allString = new String[]{"abc", "def", "ghi", "jkl"};
        System.out.println("A l'endroit");
        printAllStrings(allString);
        System.out.println("\nA l'envers!");
        printReverseAllStrings(allString);
        System.out.println("\nUne sur deux");
        printOverStrings(allString);
        System.out.println("\nAleatoire");
        printRandomStrings(allString);
    }
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printAllStrings(String[] allStrings){
        for (String aString : allStrings) {
            System.out.println(aString);
        }
    }
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
    public static void printReverseAllStrings(String[] allStrings) {
        for (int i = allStrings.length - 1; i >= 0; i--) {
            System.out.println(allStrings[i]);
        }
    }
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
    public static void printOverStrings(String[] allStrings) {
        for (int i=0; i < allStrings.length ; i = i+2) {
            System.out.println(allStrings[i]);
        }
    }
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
    private static void printRandomStrings(String[] allStrings) {
        Random randomNumber = new Random();
        int totalDisplay = 0;
        boolean[] checkDisplayed = new boolean[allStrings.length];
        for (int i = 0; i < checkDisplayed.length; i++) {
            checkDisplayed[i] = false;
        }

        do {
            int aRandom = randomNumber.nextInt(checkDisplayed.length);
            //System.out.println("Random: " + aRandom);

            if (!checkDisplayed[aRandom]){
                System.out.println(allStrings[aRandom]);
                checkDisplayed[aRandom] = true;
                totalDisplay++;
            }

        } while (totalDisplay < allStrings.length);
    }
}
