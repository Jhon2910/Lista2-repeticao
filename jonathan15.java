import java.util.Scanner;

public class jonathan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int f = 1;
        int n,soma;

        while (i < Integer.MAX_VALUE) {
            System.out.print("\nDigite um valor para saber para saber qual e ele na serie de Fibonacci: ");
            while (!sc.hasNextInt()){
                System.out.print("\nValor invalido, tente novamente!");
                System.out.print("\nDigite um valor para saber para saber qual e ele na serie de Fibonacci: ");
                sc.next();
            }
            n = sc.nextInt();

            if (n < 1){
                System.out.print("\nValor invalido, tente novamente!");
            }

            else {
            soma = 0;
                while (f <= n) {
                    soma += f;
                    f++;
                    soma++;
                }
                System.out.printf("O %dº numero da serie de Fibonacci é : %d",n,soma);
            }
            i++;
        }
        sc.close();
    }
}//nao acabei
