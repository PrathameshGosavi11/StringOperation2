public class TrimRealUser {
    public static void main(String[] args) {
        
        String name="  Jay  ";
        String dbname="jay";

        if(name.trim().equalsIgnoreCase(dbname))
        {
            System.out.println("name is exits");
        }
        else
        {
            System.out.println("name is not exits");
        }
    }
}
