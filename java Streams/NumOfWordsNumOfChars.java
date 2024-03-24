public class NumOfWordsNumOfChars {
    public static void main(String[] args) {
        String s="hello king";
        String[] sp=s.split(" ");
        System.out.println("number of words in a string "+sp.length);
        for(String s1:sp){
              System.out.println(s1+" "+s1.length());
        }   
    }
    
}
