package com.company;

import java.io.Serializable;
import java.util.ArrayList;

/** Esta classe vai conter as informacoes relativamente a uma tarefa. Vai armazenar o seu Responsavel **/

public class Tarefas implements Serializable {
    private String nome;
    private int duracao;
    private double taxaExecucao;
    private double esforco;
    private Data DataInicioTarefa;
    private Data DataFimTarefa;
    private Data DataFimTarefaUser;
    private Pessoa responsavel;

    public double getEsforco() {
        return esforco;
    }

    public Tarefas(String nome, int duracao, double taxaExecucao, int dia1, int mes1, int ano1, int dia2, int mes2, int ano2) {
        this.nome = nome;
        this.duracao = duracao;
        this.taxaExecucao = taxaExecucao;
        this.DataInicioTarefa = new Data(dia1,mes1,ano1);
        this.DataFimTarefa = new Data(dia2,mes2,ano2);
        this.DataFimTarefaUser = new Data(-1,-1,-1);
        this.responsavel = null;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public void setDataInicioTarefa(int dia, int mes, int ano) {
        this.DataInicioTarefa.setDia(dia);
        this.DataInicioTarefa.setMes(mes);
        this.DataInicioTarefa.setAno(ano);
    }

    public Data getDataInicioTarefa() {
        return DataInicioTarefa;
    }

    public void setDataFimTarefa(int dia, int mes, int ano) {
        this.DataFimTarefa.setDia(dia);
        this.DataFimTarefa.setMes(mes);
        this.DataFimTarefa.setAno(ano);
    }

    public void setDataFimTarefaUser(int dia, int mes, int ano) {
        this.DataFimTarefaUser.setDia(dia);
        this.DataFimTarefaUser.setMes(mes);
        this.DataFimTarefaUser.setAno(ano);
    }


    public Data getDataFimTarefaUser() {
        return DataFimTarefaUser;
    }

    public Data getDataFimTarefa() {
        return DataFimTarefa;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public double getTaxaExecucao() {
        return taxaExecucao;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTaxaExecucao(double taxaExecucao) {
        this.taxaExecucao = taxaExecucao;
    }

}


