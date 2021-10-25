import java.util.Scanner;

public class CipherInterface {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        System.out.println("=========================================\n"+
                            "Welcome to the Ceaser_Cipher application \n" +
                            "=========================================\n"+
                            "Encode or Decode message (e/d)?");
        char method =  s.next().charAt(0);
        CCipher caeser = new CCipher();
        if( method == 'e'){
            System.out.println("Encoding....");
            System.out.println("Enter message for Encryption: ");
            String message = new String();
            message = s.next();
            System.out.println("Enter Key");
            int shiftKey = s.nextInt();
            System.out.println("Encrypted message... ");
            System.out.println(caeser.encrypt(message, shiftKey));
        }else if ( method == 'd'){
            System.out.println("Decoding....");
            System.out.println("Enter message for Decryption: ");
            String message = new String();
            message = s.next();
            System.out.println("Enter Key");
            int shiftKey = s.nextInt();
            System.out.println("Decrypted massage... ");
            System.out.println(caeser.decrypt(message, 3));
        }else{
            System.out.println("Please enter valid option.");
        }
    }
}
