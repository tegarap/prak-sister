/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistensi11;

/**
 *
 * @author cynux
 */
public class crypt {

    public static void main(String[] args) {
        String plainText = "TEGAR";
        String secretKey = "BAGUS";
        System.out.println("Plain Text before encryption" + plainText);
        String encryptedText = encrypt(plainText, secretKey);
        System.out.println("Encript Text after encription\t" + encryptedText);
        String decryptedText = decrypt(encryptedText, secretKey);
        System.out.println("Decript Text after decription\t" + decryptedText);

    }

    private static String encrypt(String plainText, String secretKey) {
        StringBuilder encryptedString = new StringBuilder();
        int encryptedInt;
        for (int i = 0; i < plainText.length(); i++) {
            System.out.println("");
            int plainTextInt = (int) (plainText.charAt(i) - 'A');
            System.out.println("");
            System.out.print(plainTextInt);
            int secretKeyInt = (int) (secretKey.charAt(i) - 'A');
            System.out.println("");
            System.out.print(secretKeyInt);
            encryptedInt = (plainTextInt + secretKeyInt) % 26;

            System.out.println("");
            System.out.print(encryptedInt);
            encryptedString.append((char) ((encryptedInt) + (int) 'A'));
            System.out.println("");
            System.out.println(encryptedString);

        }
        return encryptedString.toString();
    }

    private static String decrypt(String decryptedText, String secretKey) {
        StringBuilder decryptedString = new StringBuilder();
        int decryptedInt;
        for (int i = 0; i < decryptedText.length(); i++) {
            int decryptedTextInt = (int) (decryptedText.charAt(i) - 'A');
            int secretKeyInt = (int) (secretKey.charAt(i) - 'A');
            decryptedInt = decryptedTextInt - secretKeyInt;
            if (decryptedInt < 0) {
                decryptedInt += 26;
            }
            decryptedString.append((char) ((decryptedInt) + (int) 'A'));
        }
        return decryptedString.toString();
    }
}
