/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.write;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class arquivo {
    private static final String NOME_ARQUIVO = "historico.txt";
    
//    public static void salvarLinha(String texto){
//        try (FileWriter writer = new FileWriter(NOME_ARQUIVO, true)){
//            writer.write(texto + "\n");
//        }catch (IOException e){
//            JOptionPane.showMessageDialog(null,
//                    "Erro ao salvar no arquivo: " + e.getMessage(),
//                    "Erro de arquivo", JOptionPane.ERROR_MESSAGE);
//        }
    public static void salvarLinha(String texto){
        try(FileWriter writer = new FileWriter(NOME_ARQUIVO, true)){
            String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM//yyyy HH:mm:ss"));
                    writer.write("[" + dataHora + "]" + texto + "\n");
        }catch(IOException e){
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }
    public static String lerArquivo(){
        StringBuilder conteudo = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(NOME_ARQUIVO))){
            String linha;
            while((linha = br.readLine()) != null){
                conteudo.append(linha).append("\n");
            }
        } catch (IOException e){
        conteudo.append("Nenhum histórico encontrado. \n");
        }
        return conteudo.toString();
    }
}
