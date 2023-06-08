import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    double preco1,preco2,preco3;

    System.out.println("Quanto custa um capote de arroz?");
    System.out.print("R$ "); preco1 = scanner.nextDouble();

    System.out.println("Quanto custa um pacote de feijão?");
    System.out.print("R$ "); preco2 = scanner.nextDouble();

    System.out.println("Quanto custa um pacote de macarrão?");
    System.out.print("R$ "); preco3 = scanner.nextDouble();

    if (preco1 < preco2 && preco1 < preco3){
        System.out.println("Compre o Arroz, pois ele é mais barato!");
    }
    else if (preco2 < preco1 && preco2 < preco3){
        System.out.println("Compre o Feijão, pois ele é mais barato!");
    }
    else if (preco3 < preco1 && preco3 < preco2){
        System.out.println("Compre o Macarrão, pois ele é mais barato!");
        }
      scanner.close();
    }
}
