public final class Carropas extends Veiculo {

    public Carropas(String placa, String marca, double valorLocacaoDiaria,
                        int anoFabricacao, double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (dias <= 0) throw new IllegalArgumentException();
        return dias * valorLocacaoDiaria;
    }

    @Override
    public double calcularIpva() {
        if (isIsento()) return 0;
        return precoFipe * 0.04;
    }
}