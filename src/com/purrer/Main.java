package com.purrer;

public class Main {
    enum Method{
        RECURSIVE,
        MEMO_RECURSIVE,
        ARRAY,
    }

    public static void main(String[] args) {
        fibonacciTest(35, Method.RECURSIVE);
        fibonacciTest(35, Method.MEMO_RECURSIVE);
        fibonacciTest(35, Method.ARRAY);
    }

    static void fibonacciTest(long num, Method m){
        Fibonacci f = new Fibonacci();
        System.out.println("Number " + num);
        long startTime = System.currentTimeMillis();
        switch (m){
            case RECURSIVE:
                System.out.println("Simple recursive");
                System.out.println(f.recursive(num));
                break;
            case MEMO_RECURSIVE:
                System.out.println("Memo recursive");
                System.out.println(f.recursiveMemorize(num));
                break;
            case ARRAY:
                System.out.println("Array method");
                System.out.println(f.arrayMethod(num));
                break;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }
}
