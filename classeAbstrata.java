public abstract sealed class Veiculo implements Fretavel, Tributavel
        permits Caminhao, CarroPasseio {

    protected final String placa;
    protected final String marca;
    protected double valorLocacaoDiaria;
    protected final int anoFabricacao;
    protected double precoFipe;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria,
                   int anoFabricacao, double precoFipe) {

        if (placa == null || marca == null || valorLocacaoDiaria <= 0 || precoFipe <= 0) {
            throw new IllegalArgumentException("Dados inválidos");
        }

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }

    protected boolean isIsento() {
        int anoAtual = 2026;
        return (anoAtual - anoFabricacao) > 20;
    }
}