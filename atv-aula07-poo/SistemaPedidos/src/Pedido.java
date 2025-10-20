import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double subtotal() {
            return quantidade * precoUnitario;
        }

        public void mostrarItem() {
            System.out.println(nomeProduto + " - Qtd: " + quantidade +
                    " - Preço: " + precoUnitario +
                    " - Subtotal: " + subtotal());
        }
    }

    public void adicionarItem(String nome, int qtd, double preco) {
        itens.add(new ItemPedido(nome, qtd, preco));
    }

    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.subtotal();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : itens) {
            item.mostrarItem();
        }
        System.out.println("Valor Total: R$ " + valorTotal());
    }
}
