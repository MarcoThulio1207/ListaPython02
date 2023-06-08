import java.util.Scanner;
public class Exercico2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println("Digite ume valor:");
        valor = scanner.nextInt();

        if (valor > 0) {
            System.out.println("O número " + valor + " é positivo");
        }
        else if (valor < 0){
            System.out.println("O número " + valor + " é négativo");

        }
        scanner.close();
    }
}