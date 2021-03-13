package com.company;

import java.util.ArrayList;


public class Licenciado extends Bolseiro{
    private int salario;
    private ArrayList<Pessoa> listaPessoa;

    public Licenciado(String nome, String email, int salario) {
        super(nome, email);
        this.salario = salario;
        this.listaPessoa = null;
    }

    public void EscolherOrientador(Pessoa pess){
        for(int i=0;i<listaPessoa.size();i++){
            listaPessoa.add(pess);
        }
    }

    public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
        this.listaPessoa = listaPessoa;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public void setSalario(int salario) {
        this.salario = salario;
    }


    public ArrayList<Pessoa> getListaPessoa() {
        return listaPessoa;
    }
}
