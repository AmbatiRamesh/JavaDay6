package com.logicalPrograms;
import java.util.Scanner;
public class PerfectNumber {
    void perfect(){
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        number = scanner.nextInt();
        for(int i = 1; i < number; i++)
        {
            if(number % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == number)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect");
        }
    }
    public static void main(String[] args) {
      PerfectNumber perfectNumber = new PerfectNumber();
      perfectNumber.perfect();
    }
}
