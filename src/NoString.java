public class NoString
{
    public String dado;
    public NoString anterior;
    public NoString proximo;
    public NoString(String elemento)
    {
        dado = elemento;
        proximo = null;
        anterior = null;
    }
}