package org.oop;
import java.awt.geom.Point2D;

public class DistanceAndDirectionCalculator  {

    public static double distance(Point p1, Point p2)
    {
        return Point2D.distance(p1.X,p1.Y,p2.X,p2.Y);
    }
    public static double direction(Point p1, Point p2)
    {
        double xDis=p2.X-p1.Y;
        double yDis=p2.Y-p1.Y;
        return Math.atan2(yDis,xDis);
    }
}