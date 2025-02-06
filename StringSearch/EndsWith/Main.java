 package StringSearch.EndsWith;

class Main {

    public static void main(String[] args) {
        
        String url = "https://www.example.com";

        if(url.endsWith("com"))
        {
            System.out.println("valid");
        }
        else if(url.endsWith("org"))
        {
            System.out.println("also valid");
        }
        else
        {
            System.out.println("Other domain");
        }
    }

}