package _5Array.Challenges;

import java.util.Scanner;

public class DeleteSpecific {
    public static void main(String[] args) {
        int[] myArr=ArrayUtility.inputArray();
        ArrayUtility.displayArr(myArr);
        int[] newArr=delSpecificVal(myArr);
        ArrayUtility.displayArr(newArr);
    }
    public static int[] delSpecificVal(int[] myArr){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the value to be deleted: ");
        int numToDel=input.nextInt();
        int count=noOfOccurrences.noOfOccurs(myArr,numToDel);
        int[] newArr=new int[myArr.length-count];
        int i=0,j=0;
        while(i<myArr.length){
            if(count==0)
                return myArr;   
            if(myArr[i]==numToDel){
                i++;
                continue;
            }
            newArr[j]=myArr[i];
            j++;
            i++;
        }
        return newArr;
    }
}
