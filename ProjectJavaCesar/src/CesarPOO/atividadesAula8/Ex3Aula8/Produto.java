package atividade.Ex3Aula8;

public class Produto{


    private String descricao;
    private double valor;
    private int estoque;

    public Produto(){

    }

    public Produto(String descricao, double valor, int estoque){
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }

    public int getEstoque(){
        return this.estoque;
    }


    public void printValores(){
        System.out.println("Descrição: " + getDescricao() + 
                            "     Valor: " + getValor() + 
                            "     Estoque: " + getEstoque());
    }


}