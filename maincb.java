public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1, "Amanda");

        conta.depositar(200);
        conta.sacar(100);

        System.out.println("Saldo: " + conta.getSaldo());
    }
}