import java.util.Scanner;

public class lista1ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        float raio = scanner.nextInt();
 
        float pi = 3.14f;

        float area = (pi * (raio * raio));
    
        System.out.printf("A área do círculo é: %.2f\n", area);
        
        scanner.close();

    }


}