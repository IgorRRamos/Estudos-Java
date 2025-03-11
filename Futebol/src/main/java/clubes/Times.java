package clubes;

public class Times {
    private String nome;
    private int id,totVitorias, pontos, derrotas, totJogos, empates;

    public Times(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.totVitorias = 0;
        this.pontos = 0;
        this.derrotas = 0;
        this.totJogos = 0;
        this.empates = 0;
    }

    @Override
    public String toString() {
        return "Time: " + nome + "  Pontos: " + pontos + "  Jogos: " + totJogos + "  Vitorias: " + totVitorias + "  Derrotas: " + derrotas + "  Empates: " + empates + "";
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotVitorias() {
        return totVitorias;
    }

    public void setTotVitorias(int totVitorias) {
        this.totVitorias = totVitorias;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getTotJogos() {
        return totJogos;
    }

    public void setTotJogos(int totJogos) {
        this.totJogos = totJogos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
