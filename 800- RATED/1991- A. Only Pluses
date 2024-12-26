import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tC = sc.nextInt();
        
        while (tC-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            
            for (int i = 0; i < 5; i++) {
                arr[0]++;
                Arrays.sort(arr);
            }
            
            int result = arr[0] * arr[1] * arr[2];
            System.out.println(result);
        }
    }
}
