package StringSearch.StrartWthUseCases;

public class ValidateURl {
    
    public static void main(String[] args) {
        
        String url = "https://www.google.com";

        if(url.startsWith("https:"))
        {
            System.out.println("secure url");
        }
        else
        {
            System.out.println("not secure");
        }

    }
}
