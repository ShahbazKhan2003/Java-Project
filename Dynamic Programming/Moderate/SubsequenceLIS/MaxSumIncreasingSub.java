
import java.util.Scanner;

public class MaxSumIncreasingSub {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int[] dp = new int[n];
        dp[0] = arr[0];

        for(int i=1;i<n;i++){
            int sum = 0;
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]) sum = Math.max(sum, dp[j]);
            }
            dp[i] = arr[i] + sum;
        }

        int ans = 0;
        for(int i=0;i<n;i++) ans = Math.max(ans, dp[i]);
        System.out.println(ans);

    }
}
