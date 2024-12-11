import myClassesYay;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Point2D p1 = new Point2D();

    int in_x = sc.nextInt();
    int in_y = sc.nextInt();

    p1.setX(in_x);
    System.out.println("You made a point at (" + p1.getX() + ", " + p1.getY() + ")");
    Dog theDawg = new Dog();
    theDawg.setBreed("corgi");
    System.out.println(theDawg.getBreed());

  }
}
