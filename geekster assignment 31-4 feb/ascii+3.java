/* Program to add 3 to ascii value of character  */


package com.company;

import java.util.Scanner;
public class Main {


    public static void main(String[] arg){

        Scanner s= new Scanner(System.in);
        System.out.println("enter the character:");
        int ascii=s.nextLine().charAt(0);
        ascii +=3;
        System.out.println((char)ascii);
    }
}
