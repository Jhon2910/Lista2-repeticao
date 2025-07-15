import java.util.Scanner;

public class jonathan17{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double soma,sub,mult,div,n,resposta;
        int i,repetir=0,sair,opção,quantidade;


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

        System.out.print("Digite os numeros que gostaria de calcular: ");
        while (!sc.hasNextInt()){
            System.out.print("numero inválido");
            System.out.print("Digite os numeros que gostaria de calcular: ");
            if (quantidade >= 1 && quantidade <= 5){
        }

        System.out.print("--------------Menu----------------");
        System.out.println("1 - soma");
        System.out.println("2 - sub");
        System.out.println("3 - mult");
        System.out.println("4 - div");
        System.out.println("5 - Sair");

        System.out.print("\nDigite a opção: ");


        while (opção < 1 || opção > 5 || opção == !sc.hasNextInt()){
            System.out.println("\nNumero invalido!");
            System.out.println("--------------Menu----------------");
            System.out.println("1 - soma");
            System.out.println("2 - sub");
            System.out.println("3 - mult");
            System.out.println("4 - div");
            System.out.println("5 - Sair");
            System.out.print("Digite a opção: ");
            sc.next();
        }
        opção = sc.nextInt();

        if (opção == 1){
            System.out.printf("\nA soma = %.2f\",resposta");
        }
        else if(opção == 2){
            System.out.printf("\nA sub = %.2f\",resposta");
        }
        else if(opção == 3){
            System.out.printf("\nA mult = %.2f\",resposta");
        }
        else if (opção == 4){
            System.out.printf("\nA div = %.2f\",resposta");
        }
        else {
            return;
        }
        }

       repetir++;
        }
    }
}
