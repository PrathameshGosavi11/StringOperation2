public class TrimMethod {
    public static void main(String[] args) {
        
        String str="  Good morning ";
        System.out.println("before apply trim method:"+str); // --Good Morning --
    
        System.out.println("after apply the method:"+str.trim()); //op-> Good Morning 
        //remove leading and traling white space only but not remove centerl.
    }
}
