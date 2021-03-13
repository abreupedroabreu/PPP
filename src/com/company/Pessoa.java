package com.company;


import java.util.ArrayList;
import java.io.Serializable;

/** Esta classe pessoa vai armazenar os dados relativamente a uma pessoa e a lista de tarefas pelas quais esta responsavel **/

public class Pessoa implements Serializable {
    private String nome;
    private String email;
    private ArrayList<Tarefas> listaTarefas;
    private double carga;
    private Data DataInicioBolsa;
    private Data DataFimBolsa;
    private int salario;
    private Projeto projeto;


    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.listaTarefas = new ArrayList<>();
        this.carga=0;
        this.DataInicioBolsa = null;
        this.DataFimBolsa = null;
        this.projeto = null;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }


    public void setDataInicioBolsaEst(Data dataInicioBolsa) {
        DataInicioBolsa = dataInicioBolsa;
    }

    public void setDataFimBolsaEst(Data dataFimBolsa) {
        DataFimBolsa = dataFimBolsa;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setDataInicioBolsa(int dia,int mes,int ano) {
        this.DataInicioBolsa = new Data(dia,mes,ano);
    }

    public void setDataFimBolsa(int dia,int mes,int ano) {
        this.DataFimBolsa =new Data(dia,mes,ano);
    }

    public Data getDataInicioBolsa() {
        return DataInicioBolsa;
    }

    public Data getDataFimBolsa() {
        return DataFimBolsa;
    }

    public double getCarga() {
        return carga;
    }

    public void IncrementaCarga(double incremento){
        this.carga=this.carga + incremento;
    }
    public void DecrementaCarga(double decremento){
        this.carga=this.carga - decremento;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Tarefas> getListaTarefas() {
        return listaTarefas;
    }


}



