import java.util.Scanner;
public class Exercico5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        double nota1,nota2;

        System.out.println("Digite a primeira nota parcial:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota parcial");
        nota2 = scanner.nextDouble();

        double media = (nota1 + nota2 )/ 2;

        if (media == 10){
        System.out.println("Aprovado com Distinção");
        }
        else if (media >=7 ){
            System.out.println("Aprovado");
        }
        else if (media <7){
            System.out.println("Reprovado");
        }
           scanner.close();
    }
}
