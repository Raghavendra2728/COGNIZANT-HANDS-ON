
public class SingletonTest{
 public static void main(String[] args){
  Logger a=Logger.getInstance();
  Logger b=Logger.getInstance();
  a.log("Hello");
  System.out.println(a==b);
 }
}
