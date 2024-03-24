package streams5;
interface Shape{
     float area(int r,int l);
     float perimeter(int r,int l,int w);

}
class Circle implements Shape{
    float pi=3.14f;

    @Override
    public float area(int r,int l) {

          return pi*(r*r);
    }
   @Override
    public float perimeter(int r,int l,int w) {
              
    return 2*pi*r;
    }

}
class Rectangle implements Shape{
    float pi=3.14f;

    @Override
    public float area(int r,int l) {
  int w=r;
          return w*l;
    }
   @Override
    public float perimeter(int r,int l,int w) {
              
    return 2*(l+w);
    }

}
public class Demo{
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape r=new Rectangle();
int radius=12;
System.out.println(c.area(radius,0));
System.out.println(c.perimeter(radius,0,0));
int length=12;
int width=10;
System.out.println(r.perimeter(0,length,width));
System.out.println(r.area(length,width));


        
    }
}