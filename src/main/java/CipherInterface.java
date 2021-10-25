import java.util.Scanner;

public class CipherInterface {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        System.out.println("=========================================\n"+
                            "Welcome to the Ceaser_Cipher application \n" +
                            "=========================================\n"+
                            "Encode or Decode message (e/d)?");
        String method =  s.nextLine();
        if(method == "e"){
            System.out.println("Encoding....");

        }else if (method == "d"){
            System.out.println("Decoding....");

        }else{
            System.out.println("Please enter valid option.");
        }
    }
}
