package com.driver;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Product p=new Product();
        // call this method from Main using Product class object p
        int ans1= p.product(10, 20);
        // call this method also from Main using Product class object p
        int ans2= p.product(10,20,30);
        // call this method also from Main using Product class object p
        double ans3=p.product(10.0,20.0);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }
}
class Product{
    public int product(int x, int y) { return x*y; }
    public int product(int x, int y, int z) { return x*y*z; }
    public double product(double x, double y) { return x*y; }
}