/*

//import classes
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.Currency;

//;

public class ScreenCotation extends JFrame implements ActionListener
{
    //creating main components
        private JLabel label_capital,label_result;
        private JButton button_dollar, button_euro, button_back, button_exit;
        private JTextField capital;

    //;


    public ScreenCotation() //main constructor
    {
        setSize(700, 500);
        setTitle("Prioriser | Cotation");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assents/imgs/cifrao.png")));


        label_result = new JLabel("Resultado");
		add(label_result);
        label_result.setBounds(280, 250, 350, 30);


		label_capital = new JLabel("Capital reais: ");
		add(label_capital);
		label_capital.setBounds(300, 150, 100, 30);



        button_euro = new JButton("Euro");
        add(button_euro);
        button_euro.setBounds(220, 50, 100, 30);
        button_euro.addActionListener(this);


        button_dollar = new JButton("Dólar");
        add(button_dollar);
        button_dollar.setBounds(380, 50, 100, 30);
        button_dollar.addActionListener(this);

        capital = new JTextField();
        add(capital);
        capital.setBounds(295, 200, 100, 30);
        capital.addActionListener(this);


		button_back = new JButton("Voltar");
		add(button_back);
		button_back.setBounds(170,350,120,40);
		button_back.addActionListener(this);

		button_exit = new JButton("Sair");
		add(button_exit);
		button_exit.setBounds(390,350,120,40);
		button_exit.addActionListener(this);


 




    } //;
    

//end void main

    @Override
	public void actionPerformed(ActionEvent executE){

        if(executE.getSource()==button_euro)
        {
            try
            {
                Double CapFinal = Double.parseDouble(capital.getText());
                Double finalCont = (CapFinal / 4.22);
                String finalContStr = Double.toString(finalCont);
                label_result.setText("Seu novo capital: " + finalContStr);
            }
            catch(Exception error)
            {
            JOptionPane.showMessageDialog(null, "Erro: " + error);
            }



        }


            else if(executE.getSource()==button_dollar){

                try
                 {
                    Double CapFinal = Double.parseDouble(capital.getText());
                    Double finalCont = CapFinal / 3.74;

                    String finalContStr = Double.toString(finalCont);
                    label_result.setText("Seu novo capital: " + finalContStr);
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

        else if(executE.getSource()==button_back)
                {
                    try
                    {
                        ScreenMain main = new ScreenMain();
                        main.setVisible(true);
                        main.setResizable(false);
                        dispose();
                    }
                    catch(Exception error)
                    {
                        JOptionPane.showMessageDialog(null, "Erro: " + error);
                    }

                }

                
        }
    }


//endAll

*/