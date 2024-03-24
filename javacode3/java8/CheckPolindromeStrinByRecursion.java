package java8;

public class CheckPolindromeStrinByRecursion {
    public static void main(String[] args) {
        String s="racefcar";
        if(isPolindrome(s, 0, s.length()-1)){
            System.out.println("polindrome");
        }
        else{
            System.out.println("not polindrome");
        }
    }
    public static boolean isPolindrome(String s,int start ,int end){
      if(start>=end){
        return true;
      }
          if(s.charAt(start)!=s.charAt(end)){
            return false;
          }
         
    return isPolindrome(s,start+1,end-1);

    }
    
          }
          
