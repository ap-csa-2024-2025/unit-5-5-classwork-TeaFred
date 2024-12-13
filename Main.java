import java.util.Scanner;
import myclasses.Dog; 
import myclasses.Point2D; 

public class Main
{
  public static void main(String[] args)
  {
    //To run your code, do "javac Main.java myclasses/*.java"
    //Then run "java -cp . Main"
    Scanner sc = new Scanner(System.in);
    Person myPerson = new Person();
    //Point2D p1 = new Point2D();

    //int in_x = sc.nextInt();
    //int in_y = sc.nextInt();

    //p1.setX(in_x);
    //p1.setY(in_y);

    //System.out.println("You made a point at (" + p1.getX() + ", " + p1.getY() + ")");

    //Dog theDawg = new Dog();
    //theDawg.setBreed("corgi");
    //System.out.println(theDawg.getbreed());
    
    System.out.println("Enter the person's first name: ");
    String theirfirstname = sc.nextLine();

    System.out.println("Enter the person's last name: ");
    String theirlastname = sc.nextLine();

    System.out.println("Enter the person's age name: ");
    int theirage = sc.nextInt();

    System.out.println("Enter the person's ssid name: ");
    int theirssid = sc.nextInt();
  }
}
