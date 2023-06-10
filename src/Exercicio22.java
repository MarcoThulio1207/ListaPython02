import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int numero;

        System.out.println("Insira um número para saber se é impar ou par:");
        numero = scanner.nextInt();

        if(numero % 2 ==0){
            System.out.println(numero +" é Par");
        }
        else {
            System.out.println(numero + " é Impar");
        }

    }
}
