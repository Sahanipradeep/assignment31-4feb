/* program to convert inches to meter */

package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] arg){

        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number in inches:");
        double inches=s.nextFloat();
        double meter=inches*0.0254;
        System.out.println(" number in meter is:"+meter);


    }
}