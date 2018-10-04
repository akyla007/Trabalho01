package Trabalho1;
/**
 *
 * @author akyla
 */
public class ContaEspecial extends Contas
{   
    int limite;
    double multa;
    public static ContaEspecial get;
    protected ContaEspecial() {
    }
 
    public static ContaEspecial getInstancia() {
        if (get == null)
            get = new ContaEspecial();
        return get;
    }
    void descontar()
    {
         double r;
         r= getSaldo()+(getSaldo()*multa/100);
          //multa = (this.getSaldo()-this.limite*0.10)+(this.getSaldo()-this.limite);
           this.setSaldo(r);
    }
    void tipoConta()
    {
        System.out.println("Esta é uma conta-especial");
    }
}
