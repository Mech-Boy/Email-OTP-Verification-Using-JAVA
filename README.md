

# Email OTP Verification

This Java project provides functionality for email OTP (One-Time Password) verification, ensuring secure login procedures.
You can also use it as component for your bigger projects.

## Overview

The project consists of several components:

1. **OTPGenerator**: Generates random one-time passwords (OTPs).
2. **Verify**: Allows verifying the correctness of entered OTPs.
3. **GEmailSender**: Facilitates sending emails using Gmail SMTP server.

## Usage

### Generating OTP

Use the `OTPGenerator.generateOTP()` method to generate a random OTP.


String otp = OTPGenerator.generateOTP();


### Verifying OTP

Utilize the `Verify.check(otp)` method to verify the correctness of the entered OTP.

```java
Verify.check(otp);
```

### Sending Email

To send emails, create an instance of `GEmailSender` and call the `sendEmail` method with recipient email, sender email, subject, and text.

```java
GEmailSender sender = new GEmailSender();
boolean emailSent = sender.sendEmail(to, from, subject, text);
```

Replace `to`, `from`, `subject`, and `text` with appropriate values.

## Configuration

- Ensure proper configuration of Gmail SMTP settings in the `GEmailSender` class.
- Use appropriate email addresses for sender and recipient.
- Handle exceptions and error cases appropriately.

## Contributions

Contributions to enhance the project functionality or improve its documentation are welcome! Feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

You can copy this Markdown code block and paste it into the README.md file in your GitHub repository. Let me know if you need further assistance!
