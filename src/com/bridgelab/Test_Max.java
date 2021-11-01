package com.bridgelab;

public class Test_Max<T extends Comparable<T>> {
    //T is variable that will represent generics
    T a;
    T b;
    T c;

    Test_Max(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void MaximumNumber() {
        if (a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            System.out.println("Maximum number is :" + a);
        } else if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            System.out.println("Maximum number is :" + b);
        } else
            System.out.println("Maximum number is :" + c);
    }
}
