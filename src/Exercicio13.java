import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            String diaSemana = diasSemana[numero - 1];
            System.out.println("O dia correspondente é: " + diaSemana);
        } else {
            System.out.println("Valor inválido. Digite um número entre 1 e 7.");
        }
    }
}
