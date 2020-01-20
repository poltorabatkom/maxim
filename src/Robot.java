import java.awt.*;

public class Robot
{
    static Point point;
    static Dyrect Direction;

    public Robot()
    {
        point = new Point(0,0);
        Direction = Dyrect.up;
    }

    enum Dyrect
    {
        up,
        down,
        right,
        left
    }


    public void GetPosition()
    {
        System.out.println(Message(point));
    }

    public void GetDirektion()
    {
        System.out.println(Direction);
    }

    public void forward()
    {
        switch (Direction)
        {
            case up:
                this.point = new Point(point.x,++point.y);
                System.out.println(Message(point));
                break;
            case left:
                this.point = new Point(--point.x,point.y);
                System.out.println(Message(point));
                break;
            case right:
                this.point = new Point(++point.x,point.y);
                System.out.println(Message(point));
                break;
        }
    }
    public void backward()
    {
        switch (Direction)
        {
            case down:
                this.point = new Point(point.x,--point.y);
                System.out.println(Message(point));
                break;
            case left:
                this.point = new Point(--point.x,point.y);
                System.out.println(Message(point));
                break;
            case right:
                this.point = new Point(point.x,--point.y);
                System.out.println(Message(point));
                break;
        }
    }

    public void rotateLeft()
    {
        Direction = Dyrect.left;
    }

    public void rotateRight()
    {
        Direction = Dyrect.right;
    }


    String Message(Point pointPar)
    {
        return String.format("(%d,%d)",pointPar.x, pointPar.y);
    }

}
