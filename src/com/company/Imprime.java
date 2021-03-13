package com.company;

import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** Este classe vai herdar os atributos e metodos da classe JDialog de forma a podermos criar uma janela rapida para imprimir conjuntos de dados **/

public class Imprime extends JDialog {
    private JLabel titulo = new JLabel();
    private JLabel text1 = new JLabel();
    private JPanel painel = new JPanel();

    public Imprime(JFrame frame, String imprimir, String titulo, String txt3, int w, int h, int size) {
        super(frame, txt3, true);
        this.titulo.setText(titulo);
        this.text1.setText(imprimir);
        this.text1.setFont(new Font("Tahoma", 0, size));
        this.painel.setLayout((LayoutManager)null);
        this.painel.add(this.text1);
        this.painel.add(this.titulo);
        this.titulo.setBounds(30, 10, 150, 20);
        this.text1.setBounds(30, 30, w, h);
        this.add(this.painel);
    }
}