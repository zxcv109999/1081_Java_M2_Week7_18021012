import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        int sum=0;
        int k =0;
        while (n>0){
            k++;
            sum+=n%10;
            n=n/10;
        }
        System.out.println(k);
        System.out.println(sum);
    }
}
