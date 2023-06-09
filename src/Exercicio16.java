import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double a = 0,b = 0,c = 0,x = 0;
        double delta;
        delta = a * x * 2 + b * x + c;

        System.out.println("Insira o valor para a:");
        a = scanner.nextDouble();
        if (a ==0){
            System.out.println("A equação não é de segundo grau. Programa encerrado");
            return;
        }
        System.out.println("Insira o valor para b:");
        b = scanner.nextDouble();
        System.out.println("Insira o valor para c:");
        c = scanner.nextDouble();

        if (delta < 0){
            System.out.println("A equação não possui raizes.");
            return;
        } else if (delta == 0) {
            double raiz = -b / (2*a);
            System.out.println("A equação possui uma raiz real." +raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("A equação possui duas raizes reais.");
            System.out.println("Raiz 1:" +raiz1);
            System.out.println("Raiz 2:" +raiz2);
        }
        scanner.close();


    }
}
