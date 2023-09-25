package list.OperacoesBasicas.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
        for (Item i : carrinho) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
        } else {
        System.out.println("A lista está vazia!");
        }
    }
    
    public double calcularValorTotal() {
        double valorTotal = 0d;
        
        if (!carrinho.isEmpty()) {
            for (Item i : carrinho) {
                valorTotal += (i.getPreco() * i.getQuantidade());
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }        
    }
    
    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            System.out.println(this.carrinho);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itens=" + carrinho + "]";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionarItem("Lápis", 2d, 3);
        carrinho.adicionarItem("Lápis", 2d, 3);
        carrinho.adicionarItem("Caderno", 35d, 1);
        carrinho.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinho.exibirItens();

        // Removendo um item do carrinho
        carrinho.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinho.exibirItens();

        // Calculado e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());
    }


}
