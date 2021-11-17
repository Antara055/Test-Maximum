package com.bridgelab;

public class Test_Max<T extends Comparable<T>> {
    //T is variable that will represent generics
    T a;
    T b;
    T c;
//constructor
    Test_Max(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//Determines the largest of 3 comparable object
    public <T extends Comparable<T>> T MaximumNumber(T a, T b, T c) {
        T max=a;
        if (b.compareTo(max) > 0 ){
            max=a;
        }
        if (c.compareTo(max) > 0 ) {
            max=c;
        }
        printMax(max);
        return max;
    }
//printMax generic method to print the maximum value
    public static <T> void printMax(T max) {
        System.out.println("Max Value = " + max);
    }

}
