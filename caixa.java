import java.util.scanner;

public class main {
    public static void main(string[] args) {
        scanner sc = new scanner(system.in);

        double saldo= 0;
        int opcao;
        int saquesHoje = 0;

        do {
            system.out.println("n\--- CAIXA ELETRÔNICO ---");
            system.out.println("1 - Ver saldo");
            system.out.println("2 - Depositar");
            system.out.println("3 - Sacar");
            system.out.println(" 0 - Sair");

            switch (opcao) {

                case 1:

                    System.out.println("Saldo: R$ " + saldo);
                        
                    break;

                case 2:

                    System.out.print("Valor para o depósito: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    
                    break;

                case 3:

                    if (saquesHoje > 3) {
                        System.out.println("Você exedeu seu limite de Saques, Volte amanhã!");
                        
                        break;
                    }
                     System.out.print("Valor para o saque: ");
                    double saque = sc.nextDouble();

                    if (saque > 1000) {
                        System.out.println("O valor máximo por saque é R$1000.");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente :( .");
                    } else {
                        saldo -= saque;
                        saquesHoje++;
                        System.out.println("Saque realizado!");
                    } break;
                    
                case 0:
                    system.out.println("Saindo...")
                    break;
                default:
                    system.out.println("Inválido!");
        
        } While (opcao != 0);
        
        sc.close();
    }
}