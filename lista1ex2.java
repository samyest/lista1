import java.util.Scanner;

public class lista1ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();
       
        System.out.println("Digite o terceiro número: ");
        int n3 = scanner.nextInt();
        
        int soma = n1 + n2 + n3;

        System.out.println("A soma de " + n1 + ", " + n2 + " e " + n3 + " é: " + soma);

        scanner.close();

    }
}
