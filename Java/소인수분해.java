import java.util.Scanner;

public class 소인수분해 {
    public static void main(String []args){



        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = 2; i <= Math.sqrt(n);i++){
            while (n%i ==0){

                System.out.println(i);
                n /= i;

            }
        }

        if (n != 1){
            System.out.println(n);
        }
    }
}
