package org.example;

public class fibbo {
    public static void main(String[] args){
        int n = 6;
        System.out.println(fibbonaciRecursion(10));

    }

    public static long fibbonaciRecursion(int n){
        if(n<2){
            return n;
        }
        else{
            return fibbonaciRecursion(n-1) + fibbonaciRecursion(n-2);
        }
    }


}
