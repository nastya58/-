package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input k");
        double k = in.nextInt();
        System.out.println("Input n");
        double n = in.nextInt();
        for (double i=2;i<=n;i++) {
            k= Math.pow(0.5,k+Math.pow(0.5,k*i));
        }
        System.out.println(k);

    }
}