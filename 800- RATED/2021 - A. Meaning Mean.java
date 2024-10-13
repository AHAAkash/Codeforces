import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            int  result = arr[0];
            for (int i = 1; i < n; i++) {
                result = (result + arr[i]) / 2;
            }
            System.out.println(result);
        }
    }
}
