package org.example;

import java.util.Scanner;

public class Verify {

    public static void check(String s){
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter your otp:");
        String string=sn.nextLine();
        if(s.equals(string)){
            System.out.println("Login Secssfull ");
        }else{
            System.out.println("Wrong OTP");
        }
    }

}
