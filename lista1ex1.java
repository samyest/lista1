import java.util.Scanner;

public class lista1ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int produto = n1 * n2;

        System.out.println("O produto de " + n1 + " e " + n2 + " é: " + produto);

        scanner.close();
    }
}