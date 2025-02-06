import java.util.Scanner;

public class Email  {
    
    public static void main(String[] args) {
        String email="";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Entet the username");
         email=scanner.nextLine();
         if(email.isEmpty())
         {
            System.out.println("please enter email");
         }
         else
         {
            System.out.println("email i:"+email);
         }
         scanner.close();
    }
}
