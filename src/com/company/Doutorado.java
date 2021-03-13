package com.company;

import java.util.ArrayList;

public class Doutorado extends Bolseiro{
    private int salario;

    public Doutorado(String nome, String email, int salario) {
        super(nome, email);
        this.salario = salario;
    }

    @Override
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
