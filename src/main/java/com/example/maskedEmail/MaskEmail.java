package com.example.maskedEmail;

public class MaskEmail {

    public static String maskEmail(String email) {
        if (email == null || !email.contains("@")) {
            return "Invalid email";
        }

        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];

        // Mask username: show first character, mask the rest with '*'
        String maskedUsername = username.charAt(0) + "*".repeat(username.length()-2)+username.charAt(username.length()-1);

        // Mask domain: show only the extension, mask everything before '.'
        int dotIndex = domain.indexOf('.');
        String domainName = domain.substring(0, dotIndex);
        String domainExtension = domain.substring(dotIndex);

        String maskedDomain = "*".repeat(domainName.length()) + domainExtension;

        return maskedUsername + "@" + maskedDomain;
    }

    public static void main(String[] args) {
        String email = "Praveen@gmail.com";
        String maskedEmail = maskEmail(email);
        System.out.println("Masked Email: " + maskedEmail);
    }
}

/*
public class MaskEmail {
    public static void main(String[] args) {
        String email = "test@gmail.com";
        String maskedEmail = emailMask(email);
        System.out.println("This is maskedEmail : " + maskedEmail);
    }

    public static String emailMask(String email) {
        String[] parts = email.split("@");
        String username = parts[0];
        String domain = parts[1];
        String maskedEmail = username.charAt(0) + "*".repeat(username.length() - 1);
        int dotIndex = domain.indexOf(".");
        String domainName = domain.substring(0, dotIndex);
        String domainExtension = domain.substring(dotIndex);
        String maskedDomain = "*".repeat(domainName.length()) + domainExtension;
        return maskedEmail + "@" + maskedDomain;
    }
}*/
