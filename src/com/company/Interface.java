package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.io.*;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/** Classe que vai compor a Interface do programa.
 * Vamos herdar os metodos e atributos do JFrame para compor a Interface
 * **/

public class Interface extends JFrame {

    //botoes
    private JButton jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;
    private JButton jButton1B1, jButton3B1;


    //Ecra 2 botao 2
    private JFrame frame1B5_2;
    private JPanel panel1B5_2;
    private JButton jButton1B5_2;
    private JComboBox<String> jCombo1B5_2;
    private JLabel jLabel1B5_2, jLabel2B5_2, jLabel3B5_2, jLabel4B5_2, jLabel5B5_2;
    private JTextField jTextField1B5_2, jTextField2B5_2, jTextField3B5_2, jTextField4B5_2;
    // Ecra 2 botao 3

    private JFrame frame1B5_3;
    private JPanel panel1B5_3;
    private JButton jButton1B5_3;
    private JComboBox<String> jCombo1B5_3;
    private JLabel jLabel1B5_3;

    // Ecra 2 botao 4

    private JFrame frame1C;
    private JPanel panel1C;
    private JButton jButton1C;
    private JComboBox<String> jCombo1C, jComboBox2C;
    private JLabel jLabel1C, jLabel2C;

    //ecra 2 botao5

    private JFrame frame1B5_4;
    private JPanel panel1B5_4;
    private JButton jButton1B5_4;
    private JComboBox<String> jCombo1B5_4;
    private JLabel jLabel1B5_4;

    // ecra 2 botao6
    private JFrame frame1B5_5;
    private JPanel panel1B5_5;
    private JButton jButton1B5_5;
    private JComboBox<String> jCombo1B5_5;
    private JLabel jLabel1B5_5, jLabel2B5_5;
    private JTextField jTextField1B5_5;

    //ecra 2 botao 7
    private JFrame frame1B5_6;

    //ecra pedro
    private JFrame jframe1B5_10;
    private JFrame frame1B5_15;
    private JFrame frame1B5_1;

    //private JTextField jTextField9;
    private JButton jButton5B5_1_1;
    private JButton jButton5B5_1_2;
    private JLabel jLabel5B5_3;

    private JLabel jLabel5B5_9 = new JLabel("ID DA PESSOA");
    private JFrame frame1B5_11 = new JFrame();
    private JPanel panel9 = new JPanel();
    private JTextField jTextField20;
    private JTextField jTextField20_10;
    private JFrame frame1B5_16;
    private JButton jButton5B5_1_3;

    //BUTAO 5-EDITAR PROJETOS
    private JPanel jPanel1B5;
    private JFrame jframe1B5;
    private JButton jButton1B5, jButton2B5, jButton3B5, jButton4B5, jButton5B5, jButton6B5, jButton7B5, jButton8B5, jButton9B5, jButton10B5, jButton11B5, jButtonC;


    private JLabel jLabel1, jLabel2; // as labels
    private JTextField jTextField2; // texto
    private JPanel jPanel1; // painel

    private JFrame frameB1_1;
    // BUTTON 1 - NO CASO DE CRIAR PROJETOS
    private JFrame frameB1, frameB2, frameB3, frameB4;
    private JLabel jLabel1B1, jLabel2B1, jLabel4B1, jLabel5B1, jLabel6B1;
    private JTextField jTextField1B1, jTextField2B1, jTextField3B1, jTextField4B1, jTextField5B1, jTextField6B1;
    private JPanel painelB1;

    private JComboBox<String> jCombo5B5_1_1;
    private JButton jButton5B5_1_4;

    // Dados
    private Objeto objeto_aux = LeFicheiroObjeto();
    private ArrayList<Projeto> listaProjetos = Interface.this.objeto_aux.getListaProjetos();
    private ArrayList<Pessoa> listaPessoas = Interface.this.objeto_aux.getListaPessoas();
    private int index;

    private static Scanner sc = new Scanner(System.in);

    /** CONSTRUTOR da Interface
     * E a partir daqui que vamos construir a Interface toda **/

