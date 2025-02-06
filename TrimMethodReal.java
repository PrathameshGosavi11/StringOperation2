import java.util.Scanner;

public class TrimMethodReal
{
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name");
        String  userInput=scanner.nextLine();
        String dbName="Viki";

        if(userInput.trim().equals(dbName))
        {
            System.out.println("name is valid");
        }
        else{
            System.out.println("name is wrong please neter valid name");
        }
    }

}