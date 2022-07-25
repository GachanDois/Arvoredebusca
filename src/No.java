public class No
{
    public String valor;
    public No esquerda;
    public No direita;
    public ListaDinamica linhas;

    public No(String valor)
    {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
        this.linhas = new ListaDinamica();
    }
}