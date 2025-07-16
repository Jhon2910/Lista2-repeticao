import java.util.Scanner;

public class jonathan17{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double soma=0,sub=0,mult=0,div = 0,n,resposta;
        int i,repetir=0,sair, op,quantidade;

        while (repetir < Integer.MAX_VALUE){

        System.out.print("\nDigite quantos numeros gostaria de calcular: ");
        while (!sc.hasNextInt()){
            System.out.println("Numero inválido!");
            sc.next();
        }
        quantidade = sc.nextInt();

        if (quantidade < 1){
            System.out.print("Digigte um numero maior que 0!");
            sc.next();
            while (!sc.hasNextInt()){
                System.out.print("Digigte um numero maior que 0!");
                sc.next();
            }
            quantidade = sc.nextInt();
        }

        else {
            System.out.print("Digite os numeros que gostaria de calcular: ");
            while (!sc.hasNextInt()) {
                System.out.print("numero inválido");
                System.out.print("Digite os numeros que gostaria de calcular: ");
                n = sc.nextDouble();
                if (quantidade >= 1 && quantidade <= 5) {
                }

                System.out.print("--------------Menu----------------");
                System.out.println("1 - soma");
                System.out.println("2 - sub");
                System.out.println("3 - mult");
                System.out.println("4 - div");
                System.out.println("5 - Sair");

                System.out.print("\nDigite a opção: ");
                op = sc.nextInt();
                if (op < 1 || op > 5 || !sc.hasNextInt()) {
                    System.out.print("Numero inválido!");
                    return;
                }

                if (op == 1) {
                    soma =+ n;
                    System.out.printf("\nA soma = %.2f\",resposta", soma);
                } else if (op == 2) {
                    sub =- n;
                    System.out.printf("\nA sub = %.2f\",resposta", sub);
                } else if (op == 3) {
                    System.out.printf("\nA mult = %.2f\",resposta", mult);
                    mult *= n;
                } else if (op == 4) {
                    div /= n;
                    System.out.printf("\nA div = %.2f\",resposta", div);
                } else {
                    return;
                }
            }
            repetir++;
        }
        }
    }
}
