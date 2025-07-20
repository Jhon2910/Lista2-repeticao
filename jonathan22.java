import java.util.Scanner;

public class jonathan22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi,s = 1;
        int i;
        double denominador = 1;
        double par = 1;

        for (i = 1;i<=51;i++){
            double proximodenominador = denominador + 2;
            if (denominador == par) {
                s = 1 / denominador + 1 / proximodenominador;
            }
            else {
                s = 1 / denominador - 1 / proximodenominador;
            }
            denominador = denominador + 2;
        }

        pi = Math.cbrt(s * 32);

        System.out.printf("PI = %.10f", pi);

        sc.close();
    }
}
