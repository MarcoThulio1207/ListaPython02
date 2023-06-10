import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int centenas,dezenas,unidades;

        System.out.println("Insira um número menor que 1000:");
        numero = scanner.nextInt();
        if (numero > 1000){
            System.out.println("Eu disse menor que 1000, tente novamente :|");
            return;
        }

        centenas = numero/100;
        dezenas = (numero%100) /10;
        unidades = numero % 10;

        if (numero >=100 && numero <=999){
            System.out.println(numero+ " = " +centenas+" centenas, " +dezenas+ " dezenas e " +unidades+ " unidades.");
        } else if (numero >=10 && numero <=99) {
            System.out.println(numero+ " = "  +dezenas+ " dezenas e " +unidades+ " unidades.");
        }
        else if (numero >=1 && numero <=9){
            System.out.println(numero+ " = "  +unidades+ " unidades.");
        }

        scanner.close();

    }
}
