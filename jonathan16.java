import java.util.Scanner;

public class jonathan16 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero binario(0's e 1's) para obter decimal,octal e hexadecimal: ");
        int binario = sc.nextInt();

        double decimal = 0;
        int expoente = 0;

        while (binario != 0) {
            int dig = binario % 10;
            binario = binario / 10;
            if (dig != 0 && dig != 1) {
                System.out.printf("O numero %d não é binario!\n", binario);
                return;
            } else {
                while (decimal <= 0){
                    decimal = dig * Math.pow(2, expoente);
                    expoente++;
                }
                System.out.printf("decimal = %f\n",decimal);
            }
        }
    }
}
