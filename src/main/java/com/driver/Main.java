package com.driver;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Product p = new Product();
        System.out.println(p.product(5,10));
        System.out.println(p.product(6,1,4));
        System.out.println(p.product(2.6,8.8));
    }
}
class Product{
    public int product(int x, int y) { return x+y; }
    public int product(int x, int y, int z) { return x+y+z; }
    public double product(double x, double y) { return x+y; }
}