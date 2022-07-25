import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArvoreBusca
{

    private No raiz;

    public ArvoreBusca()
    {
        raiz = null;
    }

    public void adicionar(String valor)
    {
        if (raiz == null)
        {
            raiz = new No(valor);
        }
        else {
            adicionar(valor, raiz);
        }
    }

    private void adicionar(String valor, No raiz)
    {
        //valor.compareTo(raiz.valor) < 0
        if (valor.compareTo(raiz.valor) < 0) //valor < raiz.valor
        {
            if (raiz.esquerda == null)
            {
                raiz.esquerda = new No(valor);
            }
            else
            {
                adicionar(valor, raiz.esquerda);
            }
        }
        else if (valor.compareTo(raiz.valor) > 0) //valor > raiz.valor
        {
            if (raiz.direita == null)
            {
                raiz.direita = new No(valor);
            }
            else
            {
                adicionar(valor, raiz.direita);
            }
        }
    }

    public boolean pesquisar(String valor)
    {
        if (raiz == null)
        {
            return false;
        }
        else
        {
            return pesquisarHelper(valor, raiz);
        }
    }


    private boolean pesquisarHelper(String valor, No raiz)
    {
        if (valor.equals(raiz.valor))
        {
            return true;
        }
        else if (valor.compareTo(raiz.valor) < 0)
        {
            if (raiz.esquerda == null)
            {
                return false;
            }
            else
            {
                return pesquisarHelper(valor, raiz.esquerda);
            }
        }
        else if (valor.compareTo(raiz.valor) > 0)
        {
            if (raiz.direita == null)
            {
                return false;
            }

            else
            {
                return pesquisarHelper(valor, raiz.direita);
            }
        }

        return false;
    }


    public No pesquisarNo(String valor)
    {
        if (raiz == null)
        {
            return null;
        }
        else
        {
            return pesquisarNoHelper(valor, raiz);
        }
    }


    private No pesquisarNoHelper(String valor, No raiz)
    {
        if (valor.equals(raiz.valor))
        {
            return raiz;
        }
        else if (valor.compareTo(raiz.valor) < 0)
        {
            if (raiz.esquerda == null)
            {
                return null;
            }
            else
            {
                return pesquisarNoHelper(valor, raiz.esquerda);
            }
        }
        else if (valor.compareTo(raiz.valor) > 0)
        {
            if (raiz.direita == null)
            {
                return null;
            }

            else
            {
                return pesquisarNoHelper(valor, raiz.direita);
            }
        }

        return null;
    }




    public void exibirEmOrdem()  {
        if (raiz != null)
        {
            exibirEmOrdem(raiz);

        }
    }

    private void exibirEmOrdem(No raiz)  {

        if (raiz.esquerda != null)
        {
            exibirEmOrdem(raiz.esquerda);
        }

        if(raiz.linhas.getContador() != 0) {
            Main.print.print(raiz.valor + ": ");
            raiz.linhas.exibir();
            Main.print.println();
        }
        if (raiz.direita != null)
        {
            exibirEmOrdem(raiz.direita);
        }
    }

}