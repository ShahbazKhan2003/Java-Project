import java.util.Scanner;

public class CoolDown {
    public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();        

        int obsp = -arr[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i=1;i<n;i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
//Buying
            if(ocsp - arr[i] > obsp ) nbsp = ocsp - arr[i];
            else nbsp = obsp;
//Selling
            if(arr[i] + obsp > ossp) nssp = arr[i] + obsp;
            else nbsp = obsp;
//CoolDown
            ncsp  = Math.max(ocsp, ossp);

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        System.out.println(ossp);
    }
}
