package com.bridgelab;

public class Test_Max_Main {
    public static void main(String[] args){
        System.out.println("LET'S FIND THE MAXIMUM NUMBER");

        Test_Max <Integer> maxInt=new Test_Max<>(33, -55, 24);
        Test_Max <Float> maxFloat=new Test_Max<>(3.3F, 4.5F, -3.2F);
        Test_Max<String> maxString=new Test_Max<>("Banana","Apple","Aeach");


        maxInt.MaximumNumber(33, -55, 24);
        maxFloat.MaximumNumber(3.3F, 4.5F, -3.2F);
        maxString.MaximumNumber("Banana","Apple","Aeach");
    }
}
