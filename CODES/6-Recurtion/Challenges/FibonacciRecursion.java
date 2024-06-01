package _7Recurtion.Challenges;

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to fibonacci using recursion");
        System.out.print("Please enter the position number: ");
        int position=input.nextInt();
        for (int i = 1; i <=position ; i++) {
            System.out.print(fiboPosition(i)+" ");
        }
    }
    static  int fiboPosition(int position){
        if(position==1)
            return 1;
        if(position==2)
            return 2;
        return fiboPosition(position-1) + fiboPosition(position-2);
    }
}
