package tricky1;

public class PrintNumbers {

    public static void main(String[] args) {
       String str= 1+2+"one"+1+2+"two";
        System.out.println(str);
        printNumbers(1);
    }
    public static void printNumbers(int n) {
        if(n<=100){
            System.out.print(n+" ");
            printNumbers(n+1);
        }
        
    }
    
}
