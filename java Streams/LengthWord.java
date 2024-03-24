public class LengthWord {
    public static void main(String[] args) {
        String s="hell world king and queens";
        String[] st=s.split(" ");
        for(int i=0;i<st.length;i++){
            if(st[i].length()%2==0){
                System.out.println(st[i]+" : "+st[i].length());
            }
        }
    }
}
