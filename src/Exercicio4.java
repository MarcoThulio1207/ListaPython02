import java.util.Scanner;
public class Exercicio4 {
    public static void main (String [] args){
        Scanner scanner  = new Scanner (System.in);
        char letra;

        System.out.println("Digite uma letra para saber se é vogal ou consoante:");
        letra = scanner.nextLine().charAt(0);

        if (letra == 'A' || letra == 'a' || letra == 'E' || letra == 'e' || letra == 'I' || letra == 'i' || letra == 'O' || letra == 'o' || letra == 'U' || letra == 'u' ){
            System.out.println("A letra digitada é uma Vogal");
        }
        else if (letra != 'A' || letra != 'a' || letra != 'E' || letra != 'e' || letra != 'I' || letra != 'i' || letra != 'O' || letra != 'o' || letra != 'U' || letra != 'u'  ) {
            System.out.println("A letra digitada é uma Consoante");
        }
          scanner.close();
    }
}
