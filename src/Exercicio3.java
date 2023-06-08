import java.util.Scanner;
public class Exercico3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        char letra;
        char F,M;

        System.out.println("Digite F ou M para saber qual o sexo:");
        letra = scanner.nextLine().charAt(0);

        if (letra == 'F' || letra == 'f'){
            System.out.println("Feminino");
        }
        else if (letra == 'M' || letra == 'm'){
            System.out.println("Masculino");
        }
        else if ((letra != 'F') || (letra != 'M')) {
            System.out.println("Sexo inválido");
        }
        scanner.close();


    }
}

