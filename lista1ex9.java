import java.util.Scanner;

public class lista1ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de homens: ");
        float homens = scanner.nextInt();
        
        System.out.println("Digite a quantidade de mulheres: ");
        float mulheres = scanner.nextInt();

        System.out.println("Digite a quantidade de crianças: ");
        float crianças = scanner.nextInt();


        float quilogramasDeCarne = ((650 * homens) + (420 * mulheres) + (290 * crianças))/1000;


        System.out.printf("A quantidade de quilogramas de carne é: %.1f ", quilogramasDeCarne);

        scanner.close();

    }
}