/* program to find factorial using do while loop  */

package com.company;


import java.util.Scanner;
public class Main {


    public static void main(String[] arg){
       long factorial=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int i=1;
        do {
            factorial = factorial * i;
            i++;
        }while(i<=n);

        System.out.println("Facorial of number is:"+factorial);

    }
}