import java.util.Scanner;

/**
 * Computes the Manhattan distance bepuween two points given by the user..
 *
 * @assumptions User enters only numbers.
 * @errors None
 *
 * @author  Qurrat-al-Ain Siddiqui
 */

public class Part1
{
    // The following is an instance of Scanner which you will use to
    // read from the user.
    public Scanner kbd = new Scanner (System.in);

    public static void main (String[] args)
    {
        Part1 program = new Part1 ();

        program.run ();
    }

    public void run ()
    {
        Point start, end;
        double distance;

        // get two point objects from the user
        start = readPoint ();
        end = readPoint ();

        distance = computeDistance (start, end);

        System.out.println ("The distance between a and b is: " + distance);
    }

    /**
     * Computes the Manhattan distance between two points.  The Manhattan distance
     * is equal to the difference in the x coordinates plus the difference in the
     * y coordinates.
     *
     * @param a The first point.
     * @param b The second point.
     * @return The Manhattan distance between point a and point b.
     */
    public double computeDistance (Point a, Point b) {
        double xDiff, yDiff, distance;

        xDiff = a.x - b.x;
        if (xDiff < 0)
            xDiff = -xDiff;

        yDiff = a.y - b.y;
        if (yDiff < 0)
            yDiff = -yDiff;

        // compute the Manhattan distance (x difference plus y difference)
        distance = xDiff + yDiff;

        return distance;
    }

    /**
     * Reads an x and y coordinate from te user and returns a point object with
     * the specified x and y coordinates.
     *
     * @return A new point object with x and y coordinates as specified by the
     *         user.
     */
    public Point readPoint () {
        Point newPoint = new Point ();

        System.out.print ("Enter x coordinate: ");
        newPoint.x = kbd.nextDouble ();

        System.out.print ("Enter y coordinate: ");
        newPoint.y = kbd.nextDouble ();

        return newPoint;
    }
}