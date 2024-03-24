//input=abbccc
//output=a1b2c3
public class Test2 {
    public static void main(String[] args) {
        String s="bhaskar@#$%&()";
        int count=0;
        String wordWithNoSpecialCharacters="";
        String spwcialChareacters="";

        for(int i=0;i<=s.length()-1;i++){
            //System.out.println(Character.isAlphabetic(s.charAt(i)));
            if(!Character.isAlphabetic(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                count++;
                System.out.println(s.charAt(i));
                spwcialChareacters=spwcialChareacters+s.charAt(i);


            }
            else{
                wordWithNoSpecialCharacters=wordWithNoSpecialCharacters+s.charAt(i);
            }
        }
      System.out.println(count);  
      System.out.println(wordWithNoSpecialCharacters);
      System.out.println(spwcialChareacters);

    }
    
}
