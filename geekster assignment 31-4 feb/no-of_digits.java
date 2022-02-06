/*  program to find no. of digits of number*/

package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] arg){
       int count=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        while(n>0){
            n=n/10;
            count++;
        }

        System.out.println("number of digits are:"+count);

    }
}