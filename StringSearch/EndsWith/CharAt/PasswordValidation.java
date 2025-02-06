package StringSearch.EndsWith.CharAt;

public class PasswordValidation {
    
    public static void main(String[] args) {
        String password = "abc123";

        if (Character.isDigit(password.charAt(password.length() - 1))) 
            {
            System.out.println("valid pass");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
