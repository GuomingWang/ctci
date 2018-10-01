import java.util.*;

public class Render {
    public static int[] renderPixel(int[] screen, int x, int y) {
        // write code here
        int startByte = x / 8; // 0
        // System.out.println(startByte);
        int startBit = x % 8; // 7
        // System.out.println(startBit);
        int endByte = y / 8; // 0
        // System.out.println(endByte);
        int endBit = y % 8; // 7
        // System.out.println(endBit);
        if (startByte == endByte) {
            int start = 255 >> startBit << startBit;
            // System.out.println("start= " + start);
            int end = ((255 << (7 - endBit)) & 255) >> (7 - endBit);
            // System.out.println("end=" + end);
            screen[startByte] |= start & end;
        } else {
            for (int i = startByte + 1; i < endByte; i++) {
                screen[i] = 255;
            }
            int start = 255 >> startBit << startBit;
            int end = ((255 << (7 - endBit)) & 255) >> (7 - endBit);
            screen[startByte] |= start;
            screen[endByte] |= end;
        }
        return screen;
    }
}
