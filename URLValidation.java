public class URLValidation {
    
    public static void main(String[] args) {
        
        String url = "https://www.google.com";

        if (url.contains("https")) 
        {
            System.out.println("secure url");
        }
        else
        {
            System.out.println("not secure");
        }
    }

}
