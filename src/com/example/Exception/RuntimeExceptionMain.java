package com.example.Exception;

public class RuntimeExceptionMain {
    public static void main(String[] args) {
        try {
            makeException();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void makeException() {
        //makeException1(10);  /// by zero
        //makeException2(); //String index out of range: 1
        //makeException3(); //Index 5 out of bounds for length 5
        //makeException4(); //Cannot invoke "String.split(String)" because "nothing" is null
        //makeException5(); //For input string: "abc"
        //makeException6(); //무한루프
        ///makeException7(); //java.lang.Integer
        //makeException8(); //class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
    }

    public static int makeException1(int input) {
        int div = input / 0; //AritmenticException
        return div;
    }

    public static void makeException2() {
        String a = "a";
        System.out.println(a.charAt(1)); //StringIndexOutOfBoundsException
    }

    public static void makeException3() {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[5]); //ArrayIndexOfOutBoundsException
    }

    public static void makeException4() {
        String nothing = null;
        System.out.println(nothing.split("")); //NullPointerException
    }

    public static void makeException5() {
        String str = "abc";
        int a = Integer.parseInt(str); //NumberFormatyException
    }

    public static void makeException6() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            makeException6();  //RuntimeException
        }
    }

    public static void makeException7() {
        Object[] objArr = new String[2];
        objArr[0] = 0;   //ArrayStoreException
    }

    public static void makeException8() {
        Object[] objArr = new String[2];
        objArr[0] = "abc";
        Integer i = (Integer) objArr[0];  //ClassCastException
    }
}
