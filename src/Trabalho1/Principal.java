package Trabalho1;

import javax.swing.JOptionPane;

/**
 *
 * @author akyla
 */
public class Principal 
{
    public static void main(String[] args) 
    {
        
        Contas a = new Contas();
        ContaPoupanca c = new ContaPoupanca();
        ContaEspecial b = new ContaEspecial();
        Tela d = new Tela();
        d.setVisible(true);
        JOptionPane.showMessageDialog(null, "Bem vindo!");
        
        
        
        
    }
}
