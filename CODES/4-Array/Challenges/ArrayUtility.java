package _5Array.Challenges;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size=input.nextInt();
        int[] myArr=new int[size];
        for(int i=0;i<myArr.length;i++){
            System.out.print("Please enter a number at index ["+i+"]: ");
            myArr[i]=input.nextInt();
        }
        return myArr;
    }
    public  static void displayArr(int[] myArr){
        for (int i : myArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
