package _5Array.Challenges;


public class SumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average finder desk\n");
        int[] myArr=ArrayUtility.inputArray();
        ArrayUtility.displayArr(myArr);
        int sum=sumArr(myArr);
        double avg=avgArr(myArr);
        System.out.println("the sum of the all numbers is: "+sum);
        System.out.println("the average of the all numbers is: "+avg);
    }
    public static int sumArr(int[] myArr){
        int sum=0;
        for (int j : myArr) {
            sum += j;
        }
        return  sum;
    }
    public static double avgArr(int[] myArr){
        return (double) sumArr(myArr)/myArr.length;
    }
}
