import java.util.Scanner;

public class APiResponse {
    
    public static void main(String[] args) {
        
        String api="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entet the APi");
        api=scanner.nextLine();
        if(api.isEmpty())
        {
            System.out.println("please enter API:");
        }
        else
        {
            System.out.println("PI is :"+api);
        }


    }
}
