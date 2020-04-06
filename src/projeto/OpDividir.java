package projeto;

public class OpDividir {
    protected double divisao (double n1, double n2) throws MsgExcecao {
        if (n2 == 0 ){
            throw new MsgExcecao("Deu Erro");
        } else {
            return n1/n2;
        }
    }
}
