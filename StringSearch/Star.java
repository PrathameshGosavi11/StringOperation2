package StringSearch;

public class Star {
    public static void main(String[] args) {
        
    String text = "Welcome to Java Programming";
    
    // 2. StartsWith() with Offset
    System.out.println(text.indexOf("Java"));  
    System.out.println(text.startsWith("Java", 11));  // Output: true // 
    //check the String start with 11 number index.=Java  if start then return true. / fasle

}
}
