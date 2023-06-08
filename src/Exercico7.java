import java.util.Scanner;
public class Exercico7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1,numero2,numero3;

        System.out.println("Digite um numero:");
        numero1 = scanner.nextInt();
        System.out.println("");

        System.out.println("Digite um segundo numero:");
        numero2 = scanner.nextInt();
        System.out.println("");


        System.out.println("Digite um terceiro numero:");
        numero3 = scanner.nextInt();
        System.out.println("");

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O numero " +numero1+ " é o maior!");
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O numero " +numero2+ " é o maior!");
        }
        else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("O numero " +numero3+ " é o maior!");
        }

        if (numero1 < numero2 && numero1 < numero3){
            System.out.println("O numero " +numero1+ " é o menor!");
        }
        else if (numero2 < numero1 && numero2 < numero3){
            System.out.println("O numero " +numero2+ " é o menor!");
        }
        else if (numero3 < numero1 && numero3 < numero2){
            System.out.println("O numero " +numero3+ " é o menor!");
        }
        scanner.close();


    }
}