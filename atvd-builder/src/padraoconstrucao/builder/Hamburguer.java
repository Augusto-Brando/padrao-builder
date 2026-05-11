package padroescriacao.builder;

public class Hamburguer {
    private String nome;
    private float preco;
    private String tamanho;
    private String tipoPao;
    private String tipoCarne;
    private boolean queijo;
    private boolean bacon;
    private boolean alface;
    private boolean tomate;
    private boolean cebola;
    private boolean picles;
    private String molhoEspecial;
    private String observacoes;

    public Hamburguer() {
        this.nome = "";
        this.preco = 0.0f;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoPao() {
        return tipoPao;
    }

    public void setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isAlface() {
        return alface;
    }

    public void setAlface(boolean alface) {
        this.alface = alface;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    public boolean isPickles() {
        return picles;
    }

    public void setPickles(boolean picles) {
        this.picles = picles;
    }

    public String getMolhoEspecial() {
        return molhoEspecial;
    }

    public void setMolhoEspecial(String molhoEspecial) {
        this.molhoEspecial = molhoEspecial;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}