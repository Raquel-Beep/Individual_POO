//2 - Classes e Objetos Exercício: Criando a classe ContaBancaria. Detalhes: Migrar a lógica do exercício anterior para uma estrutura Orientada a Objetos.//

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private int saquesHoje;

    public ContaBancaria(int numero, String titular) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("Não é o Titular");
        }

        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.0; // bônus
        this.saquesHoje = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saquesHoje > 3) {
            throw new RuntimeException("Exedeu o limite de saques");
        }

        if (valor > 1000) {
            throw new RuntimeException("O saque máximo é 1000");
        }

        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente");
        }

        saldo -= valor;
        saquesHoje++;
    }
}