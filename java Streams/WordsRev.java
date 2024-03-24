public class WordsRev {
    public static void main(String[] args) {
        String s="welcome to java world";//world java to welcome
        String rs="";
    //     String revWordsString="";
    //     for(int i=0;i<s.length();i++){
    //         rs=rs+s.charAt(i);
    //          if(s.charAt(i)==s.charAt(s.length()-1)){
    //                 revWordsString=" "+revWordsString;
    //             }
            
    //         if(s.charAt(i)==' ' || s.charAt(i)==s.charAt(s.length()-1)){
    //             revWordsString=rs+revWordsString;
    //             rs="";
               
    //         }
            
    //     }
    //  System.out.println(revWordsString);
    String[] splitArray=s.split(" ");
    for(int i=splitArray.length-1;i>=0;i--){
        System.out.println(splitArray[i]);
        rs=rs+splitArray[i];
        rs=rs+" ";

    }
    System.out.println(rs);
    }
    
    
}
