package ui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import dominio.ManipuladorArquivo;
import dominio.GeraHorario;

public class PrincipalArquivo {
    public static void main(String[] args) throws IOException {
        String path1 = "C:/Users/Vitor/IdeaProjects/SimulacaoJogosFutebol/src/Arquivos/MinasRio.txt";
        String path2 = "C:/Users/Vitor/IdeaProjects/SimulacaoJogosFutebol/src/Arquivos/SulSP.txt";
        String path3 = "C:/Users/Vitor/IdeaProjects/SimulacaoJogosFutebol/src/Arquivos/Jogos.txt";

        String[] minas = ManipuladorArquivo.lerArquivo(path1);
        String[] sul = ManipuladorArquivo.lerArquivo(path2);

        BufferedWriter writer = new BufferedWriter(new FileWriter(path3));
        for (int i = 0; i < minas.length; i++) {
            String confronto = minas[i] + " x " + sul[i];
            String horario = GeraHorario.gerarHorarioAleatorio();
            String linha = confronto + " " + horario;
            writer.write(linha + "\n");
        }
        writer.close();
    }
}
