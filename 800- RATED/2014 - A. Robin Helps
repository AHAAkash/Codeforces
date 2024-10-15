import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int gold = 0,current = 0;
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                if(arr[i]>=k){
                    current+=arr[i];
                }else if (arr[i]==0 && current>0) {
                    gold++;
                    current--;
                }
            }
            System.out.println(gold);
        }
    }
}
