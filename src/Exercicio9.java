import java.util.Scanner;
import java.util.Arrays;
public class Exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2,numero3;

        System.out.println("Digite um primeiro numero:");
        numero1 = scanner.nextInt();
        System.out.println("");

        System.out.println("Digite um segundo numero:");
        numero2 = scanner.nextInt();
        System.out.println("");

        System.out.println("Digite um terceiro numero:");
        numero3 = scanner.nextInt();

        int [] numeros = {numero1, numero2 , numero3};
        Arrays.sort(numeros);
        int tamanho = numeros.length;
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[tamanho - 1 - i];
            numeros[tamanho - 1 - i] = temp;
        }

            System.out.println("Os números em ordem decrescente são: ");
            for (int numero : numeros) {
                System.out.println(numero);
        }
         scanner.close();

    }
}

