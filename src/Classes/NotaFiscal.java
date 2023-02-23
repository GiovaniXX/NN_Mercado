package Classes;

public class NotaFiscal {

    private String codigoNotaFiscal;
    private date data;
    private Funcionario operadorNome;
    private DadosSupermercado dadosSupermercado;
    private CarrinhoDeCompra carrinhoDeCompra;

    //Contrutor
    public NotaFiscal(String codigoNotaFiscal, date data, Funcionario operadorNome, DadosSupermercado dadosSupermercado, CarrinhoDeCompra carrinhoDeCompra) {
        this.codigoNotaFiscal = codigoNotaFiscal;
        this.data = data;
        this.operadorNome = operadorNome;
        this.dadosSupermercado = dadosSupermercado;
        this.carrinhoDeCompra = carrinhoDeCompra;
    }
    
    //Get
    public String getCodigoNotaFiscal() {
        return codigoNotaFiscal;
    }

    public date getData() {
        return data;
    }

    public Funcionario getOperadorNome() {
        return operadorNome;
    }

    public DadosSupermercado getDadosSupermercado() {
        return dadosSupermercado;
    }

    public CarrinhoDeCompra getCarrinhoDeCompra() {
        return carrinhoDeCompra;
    }
    
    //Set
    public void setCodigoNotaFiscal(String codigoNotaFiscal) {    
        this.codigoNotaFiscal = codigoNotaFiscal;
    }

    public void setData(date data) {
        this.data = data;
    }

    public void setOperadorNome(Funcionario operadorNome) {
        this.operadorNome = operadorNome;
    }

    public void setDadosSupermercado(DadosSupermercado dadosSupermercado) {
        this.dadosSupermercado = dadosSupermercado;
    }

    public void setCarrinhoDeCompra(CarrinhoDeCompra carrinhoDeCompra) {    
        this.carrinhoDeCompra = carrinhoDeCompra;
    }

    //Metodos
    
    public void DadosNotaFiscal() {
    }

    public void formaDePagamento() {

    }
}
