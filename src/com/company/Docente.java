package com.company;


import java.util.ArrayList;

/** Esta classe vai herdar os atributos e metodos da Classe Pessoa, sendo diferente da classe Bolseiro pois pode estar associado a mais que um projeto **/

public class Docente extends Pessoa{
    private String area;
    private int num_mec;
    private ArrayList<Tarefas> ListaTarefaDocente;


    public Docente(String nome, String email, String area, int num_mec) {
        super(nome, email);
        this.area = area;
        this.num_mec = num_mec;
        this.ListaTarefaDocente = null;
    }


    public void setArea(String area) {
        this.area = area;
    }

    public void setNum_mec(int num_mec) {
        this.num_mec = num_mec;
    }

    public void setListaTarefaDocente(ArrayList<Tarefas> listaTarefaDocente) {
        ListaTarefaDocente = listaTarefaDocente;
    }

    public String getArea() {
        return area;
    }

    public int getNum_mec() {
        return num_mec;
    }

    public ArrayList<Tarefas> getListaTarefaDocente() {
        return ListaTarefaDocente;
    }
}
