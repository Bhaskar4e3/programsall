public class Test1 {
    public static void main(String[] args) {
        String s="my name is bhaskar kumar";
        String rs="";
        String wr="";
        
        for(int i=0;i<=s.length()-1;i++){
            rs=rs+s.charAt(i);
              if(s.charAt(i)==s.charAt(s.length()-1)){
                        wr=wr+" ";
                    }
            if(s.charAt(i)==' ' || s.charAt(i)==s.charAt(s.length()-1)){
                for(int j=rs.length()-1;j>=0;j--){
                  
                       wr=wr+rs.charAt(j);
                       
                }
                rs="";

            }
        }
        System.out.println(wr);
    }
    
}
