package streams7;

import java.sql.Time;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JustTry1{
    public static void main(String[] args) {
  Predicate<String> CheckTest=s->s.length()>=5;
   Predicate<String> CheckEvenTest=s->s.length()%2==0;
        System.out.println(CheckTest.test("code"));
        System.out.println(CheckTest.negate().test("code"));
        System.out.println(CheckTest.and(CheckEvenTest).test("codee"));

    Function<Integer,Integer> square= i->i*i;
    Function<Integer,Integer> add=i->i+2;


    Consumer<Integer> show=i->
    System.out.println("the out put 4 after all functions is "+i);
  
  Supplier<Date> currentDate=()->new Date();

  Date dt=new Date();
  System.out.println(dt);
  

    System.out.println(square.compose(add).apply(4));
    show.accept(6);
    System.out.println(currentDate.get());
    System.out.println("      ");
    BiPredicate<Integer,Integer> validate=(a,b)->(a+b)>=5;
    BiFunction<Integer,Integer,Integer> muliply=(a,b)->a*b;

    BiConsumer<Integer,Integer> showBi=(a,b)->System.out.println(a+" "+b);
    System.out.println(validate.test(2,3));
    System.out.println(validate.test(2,1));

    System.out.println(muliply.apply(2, 3));
    showBi.accept(10,12);

    }
    
}
