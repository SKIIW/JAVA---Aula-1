package Modelo;

public class Validacao
{
    public String numero1;
    public String numero2;
    public String mensagem;
    private Double n1;
    private Double n2;
    
    public String Validar(String numero1, String numero2)
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(numero1);
            this.n2 = Double.parseDouble(numero2);
        }
        catch (Exception e)
        {
            this.mensagem = "Número inválido";
        }
        
        return this.mensagem;
    }

    public Double getN1()
    {
        return n1;
    }

    public Double getN2()
    {
        return n2;
    }
    
}
