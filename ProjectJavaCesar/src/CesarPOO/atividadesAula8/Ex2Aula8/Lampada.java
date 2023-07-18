package atividade.Ex2Aula8;

public class Lampada {
    private boolean status;
    private int watts;

    public Lampada(boolean status){
        this.status = status;
    }

    public Lampada(boolean status, int watts){
        this.status = status;
        this.watts = watts;     
    }

    public Lampada(){
        this.status = false;
        this.watts = 60;
    }
    
}
