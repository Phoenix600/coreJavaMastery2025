package section27_collection_framework;

import java.util.TreeSet;

class Point implements  Comparable<Point>
{
    private Integer x;
    private Integer y;

    // constructors
    public Point()
    {
        System.out.println("Default Constructor Called");
    }

    public Point(Integer x, Integer y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point point) {

        if(this.x < point.x)
        {
            return -1;
        }
        else if(this.x > point.x)
        {
            return 1;
        }
        else
        {
            if(this.y < point.y)
            {
                return -1;
            }
            else if(this.y > point.y)
            {
                return  1;
            }
            else
            {
                return 0;
            }
        }

    }

    // getters and setters
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


public class Example7 {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(2,2));
        ts.add(new Point(2,3));
        ts.add(new Point(3,2));
        System.out.println(ts);
    }
}
