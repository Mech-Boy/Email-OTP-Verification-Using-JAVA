package org.example;

class Main{
    public static void main(String[] args) {
        GEmailSender sender=new GEmailSender();
        String to="Testing@gmail.com";
        String from="Dummay@gmail.com";
        String subject="Testing otp Generator ";
        String otp= OTPGenerator.generateOTP();
        String text="Your one TIME LOGIN password is "+otp;


      boolean b=sender.sendEmail(to,from,subject,text);

      if(b){
          System.out.println("Email sent Successfully !");
      }else {
          System.out.println("Something Went wrong !!!!!");
      }
      Verify.check(otp);

    }
}
