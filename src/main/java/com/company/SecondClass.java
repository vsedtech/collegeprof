package com.company;

public class SecondClass {
    public static void main(String... args){
        System.out.println("HI");
        System.out.println("SAN");
        int a = 1;
        int b = 10;
        System.out.println(a+b+"is the result of adding a and b");
        SecondClass sc = new SecondClass();
        sc.calculateRate();
        System.out.println(sc.getName());
        System.out.println("1 change");
        System.out.println("Coimbatore is a nice city to live");
        System.out.println("SRKV");
    }

    public String getName(){
        return "vsedtech";
    }
    public void calculateRate(){
        System.out.println("The rate of the building is ₹45 crores");
    }
    protected void finalReport(){
        System.out.println("final report is something that we should give");
    }
}
