import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum=0;
        int k=0;
        boolean bln=true;
        for (int i = 2;i<=n;i++){
            k=i;
            for (;k!=1;){
                if (k%2==0){
                    k=k/2;
                }
                else if (k%3==0){
                    k=k/3;
                }
                else if (k%5==0){
                    k=k/5;
                }
                else {
                    bln=false;
                    break;
                }
            }
            if (bln){
                sum=sum+i;
            }
            bln=true;
        }
        System.out.println(sum);
    }
}