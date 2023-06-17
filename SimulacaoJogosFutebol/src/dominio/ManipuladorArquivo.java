package dominio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class ManipuladorArquivo {
    public static String[] lerArquivo(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        List<String> linhas = new ArrayList<>();
        String linha = buffRead.readLine();
        while(linha != null){
            System.out.println(linha);
            linhas.add(linha);
            linha = buffRead.readLine();
        }
        buffRead.close();
        return linhas.toArray(new String[0]);
    }

    public static void escreverArquivo(String path, String conteudo) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        buffWrite.write(conteudo);
        buffWrite.close();
    }
}
