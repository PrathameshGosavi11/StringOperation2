package StringSearch.EndsWith;

public class Image {
    
    public static void main(String[] args) {
        
        String fileName = "photo.jpg";

        if(fileName.endsWith("jpg") || fileName.endsWith("Png") || fileName.endsWith("pdf"))
        {
            System.out.println("Valid picture");
        }
        else
        {
            System.out.println("invlaid");
        }

    }
}
