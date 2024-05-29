package _5Array.Challenges;

import java.util.Scanner;

public class noOfOccurrences {
    public static void main(String[] args) {
        System.out.println("welcome to number of occurrence finder\n");
        int[] myArr=ArrayUtility.inputArray();
        Scanner input=new Scanner(System.in);
        System.out.print("\nPlease enter the number to be found: ");
        int numToFind=input.nextInt();
        System.out.println("\nnumber of occurrence of "+numToFind+" is: "+ noOfOccurs(myArr,numToFind));
    }
    public static int noOfOccurs(int[] myArr, int numToFind){
        int counter=0;
        for (int j : myArr) {
            if (j == numToFind)
                counter++;
        }
        return counter;
    }
}
