package Cálculos;

public class TrocoDinheiro {

    static float troco = -1;

    public static float Troco(float preco_total, float preco_passado) {
        troco = preco_passado - preco_total;
        return troco;
    }

    public static float RetornoTroco() {
        return troco;
    }
}
