import java.util.Scanner;

public class lista1ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        float TempFahrenheit = scanner.nextInt();

        float celcius = 5 * (TempFahrenheit - 32) / 9;

        System.out.printf("A temperatura em Celcius é: %.1f ", celcius);

        scanner.close();



    }
}