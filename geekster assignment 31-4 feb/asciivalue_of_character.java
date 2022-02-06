/* program to print ascii of character */

package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] arg){
       char ch;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the character :");
      ch=s.next().charAt(0);
        int ASCII=ch;
        System.out.println("ASCII value is:"+ASCII);
    }
}
