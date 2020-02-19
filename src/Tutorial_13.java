import java.util.Scanner;

public class Tutorial_13 {
    private static String key;
    private static String plaintext;
    private static String cipherText;
    private static String decryptText;
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        plaintext = scanner.next();
        key = randomAlphaNumeric(plaintext.length());
        System.out.println("Key: " + key);
        cipherText = cipher(plaintext, key);
        System.out.println("Encrypted Text: " + cipherText);
        decryptText = cipher(cipherText, key);
        System.out.println("Decrypted Text: " + decryptText);

    }

    public static String randomAlphaNumeric(int count) {
        String result = "";
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            result += ALPHA_NUMERIC_STRING.charAt(character);
        }
        return result;
    }

    public static String cipher(String text, String key) {
        char[] textArray = text.toCharArray();
        char[] keyArray = key.toCharArray();
        char[] cipherArray = new char[textArray.length];
        for(int index = 0; index < textArray.length; index++) {
            cipherArray[index] = (char) (textArray[index] ^ keyArray[index]);
        }
        return String.valueOf(cipherArray);
    }
}
