interface Request {
    public void setDadosRecebidos (double peso, double altura, double largura, double comprimento, String cepOrigem, String cepDestino);
    public boolean getDadosRecebidos();
}

public class validaDados implements Request{
    private double peso;
    private double altura;
    private double largura;
    private double comprimento;
    private String cepOrigem;
    private String cepDestino;
    private boolean validacao;

    public void setDadosRecebidos(double peso, double altura, double largura, double comprimento, String cepOrigem, String cepDestino) {
        if (peso > 0 && altura > 0 && largura > 0 && comprimento > 0 && /* Tratar isso -> cepOrigem.length() = 8) && cepDestino.length() = 8) */{
            this.validacao = true;
        }
        else {
            this.validacao = false;
        }
    }

    public boolean getDadosRecebidos() {
        return this.validacao;
    }

    public static void main(String[] args){
        validaDados validacao = new validaDados();
        validacao.setDadosRecebidos();
        System.out.println(validacao.getDadosRecebidos());
    }
}
