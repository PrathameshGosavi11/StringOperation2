import StringSearch.StrartWthUseCases.*;
import java.lang.*;
 class Phone  {
    
    public static void main(String[] args) {
        
        String phoneNumber = "+91-9876543210";

        if (phoneNumber.startsWith("+91")) {
            System.out.println("Indian Phone Number 🇮🇳");
        } else {
            System.out.println("Not an Indian Number.");
        }
    }
}
