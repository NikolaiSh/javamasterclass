package com.example.series;

public class Series {

    public static int nSum(int n){
        return (n+1)*n/2;
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }

        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static int fibonaci(int n){
        if (n == 0) {
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int fib = 0;
        int f1 = 0;
        int f2 = 1;

        for(int i = 2; i <= n; i++) {
            fib = f1 + f2;
            f1 = f2;
            f2 = fib;
        }

        return fib;
    }


}
