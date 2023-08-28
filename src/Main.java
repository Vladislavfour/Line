//package com.epam.rd.autotasks.intersection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int k1 = sc.nextInt();
        //int b1 = sc.nextInt();
        //int k2 = sc.nextInt();
        //int b2 = sc.nextInt();


        Line line1 = new Line(0,0);
        Line line2 = new Line(0,0);
        System.out.println("result is "+line1.intersection(line2));
    }
}