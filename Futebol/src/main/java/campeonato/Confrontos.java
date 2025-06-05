package campeonato;

import clubes.Times;
import java.util.Random;

public class Confrontos {

    Random escolha = new Random();
    private Times times;

    public void marcarJogo(Times time1, Times time2) {

        if (time1.getId() != time2.getId()) {
            if (time1.getTotJogos() < 10 && time2.getTotJogos() <= 20) {
                time1.setTotJogos(time1.getTotJogos() + 1);
                time2.setTotJogos(time2.getTotJogos() + 1);
                
                System.out.println(time1.getNome() + " X " + time2.getNome());

                int decisao = escolha.nextInt(0, 3);
                if (decisao == 1) {
                    System.out.println("Vitoria do time: " + time1.getNome());
                    System.out.println(" ");
                    
                    time1.setTotVitorias(time1.getTotVitorias() + 1);
                    time1.setPontos(time1.getPontos() + 3);
                    time2.setDerrotas(time2.getDerrotas() + 1);
                } else if (decisao == 2) {
                    System.out.println("Vitoria do time: " + time2.getNome());
                    System.out.println(" ");
                    
                    time2.setTotVitorias(time2.getTotVitorias() + 1);
                    time2.setPontos(time2.getPontos() + 3);
                    time1.setDerrotas(time1.getDerrotas() + 1);
                } else {
                    System.out.println("Empatou!");
                    System.out.println(" ");
                    
                    time1.setPontos(time1.getPontos() + 1);
                    time2.setPontos(time2.getPontos() + 1);
                    time1.setEmpates(time1.getEmpates() + 1);
                    time2.setEmpates(time2.getEmpates() + 1);
                }
            } else {
                System.out.println("Um dos times ja jogou todos os jogos do campeonato!");
            }
        } else {
            System.out.println("Os times precisam ser diferentes!");
        }
    }
    

    public Times getTimes() {
        return times;
    }

    public void setTimes(Times times) {
        this.times = times;
    }
}
