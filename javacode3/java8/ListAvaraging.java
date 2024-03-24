import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ListAvaraging {
    public static void main(String[] args) {
    //     List<Integer> l=Arrays.asList(2,3,4,5,6,7);
    //     OptionalDouble d=  l.stream().map(e->e*e).filter(e->e>=25)
    //     .mapToInt(Integer::intValue).average();
        
    // System.out.println(d);
    ////vowel count
    // String s="jagdeesh";
    // char[] c=s.toCharArray();
    // int count=0;
    // for(char ch:c){
    //     if((ch=='a')|| (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')){
    //         count++;
    //     }
    // }
    // System.out.println(count);
    ////descending order
    int[] arr={2,4,5,8,3};
    int temp=0;
    //int high=arr[0];
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //     if(arr[i]>arr[j]){
    //         temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //     }
    //     }
    // }
    // System.out.println(Arrays.toString(arr));
    ////sum of digits in string
    // String s="ab12pq34";
    // char[] ch=s.toCharArray();
    // int sum=0;
    // for(Character c:ch){
    //     if(Character.isDigit(c)){
    //    sum=sum+Character.getNumericValue(c);
    //     }
    // } 
    // System.out.println(sum);
    String s="bhaskar";
    String s1="";
    char[] c=s.toCharArray();
    Set<Character> sh=new HashSet<>();
    for(Character ch:c){
   sh.add(ch);
    }
    for(Character ch:c){
        if(!sh.contains(ch)){
s1=s1+ch;
        }
    }
    System.out.println(s1);
    }
}
