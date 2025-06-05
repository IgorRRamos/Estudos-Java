package com.igorramos.futebol;
import campeonato.Confrontos;
import clubes.Times;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Futebol {

    static Random random = new Random();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int jogos = 1;
        List<Times> times = new ArrayList<>();
        Confrontos jogo = new Confrontos();
        times.add(new Times(1, "Cruzeiro"));
        times.add(new Times(2, "Flamengo"));
        times.add(new Times(3, "Atletico-mg"));
        times.add(new Times(4, "Botafogo"));
        times.add(new Times(5, "Portuguesa"));
        times.add(new Times(6, "Palmeiras"));
        times.add(new Times(7, "São paulo"));
        times.add(new Times(8, "Santos"));
        times.add(new Times(9, "Corinthians"));
        times.add(new Times(10, "America-MG"));
        times.add(new Times(11, "Fluminense"));
        times.add(new Times(12, "Bahia"));
        int opcao = 0;
        
        do {
            System.out.println(" ");
            System.out.println("1 - Jogar rodada ");
            System.out.println("2 - Tabela ");
            System.out.println("3 - Sair ");
            System.out.print("Opcao:  ");           
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    for (int indice = 0; indice < times.size(); indice++) {
                        if (times.get(indice).getTotJogos() < jogos) {
                            int escolha;
                            do{
                                escolha = random.nextInt(times.size());
                            }while(times.get(indice).getId() == escolha);
                            jogo.marcarJogo(times.get(indice), times.get(escolha));
                       }
                    }
                    jogos++;
                    break;

                case 2:
                    tabela(times);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 3);
    }

    static void tabela(List<Times> times) {
        Collections.sort(times, new Comparator<Times>() {
            @Override
            public int compare(Times time1, Times time2) {
                return Integer.compare(time2.getPontos(), time1.getPontos());
            }
        });

        System.out.println("Tabela");
        for (Times time : times) {
            System.out.println(time);
        }
    }
}
