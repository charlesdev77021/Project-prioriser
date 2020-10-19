//import classes

import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Currency;

//;

public class ScreenPrioriser extends JFrame implements ActionListener
{
    //creating main components
    private JLabel label_Cap, label_Alimentation, label_water, label_energy, label_helth, label_education, label_recreation, label_internet, label_others,label_result;
    private JButton button_Prioriser, button_back, button_exit;
    private JTextField inp_Cap, inp_Alimentation, inp_water, inp_energy, inp_helth, inp_education, inp_recreation, inp_internet, inp_others;
    //;


    public ScreenPrioriser() //main constructor
    {
        setSize(700, 500);
        setTitle("Prioriser | main");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assents/imgs/cifrao.png")));



        //creating labels
        label_Cap = new JLabel("Capital: ");
        add(label_Cap);
        label_Cap.setBounds(20, 5, 200, 20);

        label_Alimentation = new JLabel("Alimentação: ");
        add(label_Alimentation);
        label_Alimentation.setBounds(20, 60, 200, 20);

        label_water = new JLabel("Água: ");
        add(label_water);
        label_water.setBounds(20, 100, 200, 20);

        label_energy = new JLabel("Energia: ");
        add(label_energy);
        label_energy.setBounds(20, 140, 200, 20);

        label_helth = new JLabel("Saúde: ");
        add(label_helth);
        label_helth.setBounds(20, 180, 200, 20);

        label_education = new JLabel("Ensino: ");
        add(label_education);
        label_education.setBounds(20, 220, 200, 20);

        label_recreation = new JLabel("Recreação: ");
        add(label_recreation);
        label_recreation.setBounds(20, 260, 200, 20);

        label_internet = new JLabel("Internet: ");
        add(label_internet);
        label_internet.setBounds(20, 300, 200, 20);

        label_others = new JLabel("Outros: ");
        add(label_others);
        label_others.setBounds(20, 340, 200, 20);


        label_result = new JLabel("Resultado: ");
        add(label_result);
        label_result.setBounds(470, 200, 200, 20);
        //;


        //creating text

        inp_Cap = new JTextField();
        add(inp_Cap);
        inp_Cap.setBounds(110, 5, 200, 20);

        inp_Alimentation = new JTextField();
        add(inp_Alimentation);
        inp_Alimentation.setBounds(110, 60, 200, 20);

        inp_water = new JTextField();
        add(inp_water);
        inp_water.setBounds(110, 100, 200, 20);

        inp_energy = new JTextField();
        add(inp_energy);
        inp_energy.setBounds(110, 140, 200, 20);

        inp_helth = new JTextField();
        add(inp_helth);
        inp_helth.setBounds(110, 180, 200, 20);

        inp_education = new JTextField();
        add(inp_education);
        inp_education.setBounds(110, 220, 200, 20);

        inp_recreation = new JTextField();
        add(inp_recreation);
        inp_recreation.setBounds(110, 260, 200, 20);

        inp_internet = new JTextField();
        add(inp_internet);
        inp_internet.setBounds(110, 300, 200, 20);

        inp_others = new JTextField();
        add(inp_others);
        inp_others.setBounds(110, 340, 200, 20);

        //;





        //creating buttons

        button_Prioriser = new JButton("Prioriser");
        add(button_Prioriser);
        button_Prioriser.setBounds(455,125,110,30);
        button_Prioriser.addActionListener(this);

        button_back = new JButton("Voltar");
        add(button_back);
        button_back.setBounds(405,245,100,40);
        button_back.addActionListener(this);

        button_exit = new JButton("Sair");
        add(button_exit);
        button_exit.setBounds(510,245,100,40);
        button_back.addActionListener(this);

        //;


 




    } //;
    

    @Override
	public void actionPerformed(ActionEvent executE){

                if(executE.getSource()==button_Prioriser)
                {
                    try
                    {
                        Double valueCap = Double.parseDouble(inp_Cap.getText());
                
                        Double valueAlim = Double.parseDouble(inp_Alimentation.getText());
                        Double valueWat = Double.parseDouble(inp_water.getText());
                        Double valueEner = Double.parseDouble(inp_energy.getText());
                        Double valueHealt = Double.parseDouble(inp_helth.getText());
                        Double valueEdu = Double.parseDouble(inp_education.getText());
                        Double valueRec = Double.parseDouble(inp_recreation.getText());
                        Double valueInter = Double.parseDouble(inp_internet.getText());
                        Double valueOther = Double.parseDouble(inp_others.getText());

                
                        Double expenses = valueAlim + valueWat + valueEner + valueHealt + valueEdu + valueRec + valueInter + valueOther;
                
                        Double finalCont = valueCap - expenses;
                
                        Double verifica_division = valueCap - (valueCap * 0.20);
                
                        String finalContStr = Double.toString(finalCont);


                
                        //Verifications 
                        if(finalCont <= 0)
                        {
                            JOptionPane.showMessageDialog(null, "Suas contas estão mais altas que seu capital.\nPegue dicas em nosso site.");

                            label_result.setText("Faltam R$ "+ finalContStr);

                        }
                        else if(expenses > verifica_division)
                        {
                            JOptionPane.showMessageDialog(null, "Suas contas estão em ordem, mas as dividas ultrapassam os 80% do seu capital. Tente economizar mais!");
                            
                            label_result.setText("Sobram: R$ "+ finalContStr);
                
                        }else if(valueWat > valueCap * 0.10){
                            JOptionPane.showMessageDialog(null, "Conta de água muito alta.");
                        }else if(valueEner > valueCap * 0.10){
                            JOptionPane.showMessageDialog(null, "Conta de energia muito alta.");
                        }else if(valueInter > valueCap * 0.10){
                            JOptionPane.showMessageDialog(null, "Conta de internet muito alta.");
                        }else if(valueOther > valueCap * 0.30){
                            JOptionPane.showMessageDialog(null, "Conta de outros muito alta.");
                        }






                        else
                        {
                            label_result.setText("Sobram:R$ "+ finalContStr);
                
                        }
                        //;
                
                    }
                    catch(Exception error)
                    {
                            JOptionPane.showMessageDialog(null, "Erro: " + error);
                
                    }

                }



                else if(executE.getSource()==button_back)
                {
                    try {
                        ScreenMain main = new ScreenMain();
                        main.setVisible(true);
                        main.setResizable(false);
                        dispose();
                        
                    } catch (Exception error) {
                        JOptionPane.showMessageDialog(null, "Erro. Codigo: " + error);
                    }

                }



                else if(executE.getSource()==button_exit)
                {
                    try{
                        System.exit(0);
                    }
                    catch(Exception error)
                    {
                        JOptionPane.showMessageDialog(null, "Erro: " + error);
                    }
                }
    }

}
//endAll