    public Interface() {
        Interface.this.index = -999;

        this.jButton0 = new JButton();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();

        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();

        this.jTextField2 = new JTextField("");
        this.jPanel1 = new JPanel();

        this.jLabel1.setText("MENU PRINCIPAL");
        this.jLabel2.setText("ID do Projeto:");

        // BOTOES PARA AS OPÇOES NO MENU PRINCIPAL
        this.jButton0.setText("APOIO: Lista Projetos");
        this.jButton1.setText("Criar Projeto");
        this.jButton2.setText("Listar Projetos nao Concluidos na data esperada ou a Decorrer");
        this.jButton3.setText("Listar Projetos Concluidos");
        this.jButton4.setText("Consultar Projeto");
        this.jButton5.setText("Editar Projeto");
        this.jButton6.setText("Enter");


        this.jPanel1.setLayout(null);
        // ADICIONA-LOS AO PAINEL
        this.jPanel1.add(jButton0);
        this.jPanel1.add(jButton1);
        this.jPanel1.add(jButton2);
        this.jPanel1.add(jButton3);
        this.jPanel1.add(jButton4);
        this.jPanel1.add(jButton5);
        this.jPanel1.add(jButton6);

        this.jPanel1.add(jLabel1);
        this.jPanel1.add(jLabel2);
        this.jPanel1.add(jTextField2);

        // FALTA AQUI A MERDA DOS SETBOUNDS PARA OS POR NO SITIO CERTO
        this.jButton0.addActionListener(new ButtonListener_0());
        this.jButton1.addActionListener(new ButtonListener_1());
        this.jButton2.addActionListener(new ButtonListener_2());
        this.jButton3.addActionListener(new ButtonListener_3());
        this.jButton4.addActionListener(new ButtonListener_4());
        this.jButton5.addActionListener(new ButtonListener_5());
        this.jButton6.addActionListener(new ButtonListener_6());
        this.jLabel1.setBounds(445, 50, 100, 25);
        this.jLabel2.setBounds(750, 12, 100, 25);
        this.jTextField2.setBounds(835, 12, 50, 25);
        this.jButton0.setBounds(550, 12, 170, 25);
        this.jButton1.setBounds(15, 85, 950, 25);
        this.jButton2.setBounds(15, 120, 950, 25);
        this.jButton3.setBounds(15, 155, 950, 25);
        this.jButton4.setBounds(15, 190, 950, 25);
        this.jButton5.setBounds(15, 225, 950, 25);
        this.jButton6.setBounds(900, 12, 65, 25);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog((Component) null, "Deseja terminar o programa?", "Terminar Programa?", 0, 3) == 0) {

                    //Para guardar no ficheiro objeto antes de terminar
                    CriaFicheiroObjeto(Interface.this.listaProjetos, Interface.this.listaPessoas);
                    System.exit(0);
                }
            }
        });
        this.add(jPanel1);

    }
    /** Lista de projetos  de apoio para poder introduzir o indice correspondente e poder vizualizar ou edita-lo **/

    public class ButtonListener_0 implements ActionListener {
        public ButtonListener_0() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.listaProjetos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nao existem Projetos Criados!", "Erro", 0);
            } else {
                Interface.this.frameB2 = new JFrame();
                Imprime novaJanela = new Imprime(Interface.this.frameB2, PrintProjetos(Interface.this.listaProjetos), "Projetos que pode editar ou consultar:", "Lista", 400, 700, 20);
                novaJanela.setSize(500, 700);
                novaJanela.setLocation(750, 450);
                novaJanela.setVisible(true);
            }
        }
    }
    /** Interface para criar um projeto **/
    public class ButtonListener_1 implements ActionListener {

        public ButtonListener_1() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Interface.this.frameB1 = new JFrame();
            Interface.this.painelB1 = new JPanel();

            Interface.this.jButton1B1 = new JButton("Adicionar Projeto");
            //Interface.this.jButton2B1= new JButton("Adicionar");
            Interface.this.jButton3B1 = new JButton("APOIO: Lista Pessoas");

            Interface.this.jLabel1B1 = new JLabel();
            Interface.this.jLabel2B1 = new JLabel();
            //Interface.this.jLabel3B1 = new JLabel();
            Interface.this.jLabel4B1 = new JLabel();
            Interface.this.jLabel5B1 = new JLabel();
            Interface.this.jLabel6B1 = new JLabel();

            Interface.this.jTextField1B1 = new JTextField(10);
            Interface.this.jTextField2B1 = new JTextField(10);
            Interface.this.jTextField3B1 = new JTextField(10);
            Interface.this.jTextField4B1 = new JTextField(10);
            Interface.this.jTextField5B1 = new JTextField(10);
            Interface.this.jTextField6B1 = new JTextField(10);


            Interface.this.jLabel1B1.setText("Nome:");
            Interface.this.jLabel2B1.setText("Acronimo:");

            Interface.this.jLabel4B1.setText("Data inicio do Projeto (DD/MM/AA):");
            Interface.this.jLabel5B1.setText("Data fim do Projeto (DD/MM/AA):");
            Interface.this.jLabel6B1.setText("ID da pessoa a associar:");

            Interface.this.painelB1.setLayout(null);

            Interface.this.jLabel1B1.setBounds(25, 20, 300, 25);
            Interface.this.jLabel2B1.setBounds(25, 60, 300, 25);

            Interface.this.jLabel4B1.setBounds(25, 100, 300, 25);
            Interface.this.jLabel5B1.setBounds(25, 140, 300, 25);
            Interface.this.jLabel6B1.setBounds(25, 180, 300, 25);

            Interface.this.jTextField1B1.setBounds(300, 20, 100, 25);
            Interface.this.jTextField2B1.setBounds(300, 60, 100, 25);

            Interface.this.jTextField4B1.setBounds(300, 100, 100, 25);
            Interface.this.jTextField5B1.setBounds(300, 140, 100, 25);
            Interface.this.jTextField6B1.setBounds(300, 180, 50, 25);

            Interface.this.painelB1.add(jLabel1B1);
            Interface.this.painelB1.add(jTextField1B1);
            Interface.this.painelB1.add(jLabel2B1);
            Interface.this.painelB1.add(jTextField2B1);

            Interface.this.painelB1.add(jLabel4B1);
            Interface.this.painelB1.add(jTextField4B1);
            Interface.this.painelB1.add(jLabel5B1);
            Interface.this.painelB1.add(jTextField5B1);
            Interface.this.painelB1.add(jLabel6B1);
            Interface.this.painelB1.add(jTextField6B1);

            Interface.this.jButton1B1.setBounds(25, 240, 150, 20);  // Botao para adicionar projeto a lista

            Interface.this.jButton3B1.setBounds(200, 240, 200, 20);

            Interface.this.painelB1.add(Interface.this.jButton1B1);

            Interface.this.painelB1.add(Interface.this.jButton3B1);
            Interface.this.frameB1.setSize(500, 500);
            Interface.this.frameB1.setLocation(500, 300);
            Interface.this.jButton1B1.addActionListener(Interface.this.new ButtonListener_1_B());
            Interface.this.jButton3B1.addActionListener(Interface.this.new ButtonListener_2_B());
            Interface.this.frameB1.add(Interface.this.painelB1);
            Interface.this.frameB1.setVisible(true);



        }

    }
    /**
     * Corresponde ao botao "Adicionar Projeto"
     **/
    public class ButtonListener_1_B implements ActionListener {
        /**
         * Vai verificar os campos existentes para adicionar o projeto a lista
         **/
        public ButtonListener_1_B() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (Interface.this.jTextField1B1.getText() != "" && Interface.this.jTextField2B1.getText() != "" && Interface.this.jTextField4B1.getText() != "" && Interface.this.jTextField5B1.getText() != "" && Interface.this.jTextField6B1.getText() != "") {
                    Projeto projeto = new Projeto();
                    String[] num = Interface.this.jTextField4B1.getText().split("/");
                    String[] esp = Interface.this.jTextField5B1.getText().split("/");
                    int vef = 1;
                    if (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) != 1) {
                        JOptionPane.showMessageDialog(null, "Introduziu uma data de inicio invalida!", "Erro", 0);
                        vef = 0;

                    }
                    if (VerificaSeDataEValida(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2])) != 1) {
                        JOptionPane.showMessageDialog(null, "Introduziu uma data de fim invalida!", "Erro", 0);
                        vef = 0;
                    }
                    if (vef == 1) {
                        Data d1 = new Data(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                        Data d2 = new Data(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]));
                        if (ComparaDatas(d1, d2) > 0) {
                            JOptionPane.showMessageDialog(null, "Introduziu uma data inicial superior a data final!", "Erro", 0);
                        } else {
                            projeto.setNome(Interface.this.jTextField1B1.getText());
                            projeto.setAcronimo(Interface.this.jTextField2B1.getText());
                            //projeto.setDuracaoEstimada(Integer.parseInt(Interface.this.jTextField3B1.getText()));
                            projeto.setDataInicio(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                            projeto.setDataFim(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]));
                            if(Integer.parseInt(Interface.this.jTextField6B1.getText()) <= TotalDocentes(Interface.this.listaPessoas)){
                                int index_aux = IndiceDocente(Interface.this.listaPessoas, Integer.parseInt(Interface.this.jTextField6B1.getText()));
                                projeto.setInvestigadorPrincipal(Interface.this.listaPessoas.get(index_aux));
                                projeto.getListaPessoas().add(Interface.this.listaPessoas.get(index_aux));
                                Interface.this.listaProjetos.add(projeto);
                                Interface.this.jTextField1B1.setText("");
                                Interface.this.jTextField2B1.setText("");
                                Interface.this.jTextField3B1.setText("");
                                Interface.this.jTextField4B1.setText("");
                                Interface.this.jTextField5B1.setText("");
                                Interface.this.jTextField6B1.setText("");
                                JOptionPane.showMessageDialog(null, "PROJETO ADICIONADO COM SUCESSO", "Erro", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else{
                                Interface.this.jTextField6B1.setText("");
                                JOptionPane.showMessageDialog(null, "Introduza um ID valido!", "Erro", 0);
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tem que preencher todos os campos!", "Erro", 0);
                }
            } catch (NumberFormatException var12) {
                if (Interface.this.jTextField1B1.getText() == "" || Interface.this.jTextField2B1.getText() == "" || Interface.this.jTextField4B1.getText() == "" || Interface.this.jTextField5B1.getText() == "" || Interface.this.jTextField6B1.getText() == "") {
                    JOptionPane.showMessageDialog(null, "Tem que preencher todos os campos!", "Erro", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Introduziu letras num campo em que tinha de introduzir numeros!", "Erro", 0);
                }
            }
            catch (ArrayIndexOutOfBoundsException var13){
                JOptionPane.showMessageDialog(null, "Nao introduziu bem as datas!", "Erro", 0);
            }
        }
    }
        /** Vai mostrar uma lista dos Docentes existentes **/
    public class ButtonListener_2_B implements ActionListener {
        public ButtonListener_2_B() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Interface.this.frameB1_1 = new JFrame();
            Imprime novaJanela = new Imprime(Interface.this.frameB1_1, PrintDocentes(Interface.this.listaPessoas), "Lista de Docentes:", "Lista", 400, 500, 20);
            novaJanela.setSize(500, 500);
            novaJanela.setLocation(650, 450);
            novaJanela.setVisible(true);
        }
    }
    /** Vai imprimir os projetos que estao inconcluidos e que nao terminaram na data estimada **/
    public class ButtonListener_2 implements ActionListener {
        public ButtonListener_2() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.listaProjetos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nao existem Projetos Criados!", "Erro", 0);
            } else if ("<html></html>".equals(PrintProjetosPorTerminar(Interface.this.listaProjetos))) {
                JOptionPane.showMessageDialog(null, "Nao existem Projetos nao Concluidos!", "Erro", 0);
            } else {
                Interface.this.frameB2 = new JFrame();
                Imprime novaJanela = new Imprime(Interface.this.frameB2, PrintProjetosPorTerminar(Interface.this.listaProjetos), "Projetos nao concluidos ou a decorrer", "Lista", 300, 700, 15);
                novaJanela.setSize(400, 800);
                novaJanela.setLocation(750, 250);
                novaJanela.setVisible(true);
            }
        }
    }
    /** Vai imprimir os projetos que estao concluidos **/
    public class ButtonListener_3 implements ActionListener {
        public ButtonListener_3() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.listaProjetos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nao existem Projetos Criados!", "Erro", 0);
            } else if ("<html></html>".equals(PrintProjetosConcluidos(Interface.this.listaProjetos))) {
                JOptionPane.showMessageDialog(null, "Nao existem Projetos Concluidos!", "Erro", 0);
            } else {
                Interface.this.frameB3 = new JFrame();
                Imprime novaJanela = new Imprime(Interface.this.frameB3, PrintProjetosConcluidos(Interface.this.listaProjetos), "Projetos Concluidos", "Lista", 300, 500, 20);
                novaJanela.setSize(500, 400);
                novaJanela.setLocation(750, 250);
                novaJanela.setVisible(true);

            }
        }
    }
    /** Vai imprimir as informacoes todas sobre o projeto **/
    public class ButtonListener_4 implements ActionListener {
        public ButtonListener_4() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (Interface.this.index != -999) {
                Interface.this.frameB4 = new JFrame();
                Imprime novaJanela = new Imprime(Interface.this.frameB4, PrintInformacoesProjeto(Interface.this.listaProjetos, Interface.this.index), "Consulta:", Interface.this.listaProjetos.get(index).getNome(), 800, 1000, 15);
                novaJanela.setSize(900, 1000);
                novaJanela.setLocation(750, 100);
                novaJanela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Introduza um ID valido!", "Erro", 0);
            }
        }
    }

    /** Vai criar a Interface do Segundo menu
     * Aqui e onde vamos poder editar um Projeto por concluir. Adicionar, remover pessoas
     * Adicionar, remover tarefas. E atribuir tarefas.
     */
    public class ButtonListener_5 implements ActionListener {


        public ButtonListener_5() {


        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.index != -999 && Interface.this.listaProjetos.get(index).getConcluido() == 0) {
                Interface.this.jPanel1B5 = new JPanel();
                Interface.this.jframe1B5 = new JFrame();

                Interface.this.jButton1B5 = new JButton("Listar Tarefas");
                Interface.this.jButton2B5 = new JButton("Criar Tarefas");
                Interface.this.jButton3B5 = new JButton("Eliminar Tarefas");
                Interface.this.jButtonC = new JButton("Atribuir tarefa a uma pessoa");
                Interface.this.jButton4B5 = new JButton("Remover pessoa de uma tarefa");
                Interface.this.jButton5B5 = new JButton("Atualizar a taxa de execucao");
                Interface.this.jButton6B5 = new JButton("Listar as tarefas não iniciadas");
                Interface.this.jButton7B5 = new JButton("Listar as tarefas não concluídas na data estimada");
                Interface.this.jButton8B5 = new JButton("Listar as tarefas concluídas");
                Interface.this.jButton9B5 = new JButton("Custo do Projeto");
                Interface.this.jButton10B5 = new JButton("Associar Pessoas ao projeto");
                Interface.this.jButton11B5 = new JButton("Terminar Projeto");


                Interface.this.jPanel1B5.add(jButton1B5);
                Interface.this.jPanel1B5.add(jButton2B5);
                Interface.this.jPanel1B5.add(jButton3B5);
                Interface.this.jPanel1B5.add(jButton4B5);
                Interface.this.jPanel1B5.add(jButton5B5);
                Interface.this.jPanel1B5.add(jButton6B5);
                Interface.this.jPanel1B5.add(jButton7B5);
                Interface.this.jPanel1B5.add(jButton8B5);
                Interface.this.jPanel1B5.add(jButton9B5);
                Interface.this.jPanel1B5.add(jButton10B5);
                Interface.this.jPanel1B5.add(jButton11B5);
                Interface.this.jPanel1B5.add(jButtonC);

                Interface.this.jPanel1B5.setLayout(null);

                Interface.this.jButton1B5.setBounds(25, 40, 300, 25);
                Interface.this.jButton2B5.setBounds(25, 75, 300, 25);
                Interface.this.jButton3B5.setBounds(25, 110, 300, 25);
                Interface.this.jButtonC.setBounds(25, 145, 300, 25);
                Interface.this.jButton4B5.setBounds(25, 180, 300, 25);
                Interface.this.jButton5B5.setBounds(25, 215, 300, 25);
                Interface.this.jButton6B5.setBounds(25, 250, 300, 25);
                Interface.this.jButton7B5.setBounds(25, 285, 300, 25);
                Interface.this.jButton8B5.setBounds(25, 320, 300, 25);
                Interface.this.jButton9B5.setBounds(25, 355, 300, 25);
                Interface.this.jButton10B5.setBounds(25, 390, 300, 25);
                Interface.this.jButton11B5.setBounds(25, 425, 300, 25);

                Interface.this.jButton1B5.addActionListener(Interface.this.new ButtonListener_5_1());
                Interface.this.jButton2B5.addActionListener(Interface.this.new ButtonListener_5_2());
                Interface.this.jButton3B5.addActionListener(Interface.this.new ButtonListener_5_3());
                Interface.this.jButton4B5.addActionListener(Interface.this.new ButtonListener_5_4());
                Interface.this.jButton5B5.addActionListener(Interface.this.new ButtonListener_5_5());
                Interface.this.jButton6B5.addActionListener(Interface.this.new ButtonListener_5_6());
                Interface.this.jButton7B5.addActionListener(Interface.this.new ButtonListener_5_7());
                Interface.this.jButton8B5.addActionListener(Interface.this.new ButtonListener_5_8());
                Interface.this.jButton9B5.addActionListener(Interface.this.new ButtonListener_5_9());
                Interface.this.jButton10B5.addActionListener(Interface.this.new ButtonListener_5_11());
                Interface.this.jButton11B5.addActionListener(Interface.this.new ButtonListener_5_10());

                Interface.this.jButtonC.addActionListener(Interface.this.new ButtonListener_5_C());

                Interface.this.jframe1B5.setSize(375, 510);
                Interface.this.jframe1B5.setLocation(700, 100);
                Interface.this.jframe1B5.add(Interface.this.jPanel1B5);
                Interface.this.jframe1B5.setVisible(true);
            } else if (Interface.this.index == -999) {
                JOptionPane.showMessageDialog(null, "Introduza um ID valido!", "Erro", 0);
            } else if (Interface.this.listaProjetos.get(index).getConcluido() == 1) {
                JOptionPane.showMessageDialog(null, "Apenas pode editar um projeto nao concluido! Selecione outro", "Erro", 0);
            }


        }
    }

    public class ButtonListener_6 implements ActionListener {
        public ButtonListener_6() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (Interface.this.listaProjetos.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nao existem Projetos Criados!", "Erro", 0);
                    Interface.this.jTextField2.setText("");
                } else if ("".equals(Interface.this.jTextField2.getText())) {
                    JOptionPane.showMessageDialog(null, "Introduza um ID!", "Erro", 0);
                    Interface.this.jTextField2.setText("");
                } else if (Integer.parseInt(Interface.this.jTextField2.getText()) > Interface.this.listaProjetos.size() || Integer.parseInt(Interface.this.jTextField2.getText()) < 1) {
                    JOptionPane.showMessageDialog(null, "Introduza um ID valido!", "Erro", 0);
                    Interface.this.jTextField2.setText("");
                } else {
                    Interface.this.index = Integer.parseInt(Interface.this.jTextField2.getText()) - 1;
                    JOptionPane.showMessageDialog(null, "ID introduzido com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException s) {
                Interface.this.jTextField2.setText("");
                JOptionPane.showMessageDialog(null, "Introduza um ID em numeros!", "Erro", 0);
            }
        }
    }

    public class ButtonListener_5_1 implements ActionListener { /** Imprime tarefas **/
        public ButtonListener_5_1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!Interface.this.listaProjetos.get(index).getListaTarefas().isEmpty()) {
                Interface.this.frame1B5_1 = new JFrame();
                Imprime novaJanela = new Imprime(Interface.this.frame1B5_1, PrintTarefas(Interface.this.listaProjetos, Interface.this.index), "Tarefas", "Lista", 700, 750, 15);
                novaJanela.setSize(750, 750);
                novaJanela.setLocation(750, 250);
                novaJanela.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Lista de Tarefas vazia! Crie Tarefas!", "Erro", 0);
            }
        }
    }
    /** Isto vai corresponder a interface para criarmos uma tarefa **/
    public class ButtonListener_5_2 implements ActionListener {
        public ButtonListener_5_2() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Interface.this.frame1B5_2 = new JFrame();
            Interface.this.panel1B5_2 = new JPanel();
            Interface.this.jButton1B5_2 = new JButton("Adicionar");   //adiciona
            //Interface.this.jButton2B5_2 = new JButton(); // acho que nao e preciso
            String[] opcoes = {"(vazio)", "Design", "Desenvolvimento", "Documentacao"};
            Interface.this.jCombo1B5_2 = new JComboBox<>(opcoes);

            Interface.this.jLabel1B5_2 = new JLabel();
            Interface.this.jLabel2B5_2 = new JLabel();
            Interface.this.jLabel3B5_2 = new JLabel();
            Interface.this.jLabel4B5_2 = new JLabel();
            Interface.this.jLabel5B5_2 = new JLabel();

            Interface.this.jTextField1B5_2 = new JTextField(10);
            Interface.this.jTextField2B5_2 = new JTextField(10);
            Interface.this.jTextField3B5_2 = new JTextField(10);
            Interface.this.jTextField4B5_2 = new JTextField(10);

            Interface.this.jLabel1B5_2.setText("Nome:");
            Interface.this.jLabel2B5_2.setText("Tipo:");
            Interface.this.jLabel3B5_2.setText("Data Inicio ( DD/MM/AA ):");
            Interface.this.jLabel4B5_2.setText("Data Fim ( DD/MM/AA )");
            Interface.this.jLabel5B5_2.setText("Duracao Estimada:");

            Interface.this.panel1B5_2.setLayout(null);

            Interface.this.jLabel1B5_2.setBounds(25, 20, 150, 25);
            Interface.this.jLabel2B5_2.setBounds(25, 55, 150, 25);
            Interface.this.jLabel3B5_2.setBounds(25, 90, 150, 25);
            Interface.this.jLabel4B5_2.setBounds(25, 125, 150, 25);
            Interface.this.jLabel5B5_2.setBounds(25, 160, 150, 25);

            Interface.this.jTextField1B5_2.setBounds(250, 20, 150, 25);
            Interface.this.jCombo1B5_2.setBounds(250, 55, 150, 25);
            Interface.this.jTextField2B5_2.setBounds(250, 90, 150, 25);
            Interface.this.jTextField3B5_2.setBounds(250, 125, 150, 25);
            Interface.this.jTextField4B5_2.setBounds(250, 160, 150, 25);

            Interface.this.jButton1B5_2.setBounds(25, 200, 150, 25);

            Interface.this.panel1B5_2.add(jButton1B5_2);

            Interface.this.panel1B5_2.add(jCombo1B5_2);

            Interface.this.panel1B5_2.add(jLabel1B5_2);
            Interface.this.panel1B5_2.add(jLabel2B5_2);
            Interface.this.panel1B5_2.add(jLabel3B5_2);
            Interface.this.panel1B5_2.add(jLabel4B5_2);
            Interface.this.panel1B5_2.add(jLabel5B5_2);

            Interface.this.panel1B5_2.add(jTextField1B5_2);
            Interface.this.panel1B5_2.add(jTextField2B5_2);
            Interface.this.panel1B5_2.add(jTextField3B5_2);
            Interface.this.panel1B5_2.add(jTextField4B5_2);

            Interface.this.jButton1B5_2.addActionListener(Interface.this.new ButtonListener_5_2_1());

            Interface.this.frame1B5_2.setSize(500, 500);
            Interface.this.frame1B5_2.setLocation(500, 350);

            Interface.this.frame1B5_2.add(panel1B5_2);
            Interface.this.frame1B5_2.setVisible(true);

        }
    }

    public class ButtonListener_5_2_1 implements ActionListener { /** Botao que vai tentar adicionar uma tarefa ao projeto, se validar todos os campos **/
        public ButtonListener_5_2_1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int vef = 1;
            try {
                if (Interface.this.jTextField1B5_2.getText() != "" && Interface.this.jTextField2B5_2.getText() != "" && Interface.this.jTextField3B5_2.getText() != "" && Interface.this.jTextField4B5_2.getText() != "" && (Interface.this.jCombo1B5_2.getSelectedIndex() > 0)) {

                    String[] num = Interface.this.jTextField2B5_2.getText().split("/");
                    String[] esp = Interface.this.jTextField3B5_2.getText().split("/");
                    if (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) != 1) {
                        JOptionPane.showMessageDialog(null, "Introduziu uma data de inicio invalida!", "Erro", 0);
                        vef = 0;

                    }
                    if (VerificaSeDataEValida(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2])) != 1) {
                        JOptionPane.showMessageDialog(null, "Introduziu uma data de fim invalida!", "Erro", 0);
                        vef = 0;
                    }
                    if (Integer.parseInt(Interface.this.jTextField4B5_2.getText()) < 1) {
                        JOptionPane.showMessageDialog(null, "Introduziu uma duracao estimada inferior a 1!", "Erro", 0);
                        vef = 0;
                    }
                    if (vef == 1) {
                        Data d1 = new Data(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                        Data d2 = new Data(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]));
                        if (ComparaDatas(d1, d2) > 0) {
                            JOptionPane.showMessageDialog(null, "Introduziu uma data inicial superior a data final!", "Erro", 0);
                            vef = 0;
                        }
                        if(ComparaDatas(d2,listaProjetos.get(index).getDataFimProjeto()) == 1 || ComparaDatas(listaProjetos.get(index).getDataInicioProjeto(),d1)==1){
                            if(ComparaDatas(d2,listaProjetos.get(index).getDataFimProjeto()) == 1) {
                                JOptionPane.showMessageDialog(null, "Introduziu uma data final de tarefa superior a data final de projeto ( " + listaProjetos.get(index).getDataFimProjeto().getDataString() + " )", "Erro", 0);
                            }

                            if(ComparaDatas(listaProjetos.get(index).getDataInicioProjeto(),d1)==1){
                                JOptionPane.showMessageDialog(null, "Introduziu uma data inicial de tarefa inferior a data inicial de projeto ( " + listaProjetos.get(index).getDataInicioProjeto().getDataString() + " )", "Erro", 0);
                            }
                            vef=0;
                        }
                    }
                    if (vef == 1) {
                        if (Interface.this.jCombo1B5_2.getSelectedIndex() == 1) {
                            Design desi = new Design(Interface.this.jTextField1B5_2.getText(), Integer.parseInt(Interface.this.jTextField4B5_2.getText()), 0, Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]), Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]), 0.5);
                            Interface.this.listaProjetos.get(index).getListaTarefas().add(desi);
                        }
                        if (Interface.this.jCombo1B5_2.getSelectedIndex() == 2) {
                            Desenvolvimento des = new Desenvolvimento(Interface.this.jTextField1B5_2.getText(), Integer.parseInt(Interface.this.jTextField4B5_2.getText()), 0, Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]), Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]), 1);
                            Interface.this.listaProjetos.get(index).getListaTarefas().add(des);
                        }
                        if (Interface.this.jCombo1B5_2.getSelectedIndex() == 3) {
                            Documentacao doc = new Documentacao(Interface.this.jTextField1B5_2.getText(), Integer.parseInt(Interface.this.jTextField4B5_2.getText()), 0, Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]), Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]), 0.25);
                            Interface.this.listaProjetos.get(index).getListaTarefas().add(doc);
                        }
                        JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tem que preencher todos os campos!", "Erro", 0);
                }
            } catch (NumberFormatException var12) {
                JOptionPane.showMessageDialog(null, "Introduziu letras num campo em que tinha de introduzir numeros!", "Erro", 0);
            }catch (ArrayIndexOutOfBoundsException var13){
                JOptionPane.showMessageDialog(null, "Nao introduziu bem as datas!", "Erro", 0);
            }
        }
    }

    /** Vai criar a janela para podermos remover uma tarefa **/

    public class ButtonListener_5_3 implements ActionListener {
        public ButtonListener_5_3() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Interface.this.frame1B5_3 = new JFrame();
            Interface.this.panel1B5_3 = new JPanel();
            Interface.this.jButton1B5_3 = new JButton("Eliminar");   //eliminar tarefa
            Interface.this.jCombo1B5_3 = new JComboBox<>();
            Interface.this.jLabel1B5_3 = new JLabel();

            Interface.this.jCombo1B5_3.addItem("(vazio)");

            for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Design) {
                    Interface.this.jCombo1B5_3.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "( DESIGN )");
                }
                if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Desenvolvimento) {
                    Interface.this.jCombo1B5_3.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "( DESENVOLVIMENTO)");
                }
                if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Documentacao) {
                    Interface.this.jCombo1B5_3.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "( DOCUMENTACAO )");
                }
            }

            Interface.this.jLabel1B5_3.setText("Selecione uma tarefa para remover:");

            Interface.this.panel1B5_3.setLayout(null);

            Interface.this.jLabel1B5_3.setBounds(25, 20, 250, 25);
            Interface.this.jCombo1B5_3.setBounds(300, 20, 350, 25);

            Interface.this.jButton1B5_3.setBounds(25, 60, 150, 25);

            Interface.this.panel1B5_3.add(jLabel1B5_3);
            Interface.this.panel1B5_3.add(jCombo1B5_3);
            Interface.this.panel1B5_3.add(jButton1B5_3);

            Interface.this.jButton1B5_3.addActionListener(Interface.this.new ButtonListener_5_3_1());

            Interface.this.frame1B5_3.setSize(700, 300);
            Interface.this.frame1B5_3.setLocation(400, 300);

            Interface.this.frame1B5_3.add(panel1B5_3);
            Interface.this.frame1B5_3.setVisible(true);


        }
    }

    /** Aqui e onde o backend para eliminar a tarefa vai acontecer. Se ja estiver atribuida a alguem, vai diminuir a carga da pessoa **/
    public class ButtonListener_5_3_1 implements ActionListener {
        public ButtonListener_5_3_1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.jCombo1B5_3.getSelectedIndex() > 0) {
                int i_aux = Interface.this.jCombo1B5_3.getSelectedIndex();
                int vef = 1;
                i_aux = i_aux - 1;

                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaPessoas().size(); i++) {
                    for (int j = 0; j < Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getListaTarefas().size(); j++) {
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i_aux) == Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getListaTarefas().get(j)) {
                            if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i_aux) instanceof Design) {
                                Interface.this.listaProjetos.get(index).getListaPessoas().get(i).DecrementaCarga(0.5);
                            }
                            if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i_aux) instanceof Desenvolvimento) {
                                Interface.this.listaProjetos.get(index).getListaPessoas().get(i).DecrementaCarga(1);
                            }
                            if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i_aux) instanceof Documentacao) {
                                Interface.this.listaProjetos.get(index).getListaPessoas().get(i).DecrementaCarga(0.25);
                            }
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getListaTarefas().remove(Interface.this.listaProjetos.get(index).getListaTarefas().get(i_aux)); // Remover tarefa da lista de tarefas da pessoa
                            Interface.this.listaProjetos.get(index).getListaTarefas().remove(Interface.this.listaProjetos.get(index).getListaTarefas().get(i_aux));
                            vef = 0;
                        }
                    }
                }
                if (vef == 1) {
                    Interface.this.listaProjetos.get(index).getListaTarefas().remove(Interface.this.listaProjetos.get(index).getListaTarefas().get(i_aux));

                }
                Interface.this.jCombo1B5_3.removeItemAt(i_aux + 1);
                Interface.this.jCombo1B5_3.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Tarefa eliminada com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Nao selecionou nenhuma tarefa!", "ERRO", 0);
            }
        }
    }
    /** Vai criar a janela para podermos adicionar uma tarefa a uma pessoa **/
    public class ButtonListener_5_C implements ActionListener {
        public ButtonListener_5_C() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.listaProjetos.get(index).getListaTarefas().size() > 0) {
                Interface.this.frame1C = new JFrame();
                Interface.this.panel1C = new JPanel();
                Interface.this.jButton1C = new JButton("Atribuir tarefa");
                Interface.this.jCombo1C = new JComboBox<>();
                Interface.this.jComboBox2C = new JComboBox<>();
                Interface.this.jLabel1C = new JLabel();
                Interface.this.jLabel2C = new JLabel();

                Interface.this.jCombo1C.addItem("(vazio)");
                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() < 100 && Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() == null) {
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Design) {
                            Interface.this.jCombo1C.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESIGN )  Data Fim de Tarefa: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getDataFimTarefa()));
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Desenvolvimento) {
                            Interface.this.jCombo1C.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESENVOLVIMENTO )  Data Fim de Tarefa: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getDataFimTarefa()));
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Documentacao) {
                            Interface.this.jCombo1C.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DOCUMENTACAO )  Data Fim de Tarefa: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getDataFimTarefa()));
                        }
                    }
                }

                Interface.this.jComboBox2C.addItem("(vazio)");
                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaPessoas().size(); i++) {
                    if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Docente) {
                        Interface.this.jComboBox2C.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         DOCENTE");
                    }
                    if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Licenciado) {
                        Interface.this.jComboBox2C.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         LICENCIADO  --> Fim de contrato: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getDataFimBolsa()));
                    }
                    if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Mestre) {
                        Interface.this.jComboBox2C.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         MESTRE  --> Fim de contrato: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getDataFimBolsa()));
                    }
                    if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Doutorado) {
                        Interface.this.jComboBox2C.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         DOUTORADO  --> Fim de contrato: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getDataFimBolsa()));
                    }
                }

                Interface.this.jLabel1C.setText("Selecione uma tarefa:");
                Interface.this.jLabel2C.setText("Selecione a pessoa a quem quer adicionar a tarefa:");

                Interface.this.panel1C.setLayout(null);

                Interface.this.jLabel1C.setBounds(25, 20, 350, 25);
                Interface.this.jCombo1C.setBounds(400, 20, 650, 25);
                Interface.this.jLabel2C.setBounds(25, 65, 350, 25);
                Interface.this.jComboBox2C.setBounds(400, 65, 650, 25);

                Interface.this.jButton1C.setBounds(25, 110, 150, 25);

                Interface.this.panel1C.add(jLabel1C);
                Interface.this.panel1C.add(jCombo1C);
                Interface.this.panel1C.add(jLabel2C);
                Interface.this.panel1C.add(jComboBox2C);
                Interface.this.panel1C.add(jButton1C);

                Interface.this.jButton1C.addActionListener(Interface.this.new ButtonListener_5_C_1());

                Interface.this.frame1C.setSize(1200, 300);
                Interface.this.frame1C.setLocation(450, 350);

                Interface.this.frame1C.add(panel1C);
                Interface.this.frame1C.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nao existem tarefas criadas!", "ERRO", 0);
            }
        }
    }

    public class ButtonListener_5_C_1 implements ActionListener { /** Adiciona pessoa a tarefa, corresponde ao botao adicionar **/
        public ButtonListener_5_C_1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.jComboBox2C.getSelectedIndex() != 0 && Interface.this.jCombo1C.getSelectedIndex() != 0) {
                int iAux1 = Interface.this.jComboBox2C.getSelectedIndex() - 1;    //PESSOA INDEX
                int iAux2 = Interface.this.jCombo1C.getSelectedIndex() - 1;       // TAREFA INDEX
                int t_index = -1, k = 0, vef = 1;

                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() < 100 && Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() == null) {
                        if (k == iAux2) {
                            t_index = i;
                        }
                        k++;
                    }
                }

                if (Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1) instanceof Bolseiro) {
                    System.out.println(ComparaDatas(Interface.this.listaProjetos.get(index).getListaTarefas().get(iAux2).getDataFimTarefa(), Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getDataFimBolsa()));
                    if (ComparaDatas(Interface.this.listaProjetos.get(index).getListaTarefas().get(iAux2).getDataFimTarefa(), Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getDataFimBolsa()) == 1) {
                        JOptionPane.showMessageDialog(null, "A data de fim de tarefa e superior a data de fim de contrato do bolseiro!", "ERRO", 0);
                        vef = 0;
                    }
                }

                if (t_index != -1 && vef == 1) { // Aqui vai verificar o tipo da tarefa, e se pode adiciona-la a pessoa
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index) instanceof Design) {
                        if (Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getCarga() + 0.5 <= 1) {
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getListaTarefas().add(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index));
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).IncrementaCarga(0.5);
                            Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).setResponsavel(Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1));
                        } else {
                            JOptionPane.showMessageDialog(null, "A pessoa a quem tentou adicionar a tarefa esta sobrecarregada!", "ERRO", 0);
                            vef = 0;
                        }
                    }
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index) instanceof Desenvolvimento) {
                        if (Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getCarga() + 1 <= 1) {
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getListaTarefas().add(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index));
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).IncrementaCarga(1);
                            Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).setResponsavel(Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1));
                        } else {
                            JOptionPane.showMessageDialog(null, "A pessoa a quem tentou adicionar a tarefa esta sobrecarregada!", "ERRO", 0);
                            vef = 0;
                        }
                    }
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index) instanceof Documentacao) {
                        if (Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getCarga() + 0.25 <= 1) {
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).getListaTarefas().add(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index));
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1).IncrementaCarga(0.25);
                            Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).setResponsavel(Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux1));
                        } else {
                            JOptionPane.showMessageDialog(null, "A pessoa a quem tentou adicionar com essa tarefa fica sobrecarregada!", "ERRO", 0);
                            vef = 0;
                        }
                    }
                    if (vef == 1) {
                        Interface.this.jCombo1C.removeItemAt(iAux2 + 1);
                        Interface.this.jComboBox2C.setSelectedIndex(0);
                        Interface.this.jCombo1C.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(null, "Tarefa atribuida com sucesso!", "SUCESSO", 1);
                    }
                }


            } else if (Interface.this.jCombo1C.getSelectedIndex() != 0 && Interface.this.jComboBox2C.getItemCount() == 1) {
                JOptionPane.showMessageDialog(null, "Nao tem pessoas associadas ao projeto. Tem de adicionar pessoas!", "ERRO", 0);
            } else {
                JOptionPane.showMessageDialog(null, "Nao preencheu os campos todos!", "ERRO", 0);
            }
        }
    }

    public class ButtonListener_5_4 implements ActionListener {  /** Janela correspondente a eliminacao de uma pessoa da tarefa **/
        public ButtonListener_5_4() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.listaProjetos.get(index).getListaTarefas().size() > 0) {
                Interface.this.frame1B5_4 = new JFrame();
                Interface.this.panel1B5_4 = new JPanel();
                Interface.this.jButton1B5_4 = new JButton("Eliminar Pessoa da tarefa");
                Interface.this.jCombo1B5_4 = new JComboBox<>();
                Interface.this.jLabel1B5_4 = new JLabel();

                Interface.this.jCombo1B5_4.addItem("(vazio)");
                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() < 100 && Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() != null) {
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Design) {
                            Interface.this.jCombo1B5_4.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESIGN )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Desenvolvimento) {
                            Interface.this.jCombo1B5_4.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESENVOLVIMENTO )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Documentacao) {
                            Interface.this.jCombo1B5_4.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DOCUMENTACAO )   Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                        }
                    }
                }
                Interface.this.panel1B5_4.setLayout(null);
                Interface.this.jLabel1B5_4.setText("Selecione uma tarefa para remover o responsavel");

                Interface.this.jLabel1B5_4.setBounds(25, 20, 350, 25);
                Interface.this.jCombo1B5_4.setBounds(400, 20, 750, 25);
                Interface.this.jButton1B5_4.setBounds(25, 60, 100, 25);

                Interface.this.panel1B5_4.add(jLabel1B5_4);
                Interface.this.panel1B5_4.add(jCombo1B5_4);
                Interface.this.panel1B5_4.add(jButton1B5_4);

                Interface.this.frame1B5_4.add(jLabel1B5_4);

                Interface.this.jButton1B5_4.addActionListener(Interface.this.new ButtonListener_5_4_1());

                Interface.this.frame1B5_4.setSize(1300, 300);
                Interface.this.frame1B5_4.setLocation(500, 300);

                Interface.this.frame1B5_4.add(panel1B5_4);
                Interface.this.frame1B5_4.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Nao existem tarefas criadas!", "ERRO", 0);
            }
        }
    }

    public class ButtonListener_5_4_1 implements ActionListener {  /** Vai corresponder ao botao para remover a pessoa da tarefa **/
        public ButtonListener_5_4_1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Interface.this.jCombo1B5_4.getSelectedIndex() != 0) {
                int iAux1 = Interface.this.jCombo1B5_4.getSelectedIndex() - 1;    //Tarefa INDEX
                int t_index = -1, k = 0, vef = 1;

                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() < 100 && Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() != null) {
                        if (k == iAux1) {
                            t_index = i;
                        }
                        k++;
                    }
                }
                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaPessoas().size(); i++) {   // Vai remover a tarefa da pessoa
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getResponsavel() == Interface.this.listaProjetos.get(index).getListaPessoas().get(i) && vef == 1) {
                        Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getListaTarefas().remove(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index));
                        Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).setResponsavel(null);
                        vef = 0;

                        Interface.this.jCombo1B5_4.removeItemAt(iAux1 + 1);
                        Interface.this.jCombo1B5_4.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(null, "Pessoa removida da tarefa com sucesso!", "SUCESSO", 1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nao selecionou nenhuma tarefa!", "ERRO", 0);
            }
        }
    }

    public class ButtonListener_5_5 implements ActionListener {  /** interface Para atualizar a taxa de execucao **/
        public ButtonListener_5_5() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (Interface.this.listaProjetos.get(index).getListaTarefas().size() > 0) {
                Interface.this.frame1B5_5 = new JFrame();
                Interface.this.panel1B5_5 = new JPanel();
                Interface.this.jButton1B5_5 = new JButton("Atualizar taxa");
                Interface.this.jCombo1B5_5 = new JComboBox<>();
                Interface.this.jLabel1B5_5 = new JLabel();
                Interface.this.jLabel2B5_5 = new JLabel();
                Interface.this.jTextField1B5_5 = new JTextField(10);

                Interface.this.jLabel1B5_5.setText("Selecione uma tarefa");
                Interface.this.jLabel2B5_5.setText("Introduza uma nova Taxa (double)");

                Interface.this.jCombo1B5_5.addItem("(vazio)");
                for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() < 100 && Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() != null) {
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Design) {
                            Interface.this.jCombo1B5_5.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESIGN )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Desenvolvimento) {
                            Interface.this.jCombo1B5_5.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESENVOLVIMENTO )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Documentacao) {
                            Interface.this.jCombo1B5_5.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DOCUMENTACAO )   Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                        }
                    }
                }
                Interface.this.panel1B5_5.setLayout(null);

                Interface.this.jLabel1B5_5.setBounds(25, 20, 150, 25);
                Interface.this.jCombo1B5_5.setBounds(200, 20, 750, 25);
                Interface.this.jLabel2B5_5.setBounds(25, 60, 150, 25);
                Interface.this.jTextField1B5_5.setBounds(200, 60, 100, 25);
                Interface.this.jButton1B5_5.setBounds(25, 100, 150, 25);

                Interface.this.panel1B5_5.add(jLabel1B5_5);
                Interface.this.panel1B5_5.add(jLabel2B5_5);
                Interface.this.panel1B5_5.add(jTextField1B5_5);
                Interface.this.panel1B5_5.add(jCombo1B5_5);
                Interface.this.panel1B5_5.add(jButton1B5_5);


                Interface.this.jButton1B5_5.addActionListener(Interface.this.new ButtonListener_5_5_1());

                Interface.this.frame1B5_5.setSize(1100, 300);
                Interface.this.frame1B5_5.setLocation(500, 300);

                Interface.this.frame1B5_5.add(panel1B5_5);
                Interface.this.frame1B5_5.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Nao existem tarefas criadas!", "ERRO", 0);
            }
        }
    }

    public class ButtonListener_5_5_1 implements ActionListener { /** Vai atualizar a taxa de execucao na lista se os valores introduzidos forem validos **/
        public ButtonListener_5_5_1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int vef2 = 0, vef = 1;
            int iAux2 = -1;
            if (Interface.this.jTextField1B5_5.getText() != "" && Interface.this.jCombo1B5_5.getSelectedIndex() > 0) {
                try {
                    double taxa = Double.parseDouble(Interface.this.jTextField1B5_5.getText());
                    int iAux1 = Interface.this.jCombo1B5_5.getSelectedIndex() - 1;    //Tarefa INDEX
                    int t_index = -1, k = 0;

                    for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() < 100 && Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() != null) {
                            if (k == iAux1) {
                                t_index = i;
                            }
                            k++;
                        }
                    }
                    for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaPessoas().size(); i++) {
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getResponsavel() == Interface.this.listaProjetos.get(index).getListaPessoas().get(i)) {
                            iAux2 = i;
                        }
                    }
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getTaxaExecucao() >= taxa) {
                        JOptionPane.showMessageDialog(null, "Introduza uma taxa superior a: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getTaxaExecucao(), "ERRO", 0);
                    } else if (taxa > 100) {
                        JOptionPane.showMessageDialog(null, "Introduza uma taxa inferior a 100%", "ERRO", 0);
                    } else if (taxa < 100 && iAux2 != -1) {
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index) instanceof Design) {
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux2).DecrementaCarga(0.5);
                            Interface.this.jCombo1B5_5.setSelectedItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getTaxaExecucao() + "         ( DESIGN )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getResponsavel().getNome());
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index) instanceof Desenvolvimento) {
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux2).DecrementaCarga(1);
                            Interface.this.jCombo1B5_5.setSelectedItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getTaxaExecucao() + "         ( DESENVOLVIMENTO )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getResponsavel().getNome());
                        }
                        if (Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index) instanceof Documentacao) {
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(iAux2).DecrementaCarga(0.25);
                            Interface.this.jCombo1B5_5.setSelectedItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getTaxaExecucao() + "         ( DOCUMENTACAO )   Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getResponsavel().getNome());
                        }
                        Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).setTaxaExecucao(taxa);
                        Interface.this.jCombo1B5_5.removeAllItems();
                        Interface.this.jCombo1B5_5.addItem("(vazio)");
                        for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaTarefas().size(); i++) {
                            if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() < 100 && Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() != null) {
                                if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Design) {
                                    Interface.this.jCombo1B5_5.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESIGN )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                                }
                                if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Desenvolvimento) {
                                    Interface.this.jCombo1B5_5.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DESENVOLVIMENTO )  Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                                }
                                if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i) instanceof Documentacao) {
                                    Interface.this.jCombo1B5_5.addItem(Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getNome() + "         Taxa: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + "         ( DOCUMENTACAO )   Responsavel: " + Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome());
                                }
                            }
                        }
                        Interface.this.jCombo1B5_5.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(null, "Taxa atualizada com sucesso", "SUCESSO", 1);
                    } else if (taxa == 100) {
                        Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).setTaxaExecucao(taxa);
                        Interface.this.jCombo1B5_5.setSelectedIndex(0);
                        Interface.this.jCombo1B5_5.removeItemAt(+1);
                        vef2 = 1;
                        JOptionPane.showMessageDialog(null, "Tarefa CONCLUIDA com sucesso", "SUCESSO", 1);
                        String value = JOptionPane.showInputDialog(null, "Introduza a data em que foi terminada a tarefa (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                        String[] num = value.split("/");
                        while (vef == 1) {
                            if (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) == 0) {
                                JOptionPane.showMessageDialog(null, "Introduza uma data correta", "ERRO", 0);
                                value = JOptionPane.showInputDialog(null, "Introduza a data em que foi terminada a tarefa (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                                num = value.split("/");
                            } else {
                                System.out.println(Integer.parseInt(num[0]));
                                System.out.println(t_index);
                                System.out.println(Interface.this.listaProjetos.get(index).getListaTarefas().get(0).getNome() );
                                System.out.println(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index-1).getNome() );
                                System.out.println(Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).getNome() );
                                JOptionPane.showMessageDialog(null, "Data de Fim introduzida com sucesso", "SUCESSO", 1);
                                Interface.this.listaProjetos.get(index).getListaTarefas().get(t_index).setDataFimTarefaUser(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                                vef = 0;
                                vef2 = 0;
                            }
                        }

                    }
                } catch (NumberFormatException a) {
                    if (vef2 == 1) {
                        JOptionPane.showMessageDialog(null, "Introduza uma data correta", "ERRO", 0);
                        String value = JOptionPane.showInputDialog(null, "Introduza a data em que foi terminada a tarefa (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                        String[] num = value.split("/");
                        while (vef == 1) {
                            if (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) == 0) {
                                JOptionPane.showMessageDialog(null, "Introduza uma data correta", "ERRO", 0);
                                value = JOptionPane.showInputDialog(null, "Introduza a data em que foi terminada a tarefa (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                                num = value.split("/");
                            } else {
                                JOptionPane.showMessageDialog(null, "Data de Fim introduzida com sucesso", "SUCESSO", 1);
                                vef = 0;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduza um numero correto", "ERRO", 0);
                    }

                }catch (ArrayIndexOutOfBoundsException var13){
                    JOptionPane.showMessageDialog(null, "Nao introduziu bem as datas!", "Erro", 0);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nao preencheu os campos todos!", "ERRO", 0);
            }
        }
    }


    public class ButtonListener_5_6 implements ActionListener {  /**  Vai dar Print das Tarefas Por Comecar **/
        public ButtonListener_5_6() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("<html></html>".equals(PrintTarefasPorComecar(Interface.this.listaProjetos.get(index).getListaTarefas()))) {
                JOptionPane.showMessageDialog(null, "Nao existem tarefas com taxa de execucao a 0 %!", "ERRO", 0);
            } else {
                Interface.this.frame1B5_6 = new JFrame();
                Imprime novaJanela = new Imprime(Interface.this.frame1B5_6, PrintTarefasPorComecar(Interface.this.listaProjetos.get(index).getListaTarefas()), "Lista de tarefas com taxa de execucao a 0 %:", Interface.this.listaProjetos.get(index).getNome(), 900, 750, 15);
                novaJanela.setSize(900, 800);
                novaJanela.setLocation(750, 250);
                novaJanela.setVisible(true);
            }
        }
    }

    public class ButtonListener_5_7 implements ActionListener { /** LISTA TAREFAS NAO CONCLUIDAS  **/
        public ButtonListener_5_7() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {


            if ("<html></html>".equals(PrintTarefasNaoConcluidas(Interface.this.listaProjetos.get(index).getListaTarefas()))) {
                JOptionPane.showMessageDialog(null, "Todas as tarefas foram concluidas na data estimada !", "ERRO", 0);
            }else {
                Interface.this.frame1B5_16 = new JFrame();

                Imprime novaJanela = new Imprime(Interface.this.frame1B5_16, PrintTarefasNaoConcluidas(Interface.this.listaProjetos.get(index).getListaTarefas()), "Tarefas Não Concluidas", "Lista", 620, 250, 15);

                novaJanela.setSize(600, 750);

                novaJanela.setLocation(750, 250);
                novaJanela.setVisible(true);

            }


        }

    }

    public class ButtonListener_5_8 implements ActionListener { /**LISTAR TAREFAS CONCLUIDAS **/
        public ButtonListener_5_8() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if ("<html></html>".equals(PrintTarefasTerminadas(Interface.this.listaProjetos.get(index).getListaTarefas()))) {
                JOptionPane.showMessageDialog(null, "Ainda nao foi possivel terminar nenhuma tarefa!", "ERRO", 0);
            }

             else {
                Interface.this.frame1B5_15 = new JFrame();

                Imprime novaJanela = new Imprime(Interface.this.frame1B5_15, PrintTarefasTerminadas(Interface.this.listaProjetos.get(index).getListaTarefas()), "Tarefas Concluidas", "Lista", 620, 250, 15);
                novaJanela.setSize(600, 750);
                novaJanela.setLocation(750, 250);
                novaJanela.setVisible(true);

            }


        }

    }

    public class ButtonListener_5_9 implements ActionListener { /** CUSTO DO PROJETO  **/
        public ButtonListener_5_9() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            listaProjetos.get(index).IncrementaCusto();

            JOptionPane.showMessageDialog(null, "Custo Projeto: " + listaProjetos.get(index).getCusto(), "Mensagem", JOptionPane.PLAIN_MESSAGE);

        }
    }

    public class ButtonListener_5_10 implements ActionListener {  /** BOTAO QUE CORRESPONDE A TERMINAR PROJETO **/
        public ButtonListener_5_10() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {


            int option = JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
            // 0 = yes, 1 = no
            int vef = 1;
            try {
                if (option == 0) {
                    listaProjetos.get(index).IncrementaCusto();
                    listaProjetos.get(index).setConcluido(1);
                    JOptionPane.showMessageDialog(null, "Projeto Terminado", "Mensagem", JOptionPane.PLAIN_MESSAGE);

                    for(int i=0;i<listaPessoas.size();i++){
                        int sizeT=listaProjetos.get(index).getListaTarefas().size();



                        for(int k=0 ; k<sizeT;k++){
                            if(listaProjetos.get(index).getListaTarefas().get(k).getResponsavel() == listaPessoas.get(i)){
                                if (listaProjetos.get(index).getListaTarefas().get(k) instanceof Design) {
                                    listaPessoas.get(i).DecrementaCarga(0.5);
                                }
                                if (listaProjetos.get(index).getListaTarefas().get(k) instanceof Desenvolvimento) {
                                    listaPessoas.get(i).DecrementaCarga(1);
                                }
                                if (listaProjetos.get(index).getListaTarefas().get(k) instanceof Documentacao) {
                                    listaPessoas.get(i).DecrementaCarga(0.25);
                                }
                                listaPessoas.get(i).getListaTarefas().remove(listaProjetos.get(index).getListaTarefas().get(k));
                            }
                        }
                    }
                    int sizeP = listaProjetos.get(index).getListaPessoas().size()-1;
                    String res = "<html>";
                    for(int i=sizeP; i>=0;i--){
                        if (listaProjetos.get(index).getListaPessoas().get(i) instanceof Bolseiro){
                            listaProjetos.get(index).getListaPessoas().get(i).setDataFimBolsaEst(null);
                            listaProjetos.get(index).getListaPessoas().get(i).setDataFimBolsaEst(null);
                            listaProjetos.get(index).getListaPessoas().get(i).setProjeto(null);
                        }
                        res = res + listaProjetos.get(index).getListaPessoas().get(i).getNome() + "<br/>";
                        listaProjetos.get(index).getListaPessoas().remove(i);
                    }
                    res = res + "</html>";
                    listaProjetos.get(index).setPessoas(res);

                    String value = JOptionPane.showInputDialog(null, "Introduza a data em que o projeto foi terminado (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                    String[] num = value.split("/");
                    while (vef == 1) {
                        if (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) == 0) {
                            JOptionPane.showMessageDialog(null, "Introduza uma data correta", "ERRO", 0);
                            value = JOptionPane.showInputDialog(null, "Introduza a data em que foi terminado o projeto (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                            num = value.split("/");
                        } else {
                            JOptionPane.showMessageDialog(null, "Data de Fim introduzida com sucesso", "SUCESSO", 1);
                            Interface.this.listaProjetos.get(index).setDataFimProjetoUser(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                            vef = 0;
                        }
                    }
                    jframe1B5.dispatchEvent(new WindowEvent(jframe1B5, WindowEvent.WINDOW_CLOSING));

                }
            }
            catch (NumberFormatException ff){
                String value = JOptionPane.showInputDialog(null, "Introduza a data em que foi terminado o projeto (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                String[] num = value.split("/");
                while (vef == 1) {
                    if (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) == 0) {
                        JOptionPane.showMessageDialog(null, "Introduza uma data correta", "ERRO", 0);
                        value = JOptionPane.showInputDialog(null, "Introduza a data em que foi terminado o projeto (DD/MM/AA)", "Data", JOptionPane.QUESTION_MESSAGE);
                        num = value.split("/");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data de Fim introduzida com sucesso", "SUCESSO", 1);
                        Interface.this.listaProjetos.get(index).setDataFimProjetoUser(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                        vef = 0;
                    }
                }
                jframe1B5.dispatchEvent(new WindowEvent(jframe1B5, WindowEvent.WINDOW_CLOSING));
            }
            catch (ArrayIndexOutOfBoundsException var13){
                JOptionPane.showMessageDialog(null, "Nao introduziu bem as datas!", "Erro", 0);
            }
        }
    }

    /** Aqui vamos criar a Janela para podermos associar e desassociar pessoas do projeto
     * Podemos tambem alterar o Investigador Principal
     */
    public class ButtonListener_5_11 implements ActionListener {  // ASSOCIAR PESSOAS AO PROJETO

        public ButtonListener_5_11() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {


            int var = Interface.this.index;

            Interface.this.jButton5B5_1_1 = new JButton("Adicionar"); // DO TIPO ENTER
            Interface.this.jButton5B5_1_2 = new JButton("APOIO:Lista Pessoas"); // vai msotrar as pessoas
            Interface.this.jButton5B5_1_3 = new JButton("Trocar");
            Interface.this.jLabel5B5_9 = new JLabel("ID da Pessoa");
            Interface.this.jLabel5B5_3 = new JLabel("Trocar Inv. Principal");

            Interface.this.jCombo5B5_1_1 = new JComboBox<>();
            Interface.this.jButton5B5_1_4 = new JButton("Remover Pessoa");

            Interface.this.jCombo5B5_1_1.addItem("( vazio )");
            for (int i = 0; i < Interface.this.listaProjetos.get(index).getListaPessoas().size(); i++) {
                if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Docente) {
                    Interface.this.jCombo5B5_1_1.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         DOCENTE");
                }
                if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Licenciado) {
                    Interface.this.jCombo5B5_1_1.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         LICENCIADO  --> Fim de contrato: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getDataFimBolsa()));
                }
                if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Mestre) {
                    Interface.this.jCombo5B5_1_1.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         MESTRE  --> Fim de contrato: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getDataFimBolsa()));
                }
                if (Interface.this.listaProjetos.get(index).getListaPessoas().get(i) instanceof Doutorado) {
                    Interface.this.jCombo5B5_1_1.addItem(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getNome() + "         DOUTORADO  --> Fim de contrato: " + ConverteDataEmString(Interface.this.listaProjetos.get(index).getListaPessoas().get(i).getDataFimBolsa()));
                }
            }

            Interface.this.frame1B5_11 = new JFrame();
            Interface.this.panel9 = new JPanel();
            Interface.this.jTextField20 = new JTextField(10);
            Interface.this.jTextField20_10 = new JTextField(10);



            Interface.this.panel9.setLayout(null);

            // fazer os adds

            Interface.this.panel9.add(jButton5B5_1_1);
            Interface.this.panel9.add(jButton5B5_1_2);
            Interface.this.panel9.add(jButton5B5_1_3);
            Interface.this.panel9.add(jLabel5B5_9);

            Interface.this.panel9.add(jTextField20);
            Interface.this.panel9.add(jLabel5B5_3);
            Interface.this.panel9.add(jTextField20_10);
            Interface.this.panel9.add(jCombo5B5_1_1);
            Interface.this.panel9.add(jButton5B5_1_4);
            Interface.this.jLabel5B5_9.setBounds(25, 20, 150, 25);
            Interface.this.jLabel5B5_3.setBounds(25, 50, 150, 25);

            Interface.this.jTextField20.setBounds(200, 20, 70, 25);
            Interface.this.jTextField20_10.setBounds(200, 50, 70, 25);

            Interface.this.jCombo5B5_1_1.setBounds(25, 80, 250, 25);
            Interface.this.jButton5B5_1_4.setBounds(300, 80, 250, 25);

            Interface.this.jButton5B5_1_1.setBounds(300,20, 100, 25);
            Interface.this.jButton5B5_1_2.setBounds(180,150, 150, 25);
            Interface.this.jButton5B5_1_3.setBounds(300,50,100,25);

            Interface.this.jButton5B5_1_1.addActionListener(Interface.this.new ButtonListener_5_11_1());
            Interface.this.jButton5B5_1_2.addActionListener(Interface.this.new ButtonListener_5_11_2());
            Interface.this.jButton5B5_1_3.addActionListener(Interface.this.new ButtonListener_5_11_3());
            Interface.this.jButton5B5_1_4.addActionListener(Interface.this.new ButtonListener_5_11_4());

            Interface.this.frame1B5_11.setSize(700, 350);
            Interface.this.frame1B5_11.setLocation(500, 250);

            Interface.this.frame1B5_11.add(panel9);
            Interface.this.frame1B5_11.setVisible(true);


        }


    }
    /** Vai corresponder a acao do botao para associar uma pessoa a um projeto **/
    public class ButtonListener_5_11_1 implements ActionListener {

        public ButtonListener_5_11_1() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {



            try {
                int id = Integer.parseInt(Interface.this.jTextField20.getText())-1;  // VAI BUSCAR O ID QUE O UTILIZADOR POS NO CAMPO ID   
                int vef = 1,vef2=1;
                for(int i=0;i<listaProjetos.get(index).getListaPessoas().size();i++) {
                    if (listaProjetos.get(index).getListaPessoas().get(i) == listaPessoas.get(id)) {
                        JOptionPane.showMessageDialog(null, "ESSA PESSOA JA PERTENCE AO PROJETO", "ERRO", 0);
                        vef2 = 0;
                    }
                }
                if(vef2==1){

                    if (listaPessoas.get(id) instanceof Docente) {  // DOCENTE
                        Interface.this.listaProjetos.get(index).getListaPessoas().add(listaPessoas.get(id));
                        Interface.this.jTextField20.setText("");
                        JOptionPane.showMessageDialog(null, "DOCENTE ADICIONADO", "", JOptionPane.PLAIN_MESSAGE);
                    } else {

                        // BOLSEIRO
                        // buscar o input da janela dialog
                        String value1;

                        String[] esp = new String[3];

                        String value2;
                        String[] num = new String[3];
                        if (Interface.this.listaPessoas.get(id).getProjeto() == null) {
                            do {

                                do { // PARA A DATA DE INICIO DA BOLSA

                                    value1 = JOptionPane.showInputDialog(null, "Introduza a Data de Inicio da bolsa no formato DD/MM/AA", "Data Inicio Bolsa", JOptionPane.QUESTION_MESSAGE);
                                    esp = value1.split("/");
                                    if (VerificaSeDataEValida(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2])) != 1) {
                                        JOptionPane.showMessageDialog(null, "Introduziu uma data de inicio invalida!", "Erro", 0);

                                    }

                                } while (VerificaSeDataEValida(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2])) != 1);


                                do {  // PARA A DATA DE FIM DA BOLSA
                                    value2 = JOptionPane.showInputDialog(null, "Introduza a Data de Fim da bolsa no formato DD/MM/AA", "Data Fim Bolsa", JOptionPane.QUESTION_MESSAGE);
                                    num = value2.split("/");

                                    if (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) != 1) {
                                        JOptionPane.showMessageDialog(null, "Introduziu uma data de inicio invalida!", "Erro", 0);

                                    }
                                } while (VerificaSeDataEValida(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2])) != 1);


                                Data d1 = new Data(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]));
                                Data d2 = new Data(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]));
                                if (ComparaDatas(d1, d2) == 1) {
                                    JOptionPane.showMessageDialog(null, "Introduziu uma data inicial superior a data final!", "Erro", 0);

                                }
                                else if(ComparaDatas(d2,listaProjetos.get(index).getDataFimProjeto()) == 1 || ComparaDatas(listaProjetos.get(index).getDataInicioProjeto(),d1)==1){
                                    if(ComparaDatas(d2,listaProjetos.get(index).getDataFimProjeto()) == 1) {
                                        JOptionPane.showMessageDialog(null, "Introduziu uma data final de contrato superior a data final de projeto ( " + listaProjetos.get(index).getDataFimProjeto().getDataString() + " )", "Erro", 0);
                                    }
                                    if(ComparaDatas(listaProjetos.get(index).getDataInicioProjeto(),d1)==1){
                                        JOptionPane.showMessageDialog(null, "Introduziu uma data inicial de contrato inferior a data inicial de projeto ( " + listaProjetos.get(index).getDataInicioProjeto().getDataString() + " )", "Erro", 0);

                                    }
                                }
                                else {
                                    Interface.this.listaPessoas.get(id).setDataInicioBolsaEst(d1);
                                    Interface.this.listaPessoas.get(id).setDataInicioBolsaEst(d2);
                                    Interface.this.listaProjetos.get(index).getListaPessoas().add(listaPessoas.get(id));
                                    JOptionPane.showMessageDialog(null, "BOLSEIRO ADICIONADO", "", JOptionPane.PLAIN_MESSAGE);
                                    Interface.this.listaPessoas.get(id).setProjeto(Interface.this.listaProjetos.get(index));
                                    Interface.this.jTextField20.setText("");
                                    vef = 0;
                                }


                            } while (vef == 1);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "O Bolseiro ja esta associado ", "ERRO", 0);
                        }

                    }

                }
            } catch (NumberFormatException a) {
                if("".equals(Interface.this.jTextField20.getText())){
                   JOptionPane.showMessageDialog(null, "Nao introduziu um ID", "ERRO", 0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Introduza numeros!!! ", "ERRO", 0);
                }
            }
            catch (ArrayIndexOutOfBoundsException var13){
                JOptionPane.showMessageDialog(null, "Nao introduziu bem as datas!", "Erro", 0);
            }

        }
    }

    public class ButtonListener_5_11_2 implements ActionListener { /** ESTE BOTAO VAI SER PARA DAR PRINT DA LISTA DE PESSOAS PARA ASSOCIAR **/

        public ButtonListener_5_11_2() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Interface.this.jframe1B5_10 = new JFrame();
            Imprime novaJanela = new Imprime(Interface.this.jframe1B5_10, PrintPessoas(Interface.this.listaPessoas), "Lista de Pessoas", Interface.this.listaProjetos.get(index).getNome(), 900, 1000, 15);
            novaJanela.setSize(600, 1000);
            novaJanela.setLocation(1300, 100);
            novaJanela.setVisible(true);

        }
    }
    public class ButtonListener_5_11_3 implements ActionListener {  /** ESTE BOTAO VAI SER O BOTAO PARA TROCAR O INVESTIGADOR PRINCIPAL **/

        public ButtonListener_5_11_3() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {


            try {
                int id = Integer.parseInt(Interface.this.jTextField20_10.getText()) - 1;
                int vef = 1;
                if (listaPessoas.get(id) instanceof Bolseiro) {
                    JOptionPane.showMessageDialog(null, "Tentou nomear um Bolseiro como Investigador Principal", "ERRO", 0);
                } else {
                    if (listaProjetos.get(index).getInvestigadorPrincipal() == listaPessoas.get(id)) {
                        JOptionPane.showMessageDialog(null, "Desculpe, esse é o I.P atual!", "ERRO", 0);

                    } else {
                        for (int i = 0; i < listaProjetos.get(index).getListaPessoas().size(); i++) {
                            if (listaProjetos.get(index).getListaPessoas().get(i) == listaPessoas.get(id)) {
                                Interface.this.jTextField20_10.setText("");
                                JOptionPane.showMessageDialog(null, "Investigador Principal alterado com sucesso!", "SUCESSO", 1);
                                listaProjetos.get(index).setInvestigadorPrincipal(listaPessoas.get(id));
                                vef = 0;
                            }
                        }
                        if (vef == 1) {
                            Interface.this.jTextField20_10.setText("");
                            listaProjetos.get(index).setInvestigadorPrincipal(listaPessoas.get(id));
                            listaProjetos.get(index).getListaPessoas().add(listaPessoas.get(id));
                            JOptionPane.showMessageDialog(null, "Docente adicionado ao Projeto e nomeado Investigador Principal!", "SUCESSO", 1);
                        }
                    }
                }
            } catch (NumberFormatException a) {
                if ("".equals(Interface.this.jTextField20.getText())) {
                    JOptionPane.showMessageDialog(null, "Nao introduziu um ID", "ERRO", 0);
                } else {
                    JOptionPane.showMessageDialog(null, "Introduza numeros!!! ", "ERRO", 0);
                }

            }
        }
    }
    public class ButtonListener_5_11_4 implements ActionListener{ /** Remover Pessoa do projeto. Vai tirar as tarefas pelas quais esta responsavel **/
        public ButtonListener_5_11_4(){
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int indexP = Interface.this.jCombo5B5_1_1.getSelectedIndex()-1;
            if(Interface.this.jCombo5B5_1_1.getSelectedIndex()>0 && Interface.this.listaProjetos.get(index).getInvestigadorPrincipal()!=Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP)){
                int vefT=0;
                int[] indexT = new int[4];
                for(int k=0;k<4;k++){
                        indexT[k]=-1;
                }
                for(int i=0 ; i< Interface.this.listaProjetos.get(index).getListaTarefas().size();i++){
                    if (Interface.this.listaProjetos.get(index).getListaTarefas().get(i).getResponsavel() == Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP)) {
                        vefT = 1;
                        for(int k=0;k<4;k++){
                            if(indexT[k] == 0){
                                indexT[k]=i;
                            }
                        }
                        Interface.this.listaProjetos.get(index).getListaTarefas().get(i).setResponsavel(null);
                    }
                }
                if(vefT==1){
                    for(int k=0;k<4;k++){
                        if(indexT[k] != -1){
                            if (Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).getListaTarefas().get(indexT[k]) instanceof Design) {
                                    Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).DecrementaCarga(0.5);
                            }
                            if (Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).getListaTarefas().get(indexT[k]) instanceof Desenvolvimento) {
                                    Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).DecrementaCarga(1);
                            }
                            if (Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).getListaTarefas().get(indexT[k]) instanceof Documentacao) {
                                    Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).DecrementaCarga(0.25);
                            }
                            Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).getListaTarefas().remove(indexT[k]);
                        }
                    }
                }
                if(Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP) instanceof Bolseiro){
                    Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).setDataInicioBolsaEst(null);
                    Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).setDataFimBolsaEst(null);
                    Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP).setProjeto(null);
                }
                Interface.this.listaProjetos.get(index).getListaPessoas().remove(indexP);

            }
            else if( Interface.this.listaProjetos.get(index).getInvestigadorPrincipal()!=Interface.this.listaProjetos.get(index).getListaPessoas().get(indexP)){
                JOptionPane.showMessageDialog(null, "Selecionou o Inv. Principal. Selecione outra pessoa ou troque de I.P.", "ERRO", 0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Nao selecionou ninguem para eliminar", "ERRO", 0);
            }
        }
    }


