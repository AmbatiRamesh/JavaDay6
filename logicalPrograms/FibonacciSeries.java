package com.logicalPrograms;
import java.util.Scanner;
public class FibonacciSeries {
    void series(){
        int number, num1 = 0, num2 = 0, num3 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n:");
        number = scanner.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= number; i++)
        {
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            System.out.print(num1+" ");
        }
    }
    public static void main(String[] args) {
       FibonacciSeries fibonacciSeries = new FibonacciSeries();
       fibonacciSeries.series();
    }
}
