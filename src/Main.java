import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n=scn.nextInt();
            for (int i =3;i<n;i++){
                for (int j=i+1;j<n;j++){
                    for (int k =j+1;k<n;k++){
                        if (i+j+k<=n){
                            if (i*i+j*j==k*k){
                                System.out.print(i+"\t");
                                System.out.print(j+"\t");
                                System.out.print(k+"\t");
                            }
                        }
                    }
                }
            }
        }
}
