package com.driver;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(p.product(a,b));
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println(p.product(a1,b1,c1));
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        System.out.println(p.product(a2,b2));
    }
}
class Product{
    public int product(int x, int y) { return x+y; }
    public int product(int x, int y, int z) { return x+y+z; }
    public double product(double x, double y) { return x+y; }
}