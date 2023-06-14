import java.util.Scanner;

public class Exercicio17 {

        public static void main(String[] args) {
            int ano = 0;
            Scanner bissexto = new Scanner(System.in);

            System.out.println("Escreva o ano para saber se é Bissexto:");
            ano = bissexto.nextInt();

            if (ano % 400 ==0){
                System.out.println(ano + " É um ano Bissexto!");
            } else if ((ano % 4 ==0) && (ano % 100!=0)) {
                System.out.println(ano + " É um ano Bissexto!");
            } else {
                System.out.println(ano + " Não é um ano Bissexto!");
            }
            bissexto.close();
        }
    }


