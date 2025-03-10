package users;
import com.igorramos.bliblioteca.Livro;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String nome, tipo;
    private int contLivros;
    private List<Livro> livrosLocados;

    public User(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.contLivros = tipo.equals("Professor") ? 5 : 2;
        this.livrosLocados = new ArrayList<>();
    }
    
    public boolean alugarLivro(Livro livros){
        if(livrosLocados.size() < contLivros && !livros.isLocado()){
            livrosLocados.add(livros);
            livros.setLocado(true);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean devolverLivro(Livro livro){
        if(livrosLocados.contains(livro)){
            livrosLocados.remove(livro);
            livro.setLocado(false);
            return false;
        }else{
            return false;
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getContLivros() {
        return contLivros;
    }

    public void setContLivros(int contLivros) {
        this.contLivros = contLivros;
    }

    public List<Livro> getLivro() {
        return livrosLocados;
    }

    public void setLivro(List<Livro> livro) {
        this.livrosLocados = livro;
    }
    
        
    
}
