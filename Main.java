package mycustompackage;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();
    p1.x = 0;
    p1.y = 1;

    p2.x = 1;
    p2.y= 0;

    Dog d1 = new Dog();
    d1.breed = "corgi";
    d1.size = 5;
    d1.furColor = "orange";

    p1.setX(5);
    p2.setX(10);
    p1.setY(5);
    p2.setY(10);
  }
}
