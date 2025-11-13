import java.util.Scanner;
import java.util.Locale;

public class ConversorTemperatura {

    public static void main(String[] args) {
        // Configura o Scanner para usar ponto como separador decimal (para entradas como 25.5)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("--- 🌡️ Conversor de Temperatura ---");
        System.out.print("Digite a temperatura em graus Celsius (°C): ");

        // 1. Receber a temperatura em Celsius
        if (!scanner.hasNextDouble()) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            scanner.close();
            return;
        }
        
        double celsius = scanner.nextDouble();
        
        // 2. Realizar os cálculos de conversão

        // Fórmula para Fahrenheit: (°C x 9/5) + 32
        // Usamos 9.0/5.0 para garantir a divisão de ponto flutuante
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;

        // Fórmula para Kelvin: °C + 273.15
        double kelvin = celsius + 273.15;
        
        // 3. Exibir os resultados
        System.out.println("\n--- Resultados da Conversão ---");
        System.out.printf("Temperatura Original (Celsius): %.2f °C%n", celsius);
        System.out.println("---------------------------------");
        System.out.printf("Convertida para Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Convertida para Kelvin: %.2f K%n", kelvin);
        System.out.println("---------------------------------");

        scanner.close();
    }
}