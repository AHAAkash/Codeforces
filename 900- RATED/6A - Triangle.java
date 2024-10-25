import java.util.*;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sticks = new int[4];

        for (int i = 0; i < 4; i++) {
            sticks[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(sticks);

        boolean triangle = false;
        boolean segment = false;

        if (sticks[0] + sticks[1] > sticks[2] || 
            sticks[1] + sticks[2] > sticks[3]) {
            triangle = true;
        }

        else if (sticks[0] + sticks[1] == sticks[2] || 
                 sticks[1] + sticks[2] == sticks[3]) {
            segment = true;
        }

        if (triangle) {
            System.out.println("TRIANGLE");
        } else if (segment) {
            System.out.println("SEGMENT");
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
