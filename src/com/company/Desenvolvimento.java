package com.company;

import java.util.ArrayList;

/** Esta classe vai herdar os atributos e metodos da Classe Tarefas **/
public class Desenvolvimento extends Tarefas{
    private double esforco;

    public Desenvolvimento(String nome, int duracao, double taxaExecucao, int dia1, int mes1, int ano1, int dia2, int mes2, int ano2, double esforco) {
        super(nome, duracao, taxaExecucao, dia1, mes1, ano1, dia2, mes2, ano2);
        this.esforco = esforco;
    }


    public double getEsforco() {
        return esforco;
    }
}
