package _5Array.Challenges;

public class CheckPelindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to array pelindrome checker\n ");
        int[] myArr=ArrayUtility.inputArray();
        if(checkPalindrome(myArr))
            System.out.println("the given array is a palindrome");
        else
            System.out.println("the given array is not a palindrome");
    }
    public static boolean checkPalindrome(int[] myArr){
        for(int i=0;i<myArr.length/2;i++){
            if(myArr[i]!=myArr[myArr.length-1-i])
                return false;
        }
        return true;
    }
}
