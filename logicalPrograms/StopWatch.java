package com.logicalPrograms;
import java.util.Scanner;
public class StopWatch {
    void time(){
        Scanner scanner=new Scanner(System.in);
        long start,end;
        double time;
        System.out.println("Enter any character to start the stopwatch");
        char startTime=scanner.next().charAt(0);
        start=System.currentTimeMillis();
        System.out.println("Enter any character to stop the stopwatch");
        char endTime=scanner.next().charAt(0);
        end=System.currentTimeMillis();
        time=(end-start)/1000.0;
        System.out.println(time);
    }
    public static void main(String[] args) {
       StopWatch stopWatch = new StopWatch();
       stopWatch.time();
    }
}
