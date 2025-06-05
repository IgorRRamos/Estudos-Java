package com.igorramos.jogodaforca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogoDaForca {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Character> palForca = new ArrayList<>(); //Está como Character para utilizar o charAt para quebrar a String
        List<String> escondida = new ArrayList<>();
        String palChave;

        System.out.print("Digite a palavra: ");
        palChave = entrada.nextLine();

        //Fiz esse for para quebrar a string e alocar cada letra em uma posição no Array
        for (int indice = 0; indice < palChave.length(); indice++) {
            palForca.add(palChave.charAt(indice));
            escondida.add("*"); // Aqui estou criando um array com * para esconder a palavra
        }

        int escolha, contador = 0, contTentativas = 0 , contChute=0;

        do {
            System.out.println(" ");
            System.out.println("Jogo da forca");
            System.out.println("A palavra tem *" + escondida.size() + "* letras"); // Estou usando o size para mostrar o tamanho da palavra
            for (String list : escondida) {    //Esse for é pra apresentar a palavra escondida, fiz o for para que não seja imprimido na tela com virgulas.
                System.out.print(list);
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1 - chutar letra");
            System.out.println("2 - chutar palavra");
            System.out.println("3 - sair do jogo");
            System.out.print("Escolha: ");
            escolha = entrada.nextInt();
            System.out.println(" ");

            switch (escolha) {
                case 1:

                    if (contTentativas == escondida.size() / 2) { //Essa logica e para que o usuario tenha um limite de tentativas de chute de letra, para nao conpletar a palavra
                        System.out.println("Voce excedeu o limite de tentativas de chute de letra!!!!");
                        System.out.println("Voce precisa chutar a palavra!!!!");
                        break;
                    } else {
                        entrada.nextLine(); // Limpeza de buffer
                        System.out.println(" ");
                        System.out.print("Digite uma letra:  ");
                        String letra;
                        letra = entrada.nextLine();

                        contTentativas++;

                        for (int indice = 0; indice < palForca.size(); indice++) {
                            if (palForca.get(indice) == letra.charAt(0)) { // Nessa linha eu usei o charAt com o indice 0 pois a entrada e do tipo String. Ambos precisam ser do mesmo tipo
                                escondida.set(indice, letra);
                                contador++;
                            }

                        }
                        System.out.println(" ");
                        System.out.println("Voce acertou " + contador + " Letras");
                        System.out.println(" ");
                    }
                    break;

                case 2:
                    if (contChute == 2) { //Essa logica e para que o usurio tambem tenha um limite de tentativas de chute.
                        System.out.println("Voce excedeu o limite de tentativas!!!!");
                        System.out.println("Voce perdeu!!!!");
                        escolha = 3;
                        break;
                    } else {
                        entrada.nextLine(); // Limpeza de buffer
                        System.out.println(" ");
                        System.out.print("Digite uma palavra:  ");
                        String chute;
                        chute = entrada.nextLine();
                        contChute++;

                        if (chute.equals(palChave)) { //É uma comparação simples, pois se o chute for igual a palavra chave que o usuario escolheu ele vence.
                            System.out.println("Voce acertou!!! " + "*** " + chute + " ***");                        
                            escolha = 3; // Caso a palavra esteja correta escolha recebe 3 e o jogo e encerrado.
                            break;
                        } else {
                            System.out.println("Que pena você errou!");
                        }
                    }
                    break;
            }

        } while (escolha != 3);

    }
}
