package com.company;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;

/** Esta classe vai conter todas as informacoes relativamente a um projeto. Com as listas das tarefas existentes, uma lista de pessoas associadas e o seu custo **/
public class Projeto implements Serializable {
    private String acronimo;
    private String nome;
    private int duracaoEstimada;
    private int custo;
    private Data DataInicioProjeto;
    private Data DataFimProjeto;
    private Data DataFimProjetoUser;
    private Pessoa investigadorPrincipal;
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Tarefas> listaTarefas = new ArrayList<>();
    private String pessoas;
    private int concluido;
/*
    public Projeto( String nome, String acronimo, int duracaoEstimada, int concluido) {
        this.acronimo = acronimo;
        this.nome = nome;
        this.duracaoEstimada = duracaoEstimada;
        this.investigadorPrincipal = null;
        this.listaPessoas = null;
        this.listaTarefas = null;
        this.concluido = concluido;
        this.DataInicioProjeto.setDia(diaI);
        this.DataInicioProjeto.setMes(mesI);
        this.DataInicioProjeto.setAno(anoI);
        this.DataFimProjeto.setDia(diaF);
        this.DataFimProjeto.setMes(mesF);
        this.DataFimProjeto.setAno(anoF);
    }
*/
    public int getCusto(){
        return custo;
    }

    public void setDataInicioProjeto(Data dataInicioProjeto) {
        DataInicioProjeto = dataInicioProjeto;
    }

    public String getPessoas() {
        return pessoas;
    }

    public void setPessoas(String pessoas) {
        this.pessoas = pessoas;
    }

    public void IncrementaCusto(){
        int custo=0;
        if(listaPessoas.size()>0){
            for(int i=0; i<listaPessoas.size() ; i++){
                if(listaPessoas.get(i) instanceof Bolseiro  ){
                    custo = custo + listaPessoas.get(i).getSalario();
                }
            }
        }
        this.custo = custo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

    public Data getDataFimProjetoUser() {
        return DataFimProjetoUser;
    }

    public void setDataInicio(int dia, int mes, int ano){
        this.DataInicioProjeto = new Data(dia,mes,ano);
    }
    public void setDataFim(int dia, int mes, int ano){
        this.DataFimProjeto = new Data(dia,mes,ano);
    }
    public void setDataFimProjetoUser(int dia, int mes, int ano){
        this.DataFimProjetoUser = new Data(dia,mes,ano);
    }

    public void setInvestigadorPrincipal(Pessoa investigadorPrincipal) {
        this.investigadorPrincipal = investigadorPrincipal;
    }


    public void setConcluido(int concluido) {
        this.concluido = concluido;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public String getNome() {
        return nome;
    }


    public Data getDataInicioProjeto() {
        return DataInicioProjeto;
    }

    public Data getDataFimProjeto() {
        return DataFimProjeto;
    }

    public Pessoa getInvestigadorPrincipal() {
        return investigadorPrincipal;
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public ArrayList<Tarefas> getListaTarefas() {
        return listaTarefas;
    }

    public int getConcluido() {
        return concluido;
    }
}
