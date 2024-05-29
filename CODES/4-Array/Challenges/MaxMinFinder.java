package _5Array.Challenges;

public class MaxMinFinder {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum and Minimum finder");
        int[] myArr=ArrayUtility.inputArray();
        int max=maxFinder(myArr);
        int min=minFinder(myArr);
        System.out.println("the minimum value is: "+min);
        System.out.println("the maximum value is: "+max);
    }
    public static int minFinder(int[] myArr){
        int min=myArr[0];
        for(int i=1;i<myArr.length;i++){
            if(min>myArr[i])
                min=myArr[i];
        }
        return min;
    }
    public static int maxFinder(int[] myArr){
        int max=myArr[0];
        for(int i=1;i<myArr.length;i++){
            if(max<myArr[i])
                max=myArr[i];
        }
        return max;
    }
}
