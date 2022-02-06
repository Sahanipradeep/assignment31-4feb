/*  program to find area and perimeter of rectangle*/

package com.company;

public class Main {

    public static void main(String[] args) {
        int area,perimeter;
	int length=5,breadth=7;
    area=length*breadth;
    perimeter=2*(length+breadth);
    System.out.println("area of rectangle:"+area);
    System.out.println("perimeter of rectangle:"+perimeter);
    }
}
