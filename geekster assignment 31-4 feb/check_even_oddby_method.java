/* programtocheckeven or odd by method  */

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number;");
        int num = s.nextInt();
        evenodd(num);
             }
    public static void evenOdd(int num){
        if(num%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");
        }

      }
