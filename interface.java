public interface Fretavel {
    double alugarVeiculo(
        double pesoCarga,
        int dias
    );
}

public interface Tributavel {
    double calcularIpva();
}