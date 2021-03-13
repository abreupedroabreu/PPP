package com.company;

import java.util.ArrayList;
/** Esta classe vai herdar os atributos e metodos da Classe Pessoas. Sendo um bolseiro vai estar associado a um projeto e ter uma data de inicio e fim de bolsa **/
public class Bolseiro extends Pessoa{
    private Data dataInicioBolsa;
    private Data dataFimBolsa;
    private Tarefas tarefa;
    private Projeto projeto;


    public Bolseiro(String nome, String email) {
        super(nome, email);
        this.projeto = null;
    }
    @Override
    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    @Override
    public void setDataInicioBolsa(int dia,int mes,int ano) {
        this.dataInicioBolsa = new Data(dia,mes,ano);
    }
    @Override
    public void setDataFimBolsa(int dia,int mes,int ano) {
        this.dataFimBolsa =new Data(dia,mes,ano);
    }

    public void setTarefa(Tarefas tarefa) {
        this.tarefa = tarefa;
    }




    public Data getDataInicioBolsa() {
        return dataInicioBolsa;
    }

    public Data getDataFimBolsa() {
        return dataFimBolsa;
    }

    public Tarefas getTarefa() {
        return tarefa;
    }

}
