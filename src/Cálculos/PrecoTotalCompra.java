package Cálculos;

public class PrecoTotalCompra {

    public static float TotalCompra(int quantidade, float preco, float soma) {
        float total = quantidade * preco;
        soma = soma + total;
        return soma;
    }
}
