package caselli.gabriel;

import java.net.StandardSocketOptions;

public class Basico01 {
    public static void main(String[] args) {
        //Tipos primitivos
        int numero;
        float hp;
        double atk;
        boolean gigantamax;
        String nome;

        //Atribuição para variáveis
        numero=25;
        hp=155.0f;
        atk=255.0;
        gigantamax=true;
        nome="Pikachu";

        //Exibe os valores das variáveis
        System.out.println("Nome:" +nome);
        System.out.println("Gigantamax:" +gigantamax);
        System.out.println("HP:" + hp + " atk:" + atk);

    }
}
