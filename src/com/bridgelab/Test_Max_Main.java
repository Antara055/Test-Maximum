package com.bridgelab;

public class Test_Max_Main {
    public static void main(String[] args){
        System.out.println("LET'S FIND THE MAXIMUM NUMBER");
        Test_Max maxNo=new Test_Max(30,50,10);
        Test_Max maxNoFloat=new Test_Max(30f,50f,10f);
        maxNo.MaximumNumber();
        maxNoFloat.MaximumNumber();
    }
}
