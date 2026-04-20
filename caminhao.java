public final class Caminhao extends Veiculo {
    private final double capacidadeCarga;

    public Caminhao(String placa, String marca, double valorLocacaoDiaria,
                    int anoFabricacao, double precoFipe, double capacidadeCarga) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (dias <= 0) throw new IllegalArgumentException();

        double total = dias * valorLocacaoDiaria;

        if (pesoCarga > capacidadeCarga) {
            total *= 1.10; // +10%
        }

        return total;
    }

    @Override
    public double calcularIpva() {
        if (isIsento()) return 0;
        return precoFipe * 0.015;
    }
}