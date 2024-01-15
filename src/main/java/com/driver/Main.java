package com.driver;

public class Main {
    public static class Product{
        //Task 3: create a method of following defination public int product(int x, int y) {}
        public int product(int x, int y){
            return x*y;
        }
        //Task 4: create a Overloaded method product of following defination public int product(int x, int y, int z){}
        public int product(int x, int y, int z){
            return x*y*z;
        }
        //Task 5: create a Overloaded method product of following defination public double product(double x, double y){}
        public double product(double x, double y){
            return x*y;
        }

    }
    public static void main(String[] args) {
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