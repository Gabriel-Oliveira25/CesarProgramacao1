package atividade02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Pessoa> listaPessoas = new ArrayList();

        Pessoa albert = new Pessoa("Albert");
        albert.setUniversidade(new Universidade("Universidade Uva"));

        Pessoa p2 = new Pessoa("Lara");
        p2.setUniversidade(new Universidade("Cesar School"));


        Pessoa p3 = new Pessoa("Luiz");
        p3.setUniversidade(new Universidade("Escola de Marketing"));


        listaPessoas.add(albert);
        listaPessoas.add(p2);
        listaPessoas.add(p3);

        for(int c = 0; c<listaPessoas.size();c++){
            System.out.print(c + " - ");
            System.out.print("Nome: " +   listaPessoas.get(c).informarNome());
          
            System.out.println("     Universidade: " + listaPessoas.get(c).getUniversidade().getNome());
        }
    }
}
