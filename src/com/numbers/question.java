package com.numbers;

public class question {

    public static void main(String[] args) {
        String str = "192.168.1.1";
        boolean validationCheck = validIP(str);
        System.out.println(validationCheck);

        int encodedInt = encode(str);
        System.out.println(encodedInt);

        String decodedStr = decode(encodedInt);
        System.out.println(decodedStr);
    }

    public static boolean validIP(String str) {
        String[] parts = str.split("\\.");

        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) {
                    return false;
                }
                if (part.length() > 1 && part.charAt(0) == '0') {
                    return false; // Leading zeros not allowed
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    public static int encode(String str) {
        String[] parts = str.split("\\.");
        int result = 0;
        for (int i = 0; i < parts.length; i++) {
            result += Integer.parseInt(parts[i]) << (8 * (3 - i));
        }
        return result;
    }

    public static String decode(int encoded) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 3; i >= 0; i--) {
            int octet = (encoded >> (8 * i)) & 255;
            decoded.append(octet);
            if (i > 0) {
                decoded.append('.');
            }
        }
        return decoded.toString();
    }
}
