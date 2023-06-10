import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args){
     Scanner scanner = new Scanner (System.in);
     String resposta1,resposta2,resposta3,resposta4,resposta5;

     System.out.println("Um crime acaba de acontecer. Responda as próximas perguntas com Sim ou Não.");
        System.out.println("");

     System.out.println("1 - Telefonou para a vítima?");
     resposta1 = scanner.nextLine();

     System.out.println("2 - Esteve no local do crime?");
     resposta2 = scanner.nextLine();

     System.out.println("3 - Mora perto da vítima?");
     resposta3 = scanner.nextLine();

     System.out.println("4 - Devia para a vítima?");
     resposta4 = scanner.nextLine();

     System.out.println("5 - Já trabalhou com a vítima?");
     resposta5 = scanner.nextLine();

     int contadorderesposta = 0;


     if (resposta1.equalsIgnoreCase("Sim")) {
         contadorderesposta++;
     }
     if (resposta2.equalsIgnoreCase("Sim")) {
            contadorderesposta++;
        }
     if (resposta3.equalsIgnoreCase("Sim")) {
            contadorderesposta++;
        }
     if (resposta4.equalsIgnoreCase("Sim")) {
            contadorderesposta++;
        }
     if (resposta5.equalsIgnoreCase("Sim")) {
            contadorderesposta++;
        }

     if (contadorderesposta == 2){
         System.out.println("Suspeita");
     }
     else if (contadorderesposta >=3 && contadorderesposta <=4){
         System.out.println("Cúmplice");
        }
     else if (contadorderesposta == 5){
         System.out.println("Assassino");
     }
     else {
         System.out.println("Inocente");
     }
     scanner.close();
    }
}

