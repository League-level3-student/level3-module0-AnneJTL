package _04_CheckPoint;

import javax.swing.*;

public class Checkpoint {
    public static void main(String[] args) {
        int tabSize = enterValue("What is the size of the array?");
        if (tabSize == -1 || tabSize == 0) {
            System.out.println("Incorrect size");
        } else {
            int[] intArray = new int[tabSize];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = enterValue("Enter a positive integer");
            }


            // calculation of the total and average of the tab
            int total = 0;
            for (int value : intArray) {
                total += value;
            }
            double average = (double)total / intArray.length;
            JOptionPane.showMessageDialog(null,
                    "Total: " + total + "\nAverage: " + average);
        }

    }


    private static int enterValue(String msg){
        int value;
        String answer = JOptionPane.showInputDialog(msg);

        try{
            value = Integer.parseInt(answer);
        } catch (NumberFormatException e){
            value = -1;
        }
        return value;
    }
}
