package com.company;

import java.io.Serializable;
import java.util.ArrayList;
/** Esta classe serve para armazenar os dados existentes no projeto. Vamos utilizar um objeto desta classe para guardar num ficheiro objeto.**/
public class Objeto implements Serializable {
    private ArrayList<Projeto> listaProjetos;
    private ArrayList<Pessoa> listaPessoas;

    public Objeto(ArrayList<Projeto> listaProjetos, ArrayList<Pessoa> listaPessoas) {
        this.listaProjetos = listaProjetos;
        this.listaPessoas = listaPessoas;
    }

    public ArrayList<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaProjetos(ArrayList<Projeto> listaProjetos) {
        this.listaProjetos = listaProjetos;
    }

    public void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
}