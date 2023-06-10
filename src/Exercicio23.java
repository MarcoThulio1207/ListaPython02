import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double numero;

        System.out.println("Insira um núemro para saber se é Inteiro ou Decimal:");
        numero = scanner.nextDouble();

        double numerointeiro = Math.round(numero);

        if (numero == numerointeiro){
            System.out.println("O numero " +numero+ " ele é Inteiro");
        }
        else {
            System.out.println("O numero " +numero+ " é Decimal.");
        }
       scanner.close();

    }
}
