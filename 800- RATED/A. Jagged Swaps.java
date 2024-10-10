import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tc = sc.nextInt();

        sc.nextLine();

        while (tc-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];
            for(int i = 0; i < n ; i++){
                arr[i]=sc.nextInt();
            }
            if (arr[0] == 1) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
