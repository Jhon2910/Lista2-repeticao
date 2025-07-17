import java.util.Scanner;

public class jonathan18 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeUsuario,quantidade=0,n,i=Integer.MIN_VALUE;
        int par = 2,impar = 1;

        while (i < Integer.MAX_VALUE){
            System.out.print("\nDigite a quantidadeUsuario numeros que gostaria de digitar: ");
            while (!sc.hasNextInt()) {
                System.out.println("Numero invalido!Tente novamente!");
                System.out.print("Digite a quantidadeUsuario numeros que gostaria de digitar: ");
                sc.next();
            }
            quantidadeUsuario = sc.nextInt();

            if (quantidadeUsuario > 0){
            System.out.print("Digite o valor para calcular a media de valores PARES e IMPARE:");
            n = sc.nextInt();

            if (n < 0){
                System.out.println("Numero negativo!");
                return;
            }
            else {
                while (quantidade <= quantidadeUsuario){
                    par += n;
                }
            }
            }
            else {
                System.out.print("Digite um numero maior real nulo ou positivo!");
                i++;
            }
        }
    }//terimar
}
