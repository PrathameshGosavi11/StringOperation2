package StringSearch.EndsWith.CharAt;

public class Vowel {
    
    public static void main(String[] args) {
        
        String vowelList="Programming";
        int count=0;

        for(int i=0;i<vowelList.length();i++)

        {
            Character ch=Character.toLowerCase(vowelList.charAt(i))
            if(ch =="a" || ch=="e" || ch=="i" || ch=="o" || ch=="u")
            {
                count++;
            }
        }
        System.out.println("vowel count is:"+count);


    }
}
