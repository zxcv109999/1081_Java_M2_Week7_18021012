import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 0;
        for(int i=3;i<=a;i+=3){
            sum = sum+i;


        } System.out.println(sum);
    }
}