package _5Array.Challenges;

public class CheckSorted {
    public static void main(String[] args) {
        System.out.println("Welcome to sorted checker");
        int[] myArr=ArrayUtility.inputArray();
        if(ifDec(myArr) || ifInc(myArr))
            System.out.println("the Array is sorted");
        else
            System.out.println("the Array is not sorted");
    }
    public static boolean ifInc(int[] myArr){
        for(int i=0;i<myArr.length-1;i++){
            if(myArr[i]>myArr[i+1])
                return false;
        }
        return true;
    }
    public static boolean ifDec(int[] myArr){
        for(int i=0;i<myArr.length-1;i++){
            if(myArr[i]<myArr[i+1])
                return false;
        }
        return true;
    }
}
