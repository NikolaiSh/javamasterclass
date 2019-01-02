package com.example.javacomplete;

public class Main {

    public static void main(String[] args) {
//        int pw = 47832298;
//        Password password = new ExtendeedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(356363);
//        password.letMeIn(654);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(47832298);

        System.out.println("Main method called");

        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);

        System.out.println("=================");

        SIBTest test2 = new SIBTest();
        test2.someMethod();
        System.out.println("Owner is " + test2.owner);
    }
}
