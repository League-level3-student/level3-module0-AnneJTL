package _01_Simple_Array_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _00_1D_Array_Methods {
/*
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 3};
        getIndex(arr2, 3);
    }
    */

	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		int sum = 0;
		for (int i:values ) {
			sum += i;
		}
		return sum;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
	    double average = 0;
        for (int i:values ) {
            average += i;
        }

        if (values.length != 0)
		    return (average/(values.length));
        else
            return 0;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
        for (int i: array ) {
            if (i == value){
                return true;
            }
        }
	
		return false;
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == value){
                return i;
            }
        }
		return -1;
	}
}
