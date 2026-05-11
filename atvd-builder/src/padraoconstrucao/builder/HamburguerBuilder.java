package padroescriacao.builder;

public class HamburguerBuilder {
    private Hamburguer hamburguer;

    public HamburguerBuilder() {
        hamburguer = new Hamburguer();
    }

    public Hamburguer build() {
        if (hamburguer.getNome().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        if (hamburguer.getPreco() == 0.0f) {
            throw new IllegalArgumentException("Preco invalido");
        }
        return hamburguer;
    }

    public HamburguerBuilder setNome(String nome) {
        hamburguer.setNome(nome);
        return this;
    }

    public HamburguerBuilder setPreco(float preco) {
        hamburguer.setPreco(preco);
        return this;
    }

    public HamburguerBuilder setTamanho(String tamanho) {
        hamburguer.setTamanho(tamanho);
        return this;
    }

    public HamburguerBuilder setTipoPao(String tipoPao) {
        hamburguer.setTipoPao(tipoPao);
        return this;
    }

    public HamburguerBuilder setTipoCarne(String tipoCarne) {
        hamburguer.setTipoCarne(tipoCarne);
        return this;
    }

    public HamburguerBuilder setQueijo(boolean queijo) {
        hamburguer.setQueijo(queijo);
        return this;
    }

    public HamburguerBuilder setBacon(boolean bacon) {
        hamburguer.setBacon(bacon);
        return this;
    }

    public HamburguerBuilder setAlface(boolean alface) {
        hamburguer.setAlface(alface);
        return this;
    }

    public HamburguerBuilder setTomate(boolean tomate) {
        hamburguer.setTomate(tomate);
        return this;
    }

    public HamburguerBuilder setCebola(boolean cebola) {
        hamburguer.setCebola(cebola);
        return this;
    }

    public HamburguerBuilder setPickles(boolean picles) {
        hamburguer.setPickles(picles);
        return this;
    }

    public HamburguerBuilder setMolhoEspecial(String molhoEspecial) {
        hamburguer.setMolhoEspecial(molhoEspecial);
        return this;
    }

    public HamburguerBuilder setObservacoes(String observacoes) {
        hamburguer.setObservacoes(observacoes);
        return this;
    }
}