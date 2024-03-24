public class Polindrom {
    public static void main(String[] args) {
        String str="mambn";
        String revStr="";
        for(int i=0;i<str.length();i++){
            revStr=str.charAt(i)+revStr;
        }
        if(str.equals(revStr)){
            System.out.println("it is polindrome");
        }
        else{
            System.out.println("not polindrome");
        }
        
    }
    
}
