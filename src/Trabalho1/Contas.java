package Trabalho1;

import javax.swing.JOptionPane;

public class Contas 
{
    public static Contas get;
    protected Contas() {
    }
 
    public static Contas getInstancia() {
        if (get == null)
            get = new Contas();
        return get;
    }
        private String nome;
        private int numero;
        private double saldo;
    void tipoConta()
    {
        
    }
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    void depositar(double valor)
    { 
        saldo+=valor;
    }
       int  sacar(double valor)
    {
       if(saldo>=valor)
       {
           saldo=saldo-valor;
           return 1;
       }
       else
       {
           return 0;
       }
    }
}
