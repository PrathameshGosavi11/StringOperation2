import java.util.Scanner;

public class EmailContain {
    
    public static void main(String[] args) {
        
        String email = "user@example.com";

        Scanner scanner=new Scanner(System.in);

        email=scanner.nextLine();
        if(email.contains("@")&& email.contains("."))
        {
            System.out.println("EMail is valid"+email);
        }
        else
        {
            System.out.println("email are not allowe");
        }
        scanner.close();
    }
}
