import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1 =0,nota2 =0,nota3 =0;

        System.out.println("Insira a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota:");
        nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota:");
        nota3 = scanner.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        if(media == 10){
            System.out.println("Aprovado com Distinção. Sua média foi de: " +media);
        }
        else if (media >= 7 && media <=9){
            System.out.println("Aprovado. Sua média foi de: " +media);
        }
        else if (media < 7) {
            System.out.println("Reprovado. Sua média foi de: " + media);
        }
           scanner.close();
}
}


