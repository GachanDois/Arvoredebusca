import java.util.Arrays;

public class ListaDinamica //Duplamente Encadeada
{
    public NoString first;
    public NoString last;

    public int getContador() {
        return contador;
    }

    private int contador;

    public ListaDinamica()
    {
        first = null;
        last = null;
        contador = 0;

    }

    public void add(String elemento)
    {
        NoString novo = new NoString(elemento);

        if (first == null)//lista vazia
        {
            first = novo;
            last = novo;
            novo.proximo = null;
            novo.anterior = null;
        }
        else
        {
            if(novo.dado.equals(last.dado)){
                return;
            }
            last.proximo = novo;
            novo.anterior = last;
            novo.proximo = null;
            last = novo;

        }
        contador++;
    }


    public void exibir()
    {
        NoString aux = first;

        while(aux != null)
        {
            Main.print.print(aux.dado + " ");
            aux = aux.proximo;
        }
    }


}