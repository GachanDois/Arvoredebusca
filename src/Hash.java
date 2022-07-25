import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Hash
{
    private ArvoreBusca tabela [];

    public Hash(Integer n)
    {
        tabela = new ArvoreBusca[n];
    }

    public int hashing(String elemento) //HASHING BASEADO NA TABELA ASCII
    {
        if(elemento.startsWith("a"))
        {
            return 0;
        }
        if(elemento.startsWith("b"))
        {
            return 1;
        }
        if(elemento.startsWith("c"))
        {
            return 2;
        }
        if(elemento.startsWith("d"))
        {
            return 3;
        }
        if(elemento.startsWith("e"))
        {
            return 4;
        }
        if(elemento.startsWith("f"))
        {
            return 5;
        }
        if(elemento.startsWith("g"))
        {
            return 6;
        }
        if(elemento.startsWith("h"))
        {
            return 7;
        }
        if(elemento.startsWith("i"))
        {
            return 8;
        }
        if(elemento.startsWith("j"))
        {
            return 9;
        }
        if(elemento.startsWith("k"))
        {
            return 10;
        }
        if(elemento.startsWith("l"))
        {
            return 11;
        }
        if(elemento.startsWith("m"))
        {
            return 12;
        }
        if(elemento.startsWith("n"))
        {
            return 13;
        }
        if(elemento.startsWith("o"))
        {
            return 14;
        }
        if(elemento.startsWith("p"))
        {
            return 15;
        }
        if(elemento.startsWith("q"))
        {
            return 16;
        }
        if(elemento.startsWith("r"))
        {
            return 17;
        }
        if(elemento.startsWith("s"))
        {
            return 18;
        }
        if(elemento.startsWith("t"))
        {
            return 19;
        }
        if(elemento.startsWith("u"))
        {
            return 20;
        }
        if(elemento.startsWith("v"))
        {
            return 21;
        }
        if(elemento.startsWith("w"))
        {
            return 22;
        }
        if(elemento.startsWith("x"))
        {
            return 23;
        }
        if(elemento.startsWith("y"))
        {
            return 24;
        }
        else if(elemento.startsWith("z"))
        {
            return 25;
        }
        else
        {
            return 0;
        }

        //return  x % tabela.length;
    }



    public void adicionar(String elemento)
    {
        int indice = hashing(elemento);

        if(tabela[indice] == null)
        {
            tabela[indice] = new ArvoreBusca();
        }
        tabela[indice].adicionar(elemento);
    }

    public boolean contem(String elemento)
    {
        int indice = hashing(elemento);
        if(tabela[indice] == null)
        {
            return false;
        }
        else
        {
            return tabela[indice].pesquisar(elemento);
        }
    }

    public No contem2(String elemento)
    {
        int indice = hashing(elemento);
        if(tabela[indice] == null)
        {
            return null;
        }
        else
        {
            return tabela[indice].pesquisarNo(elemento);
        }
    }

    public int tamanho(){
        return tabela.length;
    }

    public void exibir()
    {

        for(int i = 0; i< tabela.length; i++)
        {
            if (tabela[i] != null)
            {
                tabela[i].exibirEmOrdem();

            }
        }
    }


}
