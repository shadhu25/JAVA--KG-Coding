package _4Operator_ifelse_NumberSystem.Challenges;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to Swapping era\n");
        System.out.print("please enter A: ");
        int num1=input.nextInt();
        System.out.print("please enter B: ");
        int num2=input.nextInt();
        int c=num1;
        num1=num2;
        num2=c;
        System.out.println("Swapping done...");
        System.out.println("A:- "+num1+" B:- "+num2);
    }
}
