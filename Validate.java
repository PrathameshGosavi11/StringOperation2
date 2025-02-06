import java.util.Scanner;

public class Validate {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entet the username");
        String username=scanner.nextLine();
        System.out.println("Entet the password");

        String passsword=scanner.nextLine();

        if (username.isEmpty() || passsword.isEmpty()) {

            System.out.println("user name and password are not empty");
            
        }
        else
        {
            System.out.println("Login success");
        }
    }
}