package CesarPOO.atividade02;

public class Pessoa {
    int idade;
    int diaDeNascimento;
    int mesDeNascimento;
    int anoDeNascimento;
    String nome;
    private Universidade universidade;


    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public Pessoa(){
    }

    public Pessoa(String nome){
        this.nome = nome;
    }


    void calcularIdade(){
        if (anoDeNascimento >= 2023){
            anoDeNascimento = 2022; 
        } 
        idade = 2023 - anoDeNascimento;
    }

    int informarIdade(){
        return idade;
    }

    String informarNome(){
        return nome;
    }

    void ajustaDataDeNascimento(int diaDeNascimento, int mesDeNascimento, int anoDeNascimento){
        this.diaDeNascimento = diaDeNascimento;
        this.mesDeNascimento = mesDeNascimento;
        this.anoDeNascimento = anoDeNascimento;
    }
}
