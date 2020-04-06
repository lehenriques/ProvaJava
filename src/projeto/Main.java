package projeto;

public class Main extends OpDividir {

    public static void main(String[] args) {
        OpDividir div = new OpDividir();

        double resposta = 0;

        try {
            resposta = div.divisao(5, 2);

            System.out.println("O resultado da divisão é: " + resposta);
        } catch (MsgExcecao msgExcecao) {
            System.out.println(msgExcecao.getMessage());
        }
    }
}
