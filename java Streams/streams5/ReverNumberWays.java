package streams5;

public class ReverNumberWays {
    public static void main(String[] args) {
        int num=12345;//4321
    //     int revNum=0;
    //     String revN="";
    //    String nS=Integer.toString(num);
    //    for(int i=0;i<nS.length();i++){
    //     revN=nS.charAt(i)+revN;
    //    }
    //    int revNumber=Integer.parseInt(revN);
    //    System.out.println(revNumber);
    // int n=0;
    // while(num>0){
    //         n=num%10;
    //         revNum=revNum*10+n;
    //         num=num/10;
    // }
    // System.out.println(revNum);
    int reverse=0;
    StringBuilder str=new StringBuilder(String.valueOf(num));
    reverse=Integer.valueOf(str.reverse().toString());
    System.out.println(reverse);
}
    
}
