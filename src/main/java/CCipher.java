public class CCipher {
    private static String plainText;
    private int shiftKey;

    public static String encrypt(String getPlainText, int shiftKey) {

        plainText = getPlainText;
        StringBuilder cipherText = new StringBuilder();

        if (shiftKey > 26) {
            shiftKey = (shiftKey % 26);
        } else if (shiftKey < 0) {
            shiftKey = (shiftKey % 26) + 26;
        }
        for (int i = 0; i < plainText.length(); i++) {
            if (Character.isLetter(plainText.charAt(i))) {
                if (Character.isLowerCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) + shiftKey);
                    if (ciphered_letter > 'z') {
                        cipherText.append((char) (plainText.charAt(i) - (26 - shiftKey)));
                    } else {
                        cipherText.append(ciphered_letter);
                    }
                } else if (Character.isUpperCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) + shiftKey);
                    if (ciphered_letter > 'Z') {
                        cipherText.append((char) (plainText.charAt(i) - (26 - shiftKey)));
                    } else {
                        cipherText.append(ciphered_letter);
                    }
                }
            } else {
                cipherText.append(plainText.charAt(i));
            }
        }
        return cipherText.toString();
    }

    public static String decrypt(String getPlainText, int shiftKey) {
        plainText = getPlainText;
        StringBuilder cipherText = new StringBuilder();

        if (shiftKey > 26) {
            shiftKey = (shiftKey % 26);
        } else if (shiftKey < 0) {
            shiftKey = (shiftKey % 26) + 26;
        }
        for (int i = 0; i < plainText.length(); i++) {
            if (Character.isLetter(plainText.charAt(i))) {
                if (Character.isLowerCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) - shiftKey);
                    if (ciphered_letter < 'a') {
                        cipherText.append((char) (plainText.charAt(i) + (26 - shiftKey)));

                    } else {
                        cipherText.append(ciphered_letter);
                    }
                } else if (Character.isUpperCase(plainText.charAt(i))) {
                    char ciphered_letter = (char) (plainText.charAt(i) - shiftKey);
                    if (ciphered_letter < 'A') {
                        cipherText.append((char) (plainText.charAt(i) + (26 - shiftKey)));
                    } else {
                        cipherText.append(ciphered_letter);
                    }
                }
            } else {
                cipherText.append(plainText.charAt(i));
            }
        }
        return cipherText.toString();
    }
}
