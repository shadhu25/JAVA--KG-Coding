package _4Operator_ifelse_NumberSystem.Challenges;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to simple interest caculator\n");
        Scanner input=new Scanner(System.in);
        System.out.print("please enter your principle amount Rs");
        float principle=input.nextFloat();
        System.out.print("Now, Tell me your rate of interest: ");
        float rate=input.nextFloat();
        System.out.print("now, ell me for how many years are you borrowing this money: ");
        float years=input.nextFloat();
        float simpleInterest=(principle*rate*years)/100;
        System.out.println("\nYour Simple Interest is Rs:"+simpleInterest);
    }
}
