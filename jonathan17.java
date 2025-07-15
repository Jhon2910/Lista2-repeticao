import java.util.Scanner;

public class jonathan17{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double soma,sub,mult,div,n;
        int sair,opção,quantidade;

        System.out.print("--------------Menu----------------");
        System.out.println("1 - soma");
        System.out.println("2 - sub");
        System.out.println("3 - mult");
        System.out.println("4 - div");
        System.out.println("5 - Sair");

        System.out.print("\nDigite a opção: ");
        
        while (opção > 5 || opção < 1 || opção == !sc.hasNextInt()){
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

        System.out.print("Digite quantos numeros gostaria de calcular: ");
        while (quantidade < 1 || quantidade != sc.nextInt()){
            System.out.print("Digigte um numero maior que 0!");
            sc.next();
        }


        System.out.print("Primeiro nº: ");
        n = sc.nextDouble();

        System.out.print("Segundo nº: ");
        n = sc.nextDouble();

        if (opção == 1){

        }
    }
}
