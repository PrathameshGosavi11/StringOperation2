package StringSearch.EndsWith;

public class FileEndWith {
    
    public static void main(String[] args) {
        
        String fileName="document.pdf";

        if(fileName.endsWith(".pdf"))
        {
            System.out.println("file name is vailid");
        }
        else
        {
            System.out.println("not valid");
        }
    }
}
