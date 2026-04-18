import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ipedido> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ipedido item) {
        itens.add(item);
    }

    public void fecharPedido() {
        double total = 0;

        System.out.println("\n--- RECIBO ---");
        System.out.println("Cliente: " + cliente.getNome());

        for (ipedido item : itens) {
            System.out.println(item.getNome() + " - R$ " + item.getTotal());
            total += item.getTotal();
        }

        double frete = (total > 250) ? 0 : 25;

        System.out.println("Frete: R$ " + frete);
        System.out.println("Total: R$ " + (total + frete));
    }
}