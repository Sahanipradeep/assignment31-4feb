/* program to calculate Fahrenheit to Celsius */

package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] arg){

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the temperature  in Fahrenheit:");
        float F=s.nextFloat();
        float C=(F-32)*5/9;
        System.out.println(" temperature  in Celsius:"+C);


    }
}