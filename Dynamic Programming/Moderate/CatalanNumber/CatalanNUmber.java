import java.util.Scanner;

public class CatalanNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
// 1 1 1 5 14 42......
        for(int i=2;i<dp.length;i++){
            for(int j=0;j<i;j++){
                dp[i]+= dp[j]*dp[i-j-1];
            }
        }
        System.out.println(dp[n]);
    }
}
