package com.logicalPrograms;
import java.util.Scanner;
public class PrimeNumber {
    void prime(){
        int i, number, sum = 0;
        System.out.print("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        for( i = 2; i < number; i++) {
            if(number % i == 0) {
                sum = 0;
                break;
            } else {
                sum = 1;
            }
        }
        if(sum == 1) {
            System.out.println(""+number+" is a prime number.");
        } else {
            System.out.println(""+number+" is not a prime number.");
        }
    }
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.prime();
    }
}