/** E onde vai comecar o programa. Criamos um objeto da classe Interface, que entao vai criar a interface **/
    public static void main(String[] args) {
        Interface frame = new Interface();
        frame.setTitle("PROJETO POAO");
        frame.setSize(1000, 400);
        frame.setLocation(500, 300);
        frame.setVisible(true);
    }

    public String ConverteDataEmString(Data data){
        return data.getDia() + "/" + data.getMes() + "/" + data.getAno();
    }

    public String PrintTarefasNaoConcluidas(ArrayList<Tarefas> listaTarefas){
        int k=1;
        String res = "<html>";

        for( int i=0; i<listaTarefas.size() ; i++){
            if(listaTarefas.get(i).getDataFimTarefaUser()!=null) {
                if (ComparaDatas(listaTarefas.get(i).getDataFimTarefaUser(), listaTarefas.get(i).getDataFimTarefa()) == 1) {

                    if (listaTarefas.get(i) instanceof Design) {
                        if (listaTarefas.get(i).getResponsavel() != null) {
                            res = res + k + ". " + listaTarefas.get(i).getNome() + " Data de fim estimado da tarefa " + listaTarefas.get(i).getDataFimTarefa().getDataString() + " TAREFA TERMINADA EM " + listaTarefas.get(i).getDataFimTarefa().getDataString() + "    Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )" + "<br/>";
                        } else {
                            res = res + k + ". " + listaTarefas.get(i).getNome() + " Data de fim estimado da tarefa " + listaTarefas.get(i).getDataFimTarefa().getDataString() + " TAREFA TERMINADA EM " + listaTarefas.get(i).getDataFimTarefa().getDataString() + "    Responsavel: Nao tem " + "    ( DESIGN )" + "<br/>";
                        }
                    }
                    if (listaTarefas.get(i) instanceof Desenvolvimento) {
                        if (listaTarefas.get(i).getResponsavel() != null) {
                            res = res + k + ". " + listaTarefas.get(i).getNome() + " Data de fim estimado da tarefa " + listaTarefas.get(i).getDataFimTarefa().getDataString() + " TAREFA TERMINADA EM " + listaTarefas.get(i).getDataFimTarefa().getDataString() + "    Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )" + "<br/>";
                        } else {
                            res = res + k + ". " + listaTarefas.get(i).getNome() + " Data de fim estimado da tarefa " + listaTarefas.get(i).getDataFimTarefa().getDataString() + " TAREFA TERMINADA EM " + listaTarefas.get(i).getDataFimTarefa().getDataString() + "    Responsavel: Nao tem " + "    ( DESIGN )" + "<br/>";
                        }
                    }
                    if (listaTarefas.get(i) instanceof Documentacao) {
                        if (listaTarefas.get(i).getResponsavel() != null) {
                            res = res + k + ". " + listaTarefas.get(i).getNome() + " Data de fim estimado da tarefa " + listaTarefas.get(i).getDataFimTarefa().getDataString() + " TAREFA TERMINADA EM " + listaTarefas.get(i).getDataFimTarefa().getDataString() + "     Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )" + "<br/>";
                        } else {
                            res = res + k + ". " + listaTarefas.get(i).getNome() + " Data de fim estimado da tarefa " + listaTarefas.get(i).getDataFimTarefa().getDataString() + " TAREFA TERMINADA EM " + listaTarefas.get(i).getDataFimTarefa().getDataString() + "     Responsavel: Nao tem " + "    ( DESIGN )" + "<br/>";
                        }
                    }
                    k++;
                }
            }
        }
        res = res + "</html>";
        return res;
    }
    public String PrintTarefasTerminadas(ArrayList<Tarefas> listaTarefas){
        int k=1;
        String res = "<html>";

        for( int i=0; i<listaTarefas.size() ; i++){
            if(listaTarefas.get(i).getTaxaExecucao()==100) {

                if(listaTarefas.get(i) instanceof Design){
                    if(listaTarefas.get(i).getResponsavel()!=null){
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao()  + " Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )"+ "<br/>";
                    }
                    else{
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao()  + " Responsavel: Nao tem " + "    ( DESIGN )"+ "<br/>";
                    }
                }
                if(listaTarefas.get(i) instanceof Desenvolvimento){
                    if(listaTarefas.get(i).getResponsavel()!=null){
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )"+ "<br/>";
                    }
                    else{
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Responsavel: Nao tem " + "    ( DESIGN )"+ "<br/>";
                    }
                }
                if(listaTarefas.get(i) instanceof Documentacao){
                    if(listaTarefas.get(i).getResponsavel()!=null){
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao()  + " Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )"+ "<br/>";
                    }
                    else{
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao()  + " Responsavel: Nao tem " + "    ( DESIGN )"+ "<br/>";
                    }
                }
                k++;
            }
        }
        res = res + "</html>";
        return res;
    }
    public String PrintTarefasPorComecar(ArrayList<Tarefas> listaTarefas){
        int k=1;
        String res = "<html>";

        for( int i=0; i<listaTarefas.size() ; i++){
            if(listaTarefas.get(i).getTaxaExecucao()==0) {

                if(listaTarefas.get(i) instanceof Design){
                    if(listaTarefas.get(i).getResponsavel()!=null){
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Taxa de esforco: " + listaTarefas.get(i).getDuracao() + " Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )"+ "<br/>";
                    }
                    else{
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Taxa de esforco: " + listaTarefas.get(i).getDuracao() + " Responsavel: Nao tem " + "    ( DESIGN )"+ "<br/>";
                    }
                }
                if(listaTarefas.get(i) instanceof Desenvolvimento){
                    if(listaTarefas.get(i).getResponsavel()!=null){
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Taxa de esforco: " + listaTarefas.get(i).getDuracao() + " Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )"+ "<br/>";
                    }
                    else{
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Taxa de esforco: " + listaTarefas.get(i).getDuracao() + " Responsavel: Nao tem " + "    ( DESIGN )"+ "<br/>";
                    }
                }
                if(listaTarefas.get(i) instanceof Documentacao){
                    if(listaTarefas.get(i).getResponsavel()!=null){
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Taxa de esforco: " + listaTarefas.get(i).getDuracao() + " Responsavel: " + listaTarefas.get(i).getResponsavel().getNome() + "    ( DESIGN )"+ "<br/>";
                    }
                    else{
                        res = res + k + ". " + listaTarefas.get(i).getNome() + " Taxa de Execucao: " + listaTarefas.get(i).getTaxaExecucao() + " Taxa de esforco: " + listaTarefas.get(i).getDuracao() + " Responsavel: Nao tem " + "    ( DESIGN )"+ "<br/>";
                    }
                }
                k++;
            }
        }
        res = res + "</html>";
        return res;
    }

    public int VerificaSeDataEValida(int dia,int mes, int ano){ //Devolve 1 se valido. 0 se for invalido
        if(dia>0 && dia <32){
            if(mes>0 && mes<13){
                if(ano>0){
                    return 1;
                }
            }
            else{
                return 0;
            }
        }
        else{
            return 0;
        }
        return 0;
    }

    public String PrintInformacoesProjeto(ArrayList<Projeto> listaProjetos, int index){
        String res = "<html>";
        res = res + "Projeto: " + listaProjetos.get(index).getNome() + "<br/>"+"<br/>";
        if(listaProjetos.get(index).getConcluido()==1){
            res = res + "Concluido: SIM" + "<br/>" + "<br/>" + "<br/>";
        }
        else{
            res = res + "Concluido: NAO" + "<br/>" + "<br/>";
        }
        res = res + "Data de Inicio: " + listaProjetos.get(index).getDataInicioProjeto().getDataString() + "<br/>";
        res = res + "Data de Fim Estimada: " + listaProjetos.get(index).getDataFimProjeto().getDataString() + "<br/>";
        if(listaProjetos.get(index).getConcluido()==1){
            res = res + "Data de Conclusao: " + listaProjetos.get(index).getDataFimProjetoUser().getDataString() + "<br/>";
        }
        res = res + "Acronimo: " + listaProjetos.get(index).getAcronimo() + "<br/>" + "<br/>";
        res = res + "Investigador Principal: " + listaProjetos.get(index).getInvestigadorPrincipal().getNome()+"<br/>"+"<br/>";
        if( !listaProjetos.get(index).getListaTarefas().isEmpty()){

            res = res + "Lista de Tarefas: " +  "<br/>" + "<br/>" + PrintTarefas(listaProjetos,index);
            res = res + "<br/>";
        }
        if(listaProjetos.get(index).getConcluido()==1){
            if("<html></html>".equals(listaProjetos.get(index).getPessoas())){
                res = res + "Sem Pessoas Associadas: " +  "<br/>" + "<br/>";
            }
            else{
                res = res + "Lista de Pessoas Associadas: " +  "<br/>" + "<br/>" + listaProjetos.get(index).getPessoas();
            }
        }
        else if( !listaProjetos.get(index).getListaPessoas().isEmpty() ){
            res = res + "Lista de Pessoas Associadas: " +  "<br/>" + "<br/>" + PrintPessoas(listaProjetos.get(index).getListaPessoas());
        }

        res = res + "</html>";
        return res;
    }

    public String PrintProjetosPorTerminar(ArrayList<Projeto> listaProjetos) {
        int k = 1;
        String res="<html>";
        for (int i = 0; i < listaProjetos.size(); i++) {
            if (listaProjetos.get(i).getConcluido() == 0) {
                res = res + k + ". " + listaProjetos.get(i).getNome() + "<br/>";
                k++;
            }
            else if(listaProjetos.get(i).getConcluido() == 100){
                if(ComparaDatas(listaProjetos.get(i).getDataFimProjetoUser(),listaProjetos.get(i).getDataFimProjeto())==1){
                    res = res + k + ". " + listaProjetos.get(i).getNome() + "   Data de Fim Estimada: " + listaProjetos.get(i).getDataFimProjeto().getDataString() + "Data de Conclusao: " + listaProjetos.get(i).getDataFimProjetoUser().getDataString() + "<br/>";
                    k++;
                }
            }
        }
        res = res + "</html>";
        return res;
    }

    public String PrintProjetosConcluidos(ArrayList<Projeto> listaProjetos) {
        int k = 1;
        String res="<html>";
        for (int i = 0; i < listaProjetos.size(); i++) {
            if (listaProjetos.get(i).getConcluido() == 1) {
                res = res + k + ". " + listaProjetos.get(i).getNome() + "   Data de Fim Estimada: " + listaProjetos.get(i).getDataFimProjeto().getDataString() + "Data de Conclusao: " + listaProjetos.get(i).getDataFimProjetoUser().getDataString() + "<br/>";
                k++;
            }
        }
        res = res + "</html>";
        return res;
    }

    public String PrintTarefas(ArrayList<Projeto> listaProjetos, int index) {      /** Lista as tarefas todas existentes num projeto **/
        String res = "<html>";

        int k=1;
        for (int i = 0; i < listaProjetos.get(index).getListaTarefas().size(); i++){
            if(listaProjetos.get(index).getListaTarefas().get(i) instanceof Design){ // DESIGN
                res = res + k + ".  ( DESIGN ) " + listaProjetos.get(index).getListaTarefas().get(i).getNome() + " Taxa de execucao: " + listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + " %";
            }

            if(listaProjetos.get(index).getListaTarefas().get(i) instanceof Documentacao){ // DOCUMENTACAO
                res = res + k + ".  ( DOCUMENTACAO ) " + listaProjetos.get(index).getListaTarefas().get(i).getNome() + " Taxa de execucao: " + listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + " %";
            }

            if(listaProjetos.get(index).getListaTarefas().get(i) instanceof Desenvolvimento){ // DESENVOLVIMENTO
                res = res + k + ".  ( DESENVOLVIMENTO ) " + listaProjetos.get(index).getListaTarefas().get(i).getNome()  + " Taxa de execucao: " + listaProjetos.get(index).getListaTarefas().get(i).getTaxaExecucao() + " %";
            }
            if(listaProjetos.get(index).getListaTarefas().get(i).getResponsavel()!=null){
                res = res + "   ---->  Responsavel: " + listaProjetos.get(index).getListaTarefas().get(i).getResponsavel().getNome() + "<br/>";
            }
            else{
                res = res + "   ----> ( Sem Responsavel ) " + "<br/>";
            }
            k++;
        }
        res = res + "</hmtl>";

        return res;
    }

    public void AddProject(ArrayList<Projeto> listaProjetos, Projeto adiciona_Projeto) {
        listaProjetos.add(adiciona_Projeto);
    }


    public String PrintProjetos(ArrayList<Projeto> listaProjetos) {
        String res = "<html>";
        for (int i = 0; i < listaProjetos.size(); i++) {
            if(listaProjetos.get(i).getConcluido()==1){
                res = res + (i + 1) + ". " + listaProjetos.get(i).getNome() + "( CONSULTA APENAS )" + "<br/>";
            }
            else{
                res = res + (i + 1) + ". " + listaProjetos.get(i).getNome() + "<br/>";
            }
        }
        res = res + "</html>";
        return res;
    }

    public String PrintPessoas(ArrayList<Pessoa> listaPessoas) {
        String res = "<html>";
        int k=1;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if(listaPessoas.get(i) instanceof Docente) {
                res = res + k + ". DOCENTE:" + listaPessoas.get(i).getNome() +"   Carga: " + listaPessoas.get(i).getCarga()  + "<br/>";
            }
            if(listaPessoas.get(i) instanceof Licenciado) {
                res = res + k + ". LICENCIADO:" + listaPessoas.get(i).getNome()  +"   Carga: " + listaPessoas.get(i).getCarga() ;
            }
            if(listaPessoas.get(i) instanceof Mestre) {
                res = res + k + ". MESTRE:" + listaPessoas.get(i).getNome()  +"   Carga: " + listaPessoas.get(i).getCarga();
            }
            if(listaPessoas.get(i) instanceof Doutorado) {
                res = res + k + ". DOUTORADO:" + listaPessoas.get(i).getNome()  +"   Carga: " + listaPessoas.get(i).getCarga();
            }
            if(listaPessoas.get(i) instanceof Bolseiro){
                if(listaPessoas.get(i).getDataInicioBolsa()==null){
                    res = res + "    (Bolseiro sem Projeto Associado)" + "<br/>";
                }
                else{
                    res = res + "<br/>";
                }
            }
            k++;
        }
        res = res + "</html>";
        return res;
    }

    public String PrintDocentes(ArrayList<Pessoa> listaPessoas) {
        String res = "<html>";
        int k=1;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if(listaPessoas.get(i) instanceof Docente) {
                res = res + k + ". DOCENTE:" + listaPessoas.get(i).getNome() + "<br/>";
                k++;
            }
        }
        res = res + "</html>";
        return res;
    }

    public int IndiceDocente(ArrayList<Pessoa> listaPessoas, int index){
        int iAux1 = index-1;    //Tarefa INDEX
        int t_index = -1, k = 0;

        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i) instanceof Docente) {
                if (k == iAux1) {
                    t_index = i;
                }
                k++;
            }
        }
        return t_index;
    }
    public int TotalDocentes(ArrayList<Pessoa> listaPessoas){
        int k = 0;

        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i) instanceof Docente) {
                k++;
            }
        }
        return k;
    }

    public void LerFicheiroTextoTarefas(ArrayList<Projeto> proj) {
        File f = new File("resources//ficheiroTAREFAS.txt");

        if (f.exists() && f.isFile()) {
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] num = linha.split("-");
                    String[] div = num[3].split("/");
                    String[] barra = num[4].split("/");

                    if(Integer.parseInt(num[2]) == 1){ // TAREFA DESIGN
                        Design tarefa_Design = new Design(num[0],Integer.parseInt(num[1]),0,Integer.parseInt(div[0]),Integer.parseInt(div[1]),Integer.parseInt(barra[2]),Integer.parseInt(barra[0]),Integer.parseInt(barra[1]),Integer.parseInt(barra[2]),0.5);
                        proj.get(Integer.parseInt(num[5])-1).getListaTarefas().add(tarefa_Design);

                    }
                    if(Integer.parseInt(num[2]) == 2){ // TAREFA DESENVOLVIMENTO
                        Desenvolvimento tarefa_Desenvolvimento = new Desenvolvimento(num[0],Integer.parseInt(num[1]),0,Integer.parseInt(div[0]),Integer.parseInt(div[1]),Integer.parseInt(div[2]),Integer.parseInt(barra[0]),Integer.parseInt(barra[1]),Integer.parseInt(barra[2]),1);
                        proj.get(Integer.parseInt(num[5])-1).getListaTarefas().add(tarefa_Desenvolvimento);
                    }
                    if(Integer.parseInt(num[2]) == 3){ // TAREFA DOCUMENTACAO
                        Documentacao tarefa_Documentacao = new Documentacao(num[0],Integer.parseInt(num[1]),0,Integer.parseInt(div[0]),Integer.parseInt(div[1]),Integer.parseInt(div[2]),Integer.parseInt(barra[0]),Integer.parseInt(barra[1]),Integer.parseInt(barra[2]),0.25);
                        proj.get(Integer.parseInt(num[5])-1).getListaTarefas().add(tarefa_Documentacao);
                    }
                }
                br.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir o ficheiro texto TAREFAS");
            } catch (IOException ex) {
                System.out.println("Erro ao ler o o ficheiro texto TAREFAS");
            }
        } else {
            System.out.println("Ficheiro TAREFAS TEXTO nao existe");
        }
    }

    public ArrayList<Projeto> LerFicheiroTextoProjetos() {
        File f = new File("resources//ficheiroPROJETO.txt");
        ArrayList<Projeto> proj = new ArrayList<>();


        if (f.exists() && f.isFile()) { // vai ver se o ficheiro existe e se é ficheiro
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                String linha;
                while ((linha = br.readLine()) != null) { // vai percorrer até ao fim do ficheiro
                    String[] num = linha.split("-");
                    Projeto projet = new Projeto();
                    projet.setNome(num[0]);

                    //indice = 1;
                    projet.setAcronimo(num[1]);
                    //indice = 2;
                    projet.setDuracaoEstimada(Integer.parseInt(num[2]));
                    //indice = 3;

                    String[] esp = num[3].split("/");

                    projet.setDataInicio(Integer.parseInt(esp[0]), Integer.parseInt(esp[1]), Integer.parseInt(esp[2]));
                    //indice = 4;

                    String[] ult = num[4].split("/");
                    projet.setDataFim(Integer.parseInt(ult[0]), Integer.parseInt(ult[1]), Integer.parseInt(ult[2]));
                    AddProject(proj, projet); // por o proj na lista de Projetos com os elementos ja todos set

                }

                br.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir o ficheiro texto PROJETO");
            } catch (IOException ex) {
                System.out.println("Erro ao ler o ficheiro PROJETO");
            }


        }
        else {
            System.out.println("Ficheiro ficheiroPROJETO.txt nao existe");
        }
        LerFicheiroTextoTarefas(proj);
        return proj; // vai dar return da lista de projetos


    }


    public ArrayList<Pessoa> LerFicheiroTextoPessoas(ArrayList<Projeto> listaProjetos) {
        File f = new File("resources//ficheiroPESSOAS.txt");
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        int line = 0;
        if (f.exists() && f.isFile()) { // vai ver se o ficheiro existe e se é ficheiro
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);

                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] num = linha.split("-");
                    if(Integer.parseInt(num[0]) == 1){ // Para o caso de ser DOCENTE
                        Docente docente = new Docente(num[1],num[2],num[3],Integer.parseInt(num[4]));
                        listaPessoas.add(docente);
                        if(Integer.parseInt(num[5])>0){
                            listaProjetos.get(Integer.parseInt(num[5])-1).setInvestigadorPrincipal(listaPessoas.get(line));
                            listaProjetos.get(Integer.parseInt(num[5])-1).getListaPessoas().add(listaPessoas.get(line));
                        }
                    }
                    else {
                        if (Integer.parseInt(num[0]) == 2) { // Para o caso de ser LICENCIADO
                            Licenciado licenciado = new Licenciado(num[1], num[2], 800);
                            if(Integer.parseInt(num[3])>0){
                                String[] barra = num[4].split("/");
                                licenciado.setDataInicioBolsa(Integer.parseInt(barra[0]), Integer.parseInt(barra[1]), Integer.parseInt(barra[2]));
                                barra = num[5].split("/");
                                licenciado.setDataFimBolsa(Integer.parseInt(barra[0]), Integer.parseInt(barra[1]), Integer.parseInt(barra[2]));
                                listaPessoas.add(licenciado);
                                listaProjetos.get(Integer.parseInt(num[3])-1).getListaPessoas().add(listaPessoas.get(line));
                                listaPessoas.get(line).setProjeto(listaProjetos.get(Integer.parseInt(num[3])-1));
                            }
                            else{
                                listaPessoas.add(licenciado);
                            }
                        }

                        if (Integer.parseInt(num[0]) == 3) { // Para o caso de ser MESTRADO
                            Mestre mestre = new Mestre(num[1], num[2], 1000);
                            if(Integer.parseInt(num[3])>0){
                                String[] barra = num[4].split("/");
                                mestre.setDataInicioBolsa(Integer.parseInt(barra[0]), Integer.parseInt(barra[1]), Integer.parseInt(barra[2]));
                                barra = num[5].split("/");
                                mestre.setDataFimBolsa(Integer.parseInt(barra[0]), Integer.parseInt(barra[1]), Integer.parseInt(barra[2]));
                                listaPessoas.add(mestre);
                                listaProjetos.get(Integer.parseInt(num[3])-1).getListaPessoas().add(listaPessoas.get(line));
                                listaPessoas.get(line).setProjeto(listaProjetos.get(Integer.parseInt(num[3])-1));
                            }
                            else{
                                listaPessoas.add(mestre);
                            }
                        }
                        if (Integer.parseInt(num[0]) == 4) { // Para o caso de ser DOUTORADO
                            Doutorado doutorado = new Doutorado(num[1], num[2], 1200);
                            if(Integer.parseInt(num[3])>0){
                                String[] barra = num[4].split("/");
                                doutorado.setDataInicioBolsa(Integer.parseInt(barra[0]), Integer.parseInt(barra[1]), Integer.parseInt(barra[2]));
                                barra = num[5].split("/");
                                doutorado.setDataFimBolsa(Integer.parseInt(barra[0]), Integer.parseInt(barra[1]), Integer.parseInt(barra[2]));
                                listaPessoas.add(doutorado);
                                listaProjetos.get(Integer.parseInt(num[3])-1).getListaPessoas().add(listaPessoas.get(line));
                                listaPessoas.get(line).setProjeto(listaProjetos.get(Integer.parseInt(num[3])-1));
                            }
                            else{
                                listaPessoas.add(doutorado);
                            }

                        }
                    }
                    line++;
                }
                br.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Erro a abrir o ficheiro texto PESSOA");
            } catch (IOException ex) {
                System.out.println("Erro ao ler o ficheiro texto PESSOA");
            }
        }
        else {
            System.out.println("Ficheiro PESSOA TEXTO nao existe");
        }
        return listaPessoas;
    }

        /** Devolve 1 se a DATA 1 for depois da DATA2
      Devolve -1 caso a DATA 1 for antes da DATA2
     Devolve 0 caso sejam iguais
     **/
    public int ComparaDatas(Data data1, Data data2){
        int n,dia1,dia2,mes1,mes2,ano1,ano2;
        dia1 = data1.getDia();
        dia2 = data2.getDia();
        mes1 = data1.getMes();
        mes2 = data2.getMes();
        ano1 = data1.getAno();
        ano2 = data2.getAno();
        if((ano1) != (ano2)){
            if( ano1 >  ano2 ){
                n=1;
            }
            else{
                n=-1;
            }
        }
        else{
            if( mes1 != mes2){
                if( mes1 >  mes2){
                    n=1;
                }
                else{
                    n=-1;
                }
            }
            else{
                if( dia1 > dia2){
                    n=1;
                }
                else if( dia1 == dia2){
                    n=0;
                }
                else{
                    n=-1;
                }
            }
        }
        return n;
    }
             /** Vai criar um objeto da Classe Objeto, que vai conter as listas das pessoas e dos projetos **/
    public void CriaFicheiroObjeto(ArrayList<Projeto> listaProjetos, ArrayList<Pessoa> listaPessoas){
        File f = new File("resources//OBJficheiroProj.obj");
        Objeto objeto = new Objeto(listaProjetos,listaPessoas);
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject( objeto );
            oos.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro a criar ficheiro.");
        } catch (IOException ex) {
            System.out.println("Erro a escrever para o ficheiro.");
        }
    }
        /** Vai ver se existe um ficheiro objeto para ler, se nao existir vai ler os dados dos ficheiros de texto **/
    public Objeto LeFicheiroObjeto(){
        File f = new File("resources//OBJficheiroProj.obj");
        Objeto objeto = new Objeto(null,null);
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            objeto = (Objeto) ois.readObject();

            ois.close();

            return objeto;
        }
        catch (FileNotFoundException ex) {
            System.out.println("Nao encontrou o ficheiro objeto. Portanto vai ler dos ficheiros de texto!");
            objeto.setListaProjetos(LerFicheiroTextoProjetos());
            objeto.setListaPessoas(LerFicheiroTextoPessoas(objeto.getListaProjetos()));
            return objeto;
        }
        catch (IOException ex) {
            System.out.println("Erro a ler ficheiro.");
            System.out.println("Portanto vai ler dos ficheiros de texto!");
            objeto.setListaProjetos(LerFicheiroTextoProjetos());
            objeto.setListaPessoas(LerFicheiroTextoPessoas(objeto.getListaProjetos()));
            return objeto;
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Erro a converter objeto.");
            System.out.println("Portanto vai ler dos ficheiros de texto!");
            objeto.setListaProjetos(LerFicheiroTextoProjetos());
            objeto.setListaPessoas(LerFicheiroTextoPessoas(objeto.getListaProjetos()));
            return objeto;
        }
    }

}
