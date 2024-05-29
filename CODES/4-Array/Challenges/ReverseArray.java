package _5Array.Challenges;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to reverse an array");
        int[] myArr=ArrayUtility.inputArray();
        ArrayUtility.displayArr(myArr);
        myArr=reverseArr(myArr);
        ArrayUtility.displayArr(myArr);
    }
    public  static int[] reverseArr(int[] myArr){
        for(int i=0;i<myArr.length/2;i++){
            int temp=myArr[i];
            myArr[i]=myArr[(myArr.length-1)-i];
            myArr[(myArr.length-1)-i]=temp;
        }
        return myArr;
    }
}
