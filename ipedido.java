public class IPedido {
    private String nome;
    private int quantidade;
    private double preco;

    public IPedido(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public double getTotal() {
        return quantidade * preco;
    }

    public String getNome() {
        return nome;
    }
}