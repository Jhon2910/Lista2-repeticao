import java.util.Scanner;

public class jonathan13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int primo = 0;

            while (primo <= n) {
                if (primo % 0) {
                    System.out.println(primo+ "Não primo! ");
                } else {
                    System.out.println(primo+ "primo! ");
                }
                n++;
            }
        }
    }
}//nao terminei
