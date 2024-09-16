import java.util.Scanner;

public class lista1ex3_2{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número: ");
    float n1 = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    float n2 = scanner.nextInt();
   
    System.out.println("Digite o terceiro número: ");
    float n3 = scanner.nextInt();
    
    System.out.println("Digite o quarto número: ");
    float n4 = scanner.nextInt();

    float media = (n1 + n2 + n3 + n4) / 4;

    System.out.println("A média aritmética de " + n1 + ", " + n2 + " , " + n3 + " e " + n4 + " é: " + media);

    scanner.close();

    }
}