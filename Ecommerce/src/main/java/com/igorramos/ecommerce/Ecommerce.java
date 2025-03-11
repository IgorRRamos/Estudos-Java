package com.igorramos.ecommerce;

import com.igorramos.ecommerce.store.Carrinho;
import com.igorramos.ecommerce.store.Produto;
import com.igorramos.ecommerce.users.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {

    static List<Produto> produto = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    static Usuario cliente = new Usuario(2, "Igor", 5000);

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho(cliente);
        
        int opcao;

        do {
            System.out.println("1 - listar produtos");
            System.out.println("2 - Adicionar produto");
            System.out.println("3 - Adicionar produto ao carrinho");
            System.out.println("4 - Remover produto do carrinho");
            System.out.println("5 - Listar produtos do carrinho");
            System.out.println("6 - Comprar produto");
            System.out.println("7 - Sair ");
            System.out.println(" ");
            System.out.print("Opcao: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    for (Produto lista : produto) {
                        System.out.println(lista);
                    }
                    break;
                case 2:
                    System.out.print("Digite o id do produto: ");
                    int idProd = entrada.nextInt();
                    System.out.print("Digite o nome do produto: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    System.out.print("Digite o preco do produto: ");
                    double preco = entrada.nextDouble();
                    System.out.println("");
                    produto.add(new Produto(idProd, nome, preco));
                    System.out.println("Produto adicionado com sucesso!");
                    System.out.println(" ");
                    break;

                case 3:
                    int id;
                    System.out.print("Digite o id do produto que deseja adicionar ao carrinho: ");
                    id = entrada.nextInt();

                    for (int indice = 0; indice < produto.size(); indice++) {
                        if (produto.get(indice).getId() == id) {
                            carrinho.adCarrinho(produto.get(indice));
                            System.out.println("Adicionado ao carrinho com sucesso");
                            System.out.println(" ");
                        }
                    }
                    break;

                case 4:
                    int num;
                    System.out.print("Digite o id do produto que deseja remover ao carrinho: ");
                    num = entrada.nextInt();

                    for (int indice = 0; indice < produto.size(); indice++) {
                        if (produto.get(indice).getId() == num) {
                            carrinho.remover(produto.get(indice));
                            System.out.println("Produto removido com sucesso");
                            System.out.println(" ");
                        }
                    }
                    break;

                case 5:
                    carrinho.listar();
                    System.out.println(" ");
                    break;

                case 6:
                    int numId;
                    System.out.print("Digite o id do produto que deseja comprar: ");
                    numId = entrada.nextInt();

                    for (int indice = 0; indice < produto.size(); indice++) {
                        if (produto.get(indice).getId() == numId) {
                            carrinho.comprar(produto.get(indice));
                            System.out.println("Item comprar com sucesso!");
                            System.out.println(" ");
                        }
                    }
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 7);
    }
}
