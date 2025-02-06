import javax.lang.model.element.TypeElement;

public class Contains1 {
    
    public static void main(String[] args) {
        
        String Text="hello Java";

        boolean result=Text.contains("Java"); //true
        System.out.println(result);

        boolean result1=Text.contains("Python"); //false
        System.out.println(result1);
    }
}
