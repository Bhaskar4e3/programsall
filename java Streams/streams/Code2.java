package streams;

public class Code2 {
    public static void main(String[] args) {
        int n=153;
        int n1=n;
        int sum=0;
   while(n>0){
        int j=n%10;
        sum=sum+(j*j*j);
        n=n/10;

        }
        System.out.println(sum);
        if(sum==n1){
            System.out.println("it is armstrong");
        }
        else{
            System.out.println("it is not");
        }
    }
    
}
