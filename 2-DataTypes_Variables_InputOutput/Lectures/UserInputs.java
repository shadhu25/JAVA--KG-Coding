package _3DataTypes_Variables_InputOutput.Lectures;

import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1=input.nextLine();
        System.out.println("Your name is: "+name1);
        System.out.print("Enter your name: ");
        String name2=input.next();
        System.out.println("Your name is: "+name2);
        System.out.print("Enter your Age: ");
        float age1=input.nextFloat();
        System.out.println("Your age is: "+age1);
        System.out.print("Enter your Age: ");
        int age2=input.nextInt();
        System.out.println("Your age is: "+age2);
        System.out.print("Enter your Age: ");
        double age3=input.nextDouble();
        System.out.println("Your age is: "+age3);
        System.out.print("Enter your Age: ");
        long age4=input.nextLong();
        System.out.println("Your age is: "+age4);
        System.out.print("Enter your Age: ");
        short age5=input.nextShort();
        System.out.println("Your age is: "+age5);
    }
}
