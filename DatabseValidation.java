import java.util.Scanner;

public class DatabseValidation {
    
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        String number=sc.nextLine();

        
        if (number.length() > 10 && number.length()==10)
        {
            System.out.println("number is valid ");
        }
        else
        {
            System.out.println("please corrent number entered");
        }
    }
}
