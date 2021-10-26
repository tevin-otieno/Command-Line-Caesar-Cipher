import java.util.Scanner;

public class CipherInterface {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        System.out.println("""
                ========================================
                Welcome to the Ceaser_Cipher application\s
                ========================================
                Encode or Decode message (e/d)?""");
        char method =  s.next().charAt(0);
        CCipher caeser = new CCipher();
        if( method == 'e'){
            System.out.println("Encoding....");
            System.out.println("Enter message for Encryption: ");
            String message;
            message = s.next();
            System.out.println("Enter Key");
            int shiftKey = s.nextInt();
            System.out.println("Encrypted message... ");
            System.out.println(CCipher.encrypt(message, shiftKey));
        }else if ( method == 'd'){
            System.out.println("Decoding....");
            System.out.println("Enter message for Decryption: ");
            String message;
            message = s.next();
            System.out.println("Enter Key");
            System.out.println("Decrypted massage... ");
            System.out.println(CCipher.decrypt(message, 3));
        }else{
            System.out.println("Please enter valid option.");
        }
    }
}
