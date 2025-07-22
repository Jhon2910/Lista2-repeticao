import java.util.Scanner;

class jonathan24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo (A): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro positivo (B): ");
        int b = scanner.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Erro: Os números devem ser inteiros positivos.");
            scanner.close();
            return;
        }

        if (b == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            scanner.close();
            return;
        }

        int quociente = 0;
        int resto = a;

        while (resto >= b) {
            resto = resto - b;
            quociente = quociente + 1;
        }

        System.out.println("O quociente da divisão de " + a + " por " + b + " é: " + quociente);
        System.out.println("O resto da divisão de " + a + " por " + b + " é: " + resto);

        scanner.close();
    }
}
