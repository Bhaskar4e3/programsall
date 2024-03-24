package streams3;

import java.util.Arrays;

public class ComparableDriver {
    public static void main(String[] args) {
        Emp[] empArr=new Emp[4];
        empArr[0]=new Emp(1, "bhaskar");
        empArr[1]=new Emp(9, "ravi");
        empArr[2]=new Emp(5, "anil");
        empArr[3]=new Emp(10, "ram");
System.out.println(Arrays.toString(empArr));
        Arrays.sort(empArr,Emp.nameComparator);

        System.out.println(Arrays.toString(empArr));

        

            
    }
    
}
