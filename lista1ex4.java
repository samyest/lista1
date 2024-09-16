import java.util.Scanner;

public class lista1ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int X = scanner.nextInt();

        System.out.println("O valor de X é: " + X);

        int quadrado = X * X;
        System.out.println("O quadrado de X é: " + quadrado);

        int resto = X % 3;
        System.out.println("O resto da divisão de X por 3 é: " + resto);

        double metade = X / 2.0;
        System.out.println("A metade de X é: " + metade);

        double produto = X * metade;
        System.out.println("O produto de X pela metade de X é: " + produto);

        scanner.close();
    }
}
