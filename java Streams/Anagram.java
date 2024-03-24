public class Anagram {
    public static void main(String[] args) {
        String str1="bhas";
        String str2="sabk";
        int count=0;
        if(str1.length()!=str2.length()){
            System.out.println("not anagrams length");
        }
        else{
            for(int i=0;i<str1.length();i++){
                 for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                      count++;
                      break;
                }
                  
                 } 
            }
             if(count==str1.length()){
            System.out.println("are anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
        }
       
    }
    
}
