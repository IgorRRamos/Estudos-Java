package com.igorramos.bliblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import users.User;

public class Bliblioteca {

    static List<Livro> livros = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        livros.add(new Livro(1, "Igor Ramos", "Livro teste"));
        livros.add(new Livro(2, "Dom casmurro", "Livro teste1"));
        livros.add(new Livro(3, "Machado de assis", "Livro teste2"));
        livros.add(new Livro(4, "Ivete Sangalo", "Livro teste3"));
        
        User cliente = new User("Igor", "Aluno");
        
        
        while(true){
            System.out.println("1 - Listar livros disponíveis ");
            System.out.println("2 - Alugar livro ");
            System.out.println("3 - Devolver livro ");
            System.out.println("4 - Sair ");
            System.out.print("Escolha uma opcao:  ");
            int opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:                   
                    listarLivros();                                     
                    break;
                case 2:
                    System.out.print("Digite o numero do livro desejado: ");
                    int escolha = entrada.nextInt();
                    entrada.nextLine();
                    Livro livroAlug = busca(escolha);
                    if(livroAlug != null && cliente.alugarLivro(livroAlug)){
                        System.out.println("Livro alugado com sucesso!");
                    }else{
                        System.out.println("Não foi possível alugar o livro");
                    }                                  
                    break;
                case 3:
                    System.out.print("Digite o numero do livro que deseja devolver: ");
                    int num = entrada.nextInt();
                    entrada.nextLine();
                    Livro livroDevolver = busca(num);
                    
                    if(livroDevolver != null && cliente.devolverLivro(livroDevolver)){
                        System.out.println("Livro devolvido com sucesso!");
                    }else{
                        System.out.println("Impossível devolver livro!");
                    }                                      
                    break;
                    
                case 4:
                    System.out.println("...");
                    break;                    
                default:
                    System.out.println("Opção invalida!");
            }      
        }
        
        
        
        
    }
    
    static void listarLivros(){
        for(Livro livro : livros){
            if(!livro.isLocado()){
                 System.out.println(livro.getId() + ". " + livro.getTitulo() + " - " + livro.getAutor());
            }
        }
    }
    
    static Livro busca(int id){
        for(Livro livro : livros){
            if(livro.getId() == id){
               return livro;
            }
        }
        return null;
    }
    
}
