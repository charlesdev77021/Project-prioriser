//import classes
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.Currency;

//;

public class ScreenMain extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;
    // creating main components
        private JLabel label_Top, label_Top_two;
        private JButton button_Prioriser, button_cotation, button_exit;
        private JMenuBar bar = new JMenuBar();
        private JMenu menu_one = new JMenu("Prioriser");
        private JMenu menu_two = new JMenu("Sobre");
        private JMenuItem item_menu_one_prioriser = new JMenuItem("Sair");
        private JMenuItem item_menu_two_about_about = new JMenuItem("Sobre o projeto");
        private JMenuItem item_menu_two_about_about_release = new JMenuItem("Sobre a versão: 1.0");
    //;


    public ScreenMain() //main constructor
    {
        setSize(700, 500);
        setTitle("Prioriser | main");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assents/imgs/cifrao.png")));

        //creating menuTop
            setJMenuBar(bar);
            bar.add(menu_one);
            bar.add(menu_two);

            menu_one.add(item_menu_one_prioriser);
            item_menu_one_prioriser.addActionListener(this);

            menu_two.add(item_menu_two_about_about);
            item_menu_two_about_about.addActionListener(this);

            menu_two.add(item_menu_two_about_about_release);
            item_menu_two_about_about_release.addActionListener(this);
        //;

        //creating labels

        label_Top = new JLabel("Bem vindo ao Prioriser 1.0");
        add(label_Top);
        label_Top.setBounds(250, 10, 200, 40);

        label_Top_two = new JLabel("Criado por: Chameleon Company");
        add(label_Top_two);
        label_Top_two.setBounds(230, 40, 250, 70);

        //;

        //creating buttons

        button_Prioriser = new JButton("Prioriser");
        add(button_Prioriser);
        button_Prioriser.setBounds(235,145,210,70);
        button_Prioriser.addActionListener(this);


        button_exit = new JButton("Sair");
        add(button_exit);
        button_exit.setBounds(235,265,210,70);
        button_exit.addActionListener(this);

    }
    

    

    @Override
    public void actionPerformed(ActionEvent executE)
    {

                if(executE.getSource()==button_Prioriser)
                {

                    try 
                    {
                        ScreenPrioriser screenprioriser = new ScreenPrioriser();
                        screenprioriser.setVisible(true);
                        screenprioriser.setResizable(false);
                        dispose();
                    }
                    catch(Exception error)
                    {
                        JOptionPane.showMessageDialog(null, "Erro: " + error);
                    }
                }



                else if(executE.getSource()==button_exit){
                    try {
                        System.exit(0);
                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "Erro: " + error);
                    }
                }


                else if(executE.getSource()==item_menu_one_prioriser)
                {
                    try{
                        System.exit(0);
                    }
                    catch(Exception error)
                    {
                        JOptionPane.showMessageDialog(null, "Erro: " + error);
                    }
                }

                else if(executE.getSource()==item_menu_two_about_about)
                {
                    try{
                    JOptionPane.showMessageDialog(null, "O Prioriser é um projeto livre que tem como objetivo ajudar as pessoas com as contas do mês. \nPara mais informações, visite nosso site: http://prioriser.epizy.com/?i=1  ");
                    }
                    catch(Exception error)
                    {
                        JOptionPane.showMessageDialog(null, "Erro: " + error);
                    }
                }


                else if(executE.getSource()==item_menu_two_about_about_release)
                {
                    try
                    {
                        JOptionPane.showMessageDialog(null, "Sobre a versão: Primeira versão oficial do software. ");
                    }
                    catch(Exception error)
                    {
                        JOptionPane.showMessageDialog(null, "Erro: " + error);
                    }
                }
    }

}
//endAll