import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado1,lado2,lado3;

        System.out.println("Insira um priemiro valor para formar um triângulo:");
        lado1 = scanner.nextInt();

        System.out.println("Insira um segundo valor para formar um triângulo:");
        lado2 = scanner.nextInt();

        System.out.println("Insira um terceiro valor para formar um triângulo:");
        lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isósceles");
        }
        else  {
            System.out.println("Escaleno");
        }

        scanner.close();

    }
}