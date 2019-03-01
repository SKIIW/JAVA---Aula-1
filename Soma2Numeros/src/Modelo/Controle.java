package Modelo;

public class Controle
{
    public String numero1;
    public String numero2;
    public String resultado;
    public String mensagem;
    
    public void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.numero1 = this.numero1;
        validacao.numero2 = this.numero2;
        validacao.Validar();
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            calculos.n1 = validacao.n1;
            calculos.n2 = validacao.n2;
            calculos.Somar();
            this.resultado = calculos.res.toString();
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
        
    }
}
