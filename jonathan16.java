import java.util.Scanner;

public class jonathan16 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int binario,i = Integer.MIN_VALUE;
        int sair;

        while (i < Integer.MAX_VALUE){

            System.out.print("1 para sair ou qualquer outro caracrter para continuar: ");
            sair = sc.nextInt();

            if (sair == 1){
                return;
            }

            else {

                System.out.print("\nDigite um numero binario(0's e 1's) para obter decimal,octal e hexadecimal: ");
                while (!sc.hasNextInt()) {
                    System.out.println("\ndigite um numero valido!");
                    System.out.print("Digite um numero binario(0's e 1's) para obter decimal,octal e hexadecimal: ");
                    sc.next();
                }
                binario = sc.nextInt();

                double decimal = 0;
                int expoente = 0;

                while (binario != 0) {
                    int dig = binario % 10;
                    binario = binario / 10;
                    if (dig != 0 && dig != 1) {
                        System.out.printf("O numero %d não é binario!\n", binario);
                        return;
                    } else {
                        while (decimal <= 0) {
                            decimal = dig * Math.pow(2, expoente);
                            expoente++;
                        }
                        System.out.printf("decimal = %f\n", decimal);


                        System.out.print("1 para sair ou qualquer outro caracrter para continuar: ");
                        sair = sc.nextInt();
                        if (sair == 1) {
                            return;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }
}
