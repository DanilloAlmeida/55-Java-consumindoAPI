package br.com.alura.screenmatch.excecao;

public class MeuErroDeConversao extends RuntimeException {

    private String mensagem;
    public MeuErroDeConversao(String s) {
        this.mensagem = s;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }
}
