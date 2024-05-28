package _4Operator_ifelse_NumberSystem.Challenges;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Compound interest caculator\n");
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your principle amount Rs");
        float principle=input.nextFloat();
        System.out.print("Now, Tell me your rate of interest: ");
        float rate=input.nextFloat();
        System.out.print("now, ell me for how many years are you borrowing this money: ");
        float years=input.nextFloat();
        double comint=principle*Math.pow((1+rate/100),years);
        System.out.println("Your compound interest is Rs"+comint);
    }
}
