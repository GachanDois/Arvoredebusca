import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static PrintWriter print;

    static {
        try {
            print = new PrintWriter("src/saida3.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        Hash hashmap = new Hash(26);

        try {
            FileReader arq = new FileReader("src/palavras-chave3.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha

            while (linha != null) {

                hashmap.adicionar(linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha

            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        int nLinha = 1;
        try {
            FileReader arqTexto = new FileReader("src/texto3.txt");
            BufferedReader lerArqTexto = new BufferedReader(arqTexto);
            String linhaTexto = lerArqTexto.readLine(); // lê a primeira linha


            while (linhaTexto != null)
            {
                String textoEdit;
                textoEdit = linhaTexto.replaceAll("[^ \n" +"A-Za-z0-9À-ÖØ-öø-ÿ/-]", " ");
                String[] palavrasTexto = textoEdit.split(" ");
                System.out.println(textoEdit);

                for (int i = 0; i < palavrasTexto.length; i++) //Percorre palavra por palavra
                {
                    if (hashmap.contem(palavrasTexto[i])) {
                        String num = "" + nLinha;
                        if(hashmap.contem(num)) {

                        }else{
                            hashmap.contem2(palavrasTexto[i]).linhas.add(num);
                        }
                    }
                }
                linhaTexto = lerArqTexto.readLine(); // lê da segunda até a última linha
                nLinha++;
            }

            hashmap.exibir();

        }catch (IOException e1) {
                System.out.println("Error during reading/writing");
            }

        print.close();
    }
}