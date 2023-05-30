import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2;


        System.out.println("Digite um número:");
        numero1 = scanner.nextInt();

        System.out.println("Digite um segundo número:");
        numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("o primeiro número digitado  "  +numero1+ " é maior que o  segundo número digitado  "  +numero2);
        }
        else if (numero2 > numero1) {
        System.out.println("o segundo número digitado  "  +numero2+ " é maior que o primeiro número digitado  "  +numero1);
            scanner.close();
        }
    }
}
