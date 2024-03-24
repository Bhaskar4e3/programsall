package streams3;

public class Anagram {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abdf";
       int cnt=0;
       if(s1.length()!=s2.length()){
        System.out.println("are not anagrams by length");
       }
       else{
        for(int i=0;i<s1.length();i++){
            
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                 cnt++;
                 break;
                }
              }
              
     }
        if(cnt==s1.length()){
            System.out.println("are anagrams");
        }
        else{
            System.out.println("are not anagrams");
        }
    }
    }
    
}
