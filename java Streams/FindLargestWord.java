public class FindLargestWord {
    public static void main(String[] args) {
        String str="this is a spring boot application";
       
       String[] words= str.split(" ");
        String longestWord=words[1];
       for(String word:words){ 
        if(word.length()>longestWord.length()){
            longestWord=word;

        }
       }
       System.out.println(longestWord);
        
    }
    
}
