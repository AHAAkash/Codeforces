import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int left = 0;
        int right = n - 1;
        long sum1 = arr[left];
        long sum3 = arr[right];
        long maxSum1 = 0;

        while (left < right) {
            if (sum1 == sum3) {
                maxSum1 = sum1;
                left++;
                right--;
                sum1 += arr[left];
                sum3 += arr[right];
            } else if (sum1 < sum3) {
                left++;
                sum1 += arr[left];
            } else {
                right--;
                sum3 += arr[right];
            }
        }

        System.out.println(maxSum1);
    }
}
