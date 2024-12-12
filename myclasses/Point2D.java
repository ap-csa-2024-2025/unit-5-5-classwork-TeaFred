package myclasses;
public class Point2D
{
    private int x;
    private int y;
    //Accessors methods (get stuff)
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    //Mutator methods (set things up/add/mutate to things)
    public void setX(int inputX)
    {
        x = inputX;
    }
    public void setY(int inputY)
    {
        y = inputY;
    public boolean equals (Point2D other)
    {
        return (x == other.x) && (y == other.y);
    }
    public String toString ()
    {
        return "(" + x + ", " + y")";
    }
}
