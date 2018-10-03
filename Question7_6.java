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
public class DenseLine {
    public double[] getLine(Point[] p, int n) {
        // write code here
        double[] line = new double[2];
        int max = 2;
        double epsilon = 1e-6;
        // 了解浮点表示法的限制。切记不要用==检查浮点数是否相等，而是应该检查两者差值是否小于某个极小值，例如1e-6。
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                int t = 2;
                double slope = (double) (p[j].y - p[i].y) / (p[j].x - p[i].x);
                double intercept = p[i].y - slope * p[i].x;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (Math.abs(p[k].y - slope * p[k].x - intercept) < epsilon) {
                        t++;
                    }
                }
                if (t >= max) {
                    max = t;
                    line[0] = slope;
                    line[1] = intercept;
                }
            }
        }
        return line;
    }
}
