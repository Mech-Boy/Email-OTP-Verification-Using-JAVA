package org.example;

import java.security.SecureRandom;



public class OTPGenerator {
    private static final String OTP_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";
    private static final int OTP_LENGTH = 10;

    public static String generateOTP() {
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(OTP_LENGTH);

        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(OTP_CHARACTERS.charAt(random.nextInt(OTP_CHARACTERS.length())));
        }

        return otp.toString();
    }

    public static void main(String[] args) {
        String otp = generateOTP();
        System.out.println("Generated OTP: " + otp);
    }
}

