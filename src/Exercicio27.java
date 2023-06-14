import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args){
     Scanner scanner = new Scanner (System.in);
     double kgMaca = 0,kgMorango = 0,opcaokg;
     String opcao;

     System.out.println("Uma Fruteira está vendendo frutas com os seguintes preços:");
     System.out.println("Morango: até 5kg - R$2,50 kg, acima de 5kg - R$2,20 kg;");
     System.out.println("Maçã: até 5 kg - R$1,80 kg, acima de 5kg - R$1,50 kg.");
     System.out.println("digite a fruta e em seguida a quantidade de quilos:");
     opcao = scanner.nextLine();
     opcaokg = scanner.nextDouble();

     if (opcao.equalsIgnoreCase("Morango"))
         if (opcaokg <=5){
             kgMorango = opcaokg * 2.50;
             System.out.println("O valor a ser pago é de: R$" +kgMorango);
         }
         else if (kgMorango > 25) {
             kgMorango = opcaokg * (opcaokg * 2*20);
             double desconto = kgMorango * 0.10;
             System.out.println("O valor a ser pago com o desconto é de: R$" +desconto);
         }
         else {
             kgMorango = opcaokg * (opcaokg * 2*20);
             System.out.println("O valor a ser pago com o desconto é de: R$" +kgMorango);
         }
     if (opcao.equalsIgnoreCase("Maçã"))
         if (opcaokg <=5){
             kgMaca = opcaokg * 1.80;
             System.out.println("O valor a ser pago é de: R$" +kgMaca);
         }
         else if (kgMaca > 25) {
             kgMaca = opcaokg * (opcaokg *1.50);
             double desconto = kgMaca * 0.10;
             System.out.println("O valor a ser pago com o desconto é de: R$" +desconto);
         }
         else {
             kgMaca = opcaokg * (opcaokg *1.50);
             System.out.println("O valor a ser pago com o desconto é de: R$" +kgMaca);
         }
       scanner.close();

    }
}
