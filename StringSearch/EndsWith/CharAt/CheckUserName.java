package StringSearch.EndsWith.CharAt;

import java.util.Scanner;

public class CheckUserName {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String userName=scanner.nextLine();

        if(Character.isLetter(userName.charAt(0)))
        {
            System.out.println("Valid UserName");
        }
        else{
            System.out.println("please enter valid username");
        }
    }
}
