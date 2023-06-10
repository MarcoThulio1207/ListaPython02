import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valor;
        int centena,dezena,unidade;

        System.out.println("Os valores mínimos para o saque é de 10 reais e o máximo é de 600 reais. As notas disponívei são: 1,5,10,50 e 100 reais.");
        System.out.println("Qual o valor que deseja sacar?");
        valor = scanner.nextInt();


        if (valor < 100 || valor > 600){
        }
        else {
            int nota100 = valor / 100;
            int resto = valor % 100;

            int nota50 = resto / 50;
            resto %= 50;

            int nota10 = resto / 10;
            resto %= 10;

            int nota5 = resto/ 5;
            resto %= 5;

            int not1 = resto;

            System.out.println("Notas do Saque:");
            System.out.println("Notas de 100:" + nota100);
            System.out.println("Notas de 50:" + nota50);
            System.out.println("Notas de 10:" + nota10);
            System.out.println("Notas de 5:" + nota5);
            System.out.println("Notas de 1:" + not1);
        }

        scanner.close();

    }
}
