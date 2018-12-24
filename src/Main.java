import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int passwordLength;
        System.out.print("Enter your password length:  ");
        Scanner scan = new Scanner(System.in);
        passwordLength = scan.nextInt();
        PasswordGenerator password = new PasswordGenerator();
        System.out.println(password.generate(passwordLength));
    }
}
