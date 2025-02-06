public class StringIsmpty {
    public static void main(String[] args) {
        
        String str="Hello";
        boolean result=str.isEmpty();
        System.out.println("result is :"+result); //false

        String str1=" ";
        boolean result1=str1.isEmpty();
        System.out.println("result is:"+result1); //false because String include the spaces.

        String str2="";
        boolean result2=str2.isEmpty();
        System.out.println("String is empty:"+result2); //true 
    }
}
