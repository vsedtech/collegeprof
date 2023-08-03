package com.company;

public class SecondClass {
    public static void main(String... args){
        System.out.println("HI");
        System.out.println("SAN");
        int a = 1;
        int b = 10;
        System.out.println(a+b+"is the result of adding a and b");
        SecondClass sc = new SecondClass();
        System.out.println(sc.getName());
        System.out.println("1 change");
    }

    public String getName(){
        return "vsedtech";
    }
}
