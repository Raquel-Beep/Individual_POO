public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ABC1234", "Volvo", 500, 2010, 100000, 10);
        Carropas carro = new Carropas("XYZ9999", "Toyota", 200, 2022, 80000);

        System.out.println("Aluguel Caminhão: " + caminhao.alugarVeiculo(12, 2));
        System.out.println("IPVA Caminhão: " + caminhao.calcularIpva());

        System.out.println("Aluguel Carro: " + carro.alugarVeiculo(0, 3));
        System.out.println("IPVA Carro: " + carro.calcularIpva());
    }
}