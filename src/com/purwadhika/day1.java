package com.purwadhika;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int age = 25;
        String str = "Hello my age is";
        double salary = 50000.00;
        char grade = 'A';
        boolean isMarried = false;
        System.out.println(str.toLowerCase() + " " + age);

        int[] ages = {12,24,23};
        double[] salarys = {50000.00,40000.00,23000.00};
        char[] grades = {'A','B','C'};

        boolean[] martialSatuses = {true,false,true};
        for(int i = 0;i<ages.length;i++){
            System.out.println("Age: " + ages[i] + " Salary: " + salarys[i] + " Grade: " + grades[i] + " Is Married:" + martialSatuses[i]);
        }



      System.out.println("========Number 1========");
      Scanner myInput = new Scanner(System.in);
      System.out.print("Enter Width = ");
      int width = myInput.nextInt();
      System.out.print("Enter Length = ");
      int length = myInput.nextInt();
      System.out.println("Rectangle Area : " + calculateRectangleArea(width,length));




      System.out.println("\n========Number 2========");
      System.out.print("Enter Radius = ");
      int radius = myInput.nextInt();
      System.out.println("Circle Diameter : " + calculateDiameter(radius));
      System.out.printf("Circle Circumference : %,.4f\n", calculateCircumference(radius));
      System.out.printf("Circle Area : %,.3f", calculateArea(radius));

      System.out.println("\n\n========Number 3========");
      System.out.print("Angles 1 = ");
      int a = myInput.nextInt();
      System.out.print("Angles 2 = ");
      int b = myInput.nextInt();
      System.out.println("Triangle Angles : "+ calculateAngles(a,b));

      System.out.println("\n========Number 4========");
      System.out.print("Enter Start Dates = ");
      String date1  = myInput.next();
      System.out.print("Enter End Dates = ");
      String date2 = myInput.next();
      System.out.println("Difference In Dates : " + calculateDateDifference(date1,date2));
      myInput.nextLine();
      System.out.println("\n========Number 5========");
      System.out.print("Full Name = ");
      String name = myInput.nextLine();
      System.out.println("Initial Name : " + findInitialName(name));

      myInput.close();
      System.out.println("\nScanner Closed.");
    }


    public static int calculateRectangleArea(int width, int length){
        return width*length;
    }

    public static int calculateDiameter(int radius){
        return radius*2;
    }

    public static double calculateCircumference(double radius){
        return radius*2*Math.PI;
    }

    public static double calculateArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }

    public static int calculateAngles(int a, int b){
        return 180-(a+b);
    }

    public static String findInitialName(String name){
        String[] arrOfStr = name.split(" ");
        String StrTemp = "";
        for(int i = 0;i<arrOfStr.length;i++){
            StrTemp+=arrOfStr[i].charAt(0);
        }
        return StrTemp.toUpperCase();
    }

    public static int calculateDateDifference(String date1, String date2){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedStartDate = LocalDate.parse(date1,formatter);
        LocalDate parsedEndDate = LocalDate.parse(date2,formatter);
        long daysDifference = ChronoUnit.DAYS.between(parsedStartDate,parsedEndDate);
        System.out.println("Apakabar");
        return (int) Math.abs(daysDifference);


//        LocalDate dateTemp = LocalDate.parse(date1);
//        LocalDate dateTemp2 = LocalDate.parse(date2);
//        Duration DateDiff =  Duration.between(dateTemp2.atStartOfDay(),dateTemp.atStartOfDay());
//        int DateDifference = (int) DateDiff.toDays();


    }
}
