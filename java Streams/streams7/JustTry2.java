package streams7;
public class JustTry2 {
public static void main(String[] args) {//s=abcdcaf  o=1
 String s="abcdcdaf";
 int count=0;
for(int i=0;i<s.length();i++){
  for(int j=0;j<s.length();j++){
    if(s.charAt(i)==s.charAt(j)){
        count++;
    }
}
  if(count==1){
    System.out.println("first non repeating character "+ s.charAt(i)+" "+s.indexOf(s.charAt(i)));
 break;
}
  count=0;
 }
 }
}