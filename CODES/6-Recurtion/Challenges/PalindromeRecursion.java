package _7Recurtion.Challenges;

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to Check Palindrome using recursion");
        System.out.print("Please enter the string: ");
        String name = input.next();
        boolean result=palinRecursion(name);
        if(result)
            System.out.println("The given name is a palindrome.");
        else
            System.out.println("The given name is not a palindrome.");
    }
    static boolean palinRecursion(String name){
        if(name.length()<=1)
            return true;
        int lastPos=name.length()-1;
        if(name.charAt(0)!=name.charAt(lastPos))
            return false;
        String newName=name.substring(1,lastPos);
        return palinRecursion(newName);
    }
}
