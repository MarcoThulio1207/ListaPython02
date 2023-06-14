import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String opcao;
        double valorGasolina,valorAlcool,pagamento = 0,litros;


        System.out.println("Escolha uma letra que represente o  tipo de combustível que deseha para abastecer:");
        System.out.println("");
        System.out.println("A - Alcool");
        System.out.println("G - Gasolina");
        opcao = scanner.nextLine();

        System.out.println("Quantos Litros deseja abastecer?");
        litros = scanner.nextDouble();

        valorGasolina = 2.50;
        valorAlcool = 1.90;




        if (opcao.equalsIgnoreCase("A"))
            if (litros <=20){
                pagamento = litros * (valorAlcool - (valorAlcool * 0.03));
            }
            else {
                pagamento = litros * (valorAlcool - (valorAlcool * 0.05));
            }
         if (opcao.equalsIgnoreCase("G")){
                if (litros <=20){
                    pagamento = litros * (valorGasolina - (valorGasolina * 0.04));
                }
                else {
                    pagamento = litros * (valorGasolina - (valorGasolina * 0.06));
                }
            }
         else {
                System.out.println("Tipo inserido inválido");
                return;
            }
            System.out.println("Valor a ser pago: R$" + pagamento);


            scanner.close();

        }




    }
