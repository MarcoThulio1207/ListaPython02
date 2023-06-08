import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Insira sua primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira sua segunda nota:");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String conceito = null;

        if(media >=9 && media <=10 ){
            conceito =  "A";
        }
        else if (media >= 7.5 && media <=9){
            conceito = "B";
        } else if (media >= 6 && media <= 7.5) {
            conceito = "C";
        } else if (media >= 4 && media <=6) {
            conceito = "D";
        } else if (media  <=4) {
            conceito = "E";
        }

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")){
            System.out.println("Sua nota primeira foi de " +nota1+ ", sua segunda nota foi de " +nota2+ ",sua média foi de " +media+ " e seu conceito é " +conceito+ ",seu resultado é de Aprovado!!!!");
        }
        else if (conceito.equals("D") || conceito.equals("E")){
              System.out.println("Reprovado!");
        }
           scanner.close();
    }
}