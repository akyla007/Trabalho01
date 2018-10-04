package Trabalho1;
/**
 *
 * @author akyla
 */
public class ContaPoupanca extends Contas
{   
    public static ContaPoupanca get;
    protected ContaPoupanca() {
    }
 
    public static ContaPoupanca getInstancia() {
        if (get == null)
            get = new ContaPoupanca();
        return get;
    }
     void reajuste (double taxa)
    {
      setSaldo(getSaldo()+(getSaldo()*(taxa/100)));
    }
    void tipoConta()
    {
        System.out.println("Esta é uma conta-poupança");
    }
}
