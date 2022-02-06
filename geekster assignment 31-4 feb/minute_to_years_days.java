/* program to convert minute into years and days  */

package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] arg){

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the time in minute:");
        double minute=s.nextDouble();
        double years=minute/525600;
        double days=minute/1440;
        System.out.println("number of years:"+years);
        System.out.println("number of days:"+days);

    }
}