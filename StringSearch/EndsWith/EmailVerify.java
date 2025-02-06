package StringSearch.EndsWith;

public class EmailVerify {
    
    public static void main(String[] args) {
        
                String email = "user@gmail.com";
        
                if (email.endsWith("@gmail.com")) {
                    System.out.println("This is a Gmail account.");
                } else if (email.endsWith("@yahoo.com")) {
                    System.out.println("This is a Yahoo account.");
                } else {
                    System.out.println("Other Email Provider.");
                }
            
        
    }
}
