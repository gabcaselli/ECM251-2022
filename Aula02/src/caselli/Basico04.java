package caselli.gabriel;

import java.util.Scanner;

public class Basico04 {
    //Interagir com o terminal - entrada de dados pelo usuário
    public static void main(String[] args) {
        String nome,cavaleiro,mes;
        System.out.println("Informe seu nome:");

        //Para ler dados do teclado (console)
        Scanner scanner=new Scanner(System.in);                     //Lê a informação
        nome=scanner.nextLine();                                    //Armazena informação
        System.out.println("Informe o mês do seu aniversário");
        mes=scanner.nextLine();
        System.out.println("Nome: " +nome+ " Mês: " + mes);
        cavaleiro=achaCavaleiro(mes);
        System.out.println("Cavaleiro: " +cavaleiro);


    }

    private static String achaCavaleiro(String mes) {
        if (mes.equals("Janeiro")) return "Shura";
        else if (mes.equals("Fevereiro")) return "Kamus";
        else if (mes.equals("Março")) return "Albafica";
        else if (mes.equals("Abril")) return "Mu";
        else if (mes.equals("Junho")) return "Aldebaram";
        else if (mes.equals("Julho")) return "Saga/Kanon";
        else if (mes.equals("Agosto")) return "Máscara da Morte";
        else if (mes.equals("Setembro")) return "Aioria";
        else if (mes.equals("Outubro")) return "Shaka";
        else if (mes.equals("Novembro")) return "Mestre Ancião";
        else if (mes.equals("Dezembro")) return "Miro";
        else if (mes.equals("Junho")) return "Aioros";
        else return "Serpentário";

        }
    }

