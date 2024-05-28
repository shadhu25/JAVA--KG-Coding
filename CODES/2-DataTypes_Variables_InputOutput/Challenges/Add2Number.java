package _3DataTypes_Variables_InputOutput.Challenges;

import java.util.Scanner;

public class Add2Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter first number: ");
        int firstNum=input.nextInt();
        System.out.print("Now, Please Enter second number: ");
        int secondNum=input.nextInt();
        int sum=firstNum+secondNum;
        System.out.println("The sum is: "+sum);
    }
}
