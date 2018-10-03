import java.util.*;

/*
public class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }
}*/
public class Bipartition {
    public double[] getBipartition(Point[] A, Point[] B) {
        // write code here
        double x1 = (A[0].x + A[2].x) / 2;
        double y1 = (A[1].y + A[3].y) / 2;
        double x2 = (B[0].x + B[2].x) / 2;
        double y2 = (B[1].y + B[3].y) / 2;
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[] {slope, intercept};
    }
}
