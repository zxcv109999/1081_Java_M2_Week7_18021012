import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int sum=1;
        int t=0;
        for (int i = 1;i<=n;i++){
            sum*=2;
            t=t+sum;
        }
        System.out.println(t);
    }
}

