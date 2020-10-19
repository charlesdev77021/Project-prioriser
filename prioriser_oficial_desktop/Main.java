import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.Currency;


public class Main{

    public static void main(String[] args) //void main
    {
        try{
            ScreenMain main = new ScreenMain();
            main.setVisible(true);
            main.setResizable(false); 
        }
        catch(Exception error) {
            JOptionPane.showMessageDialog(null, "Erro: " + error);

        }



    }//end void main


}