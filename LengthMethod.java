import java.util.Scanner;

public class LengthMethod {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the password");
        String passsword=sc.nextLine();

        if(passsword.length()<8)
        {
            System.out.println("Password at least 8 character");
        }
        else
        {
            System.out.println("password is valid and go to welcome page:");
        }
        sc.close();
    }
}