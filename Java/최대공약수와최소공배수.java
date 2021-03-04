import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 최대공약수와최소공배수 {

    public static int gcd(int a,int b){

        //최대공약수 최소공배수 알고리즘을 풀때는 GCD 를 많이 사용한다.
        //풀이 방법은 A와 B에 두 수가 주어지면 A의 약수를 모두 구하고  B의 약수를 구한 뒤에 공통된 약수만을 더하여 문제를 푼다.

         //GCD 방식을 이용
        if(b==0) {
            return a;
        }
            else{
                return gcd(b, a%b);
            }
        }

        public static void main(String []args)throws IOException {

        //여기서 Buffer는 입력을 받는 함수 입니다. 우리가 흔히 사용하는 함수는 Scanner 입니다. 하지만 Buffer을 사용하면 작업 처리 속도가 훨씬 빠른 것을 알 수 있습니다.

         /*기본적인 Buffer 설정 방법
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
            String s = bf.readLine(); //String
            int i = Integer.parseInt(bf.readLine()); //Int*/


           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            String[] input = br.readLine().split(" ");


            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            int gcd = gcd(a,b);
            int lcm = gcd * (a/gcd) * (b/gcd);

            sb.append(gcd).append("\n");
            sb.append(lcm).append("\n");

            System.out.println(sb);


    }
}
