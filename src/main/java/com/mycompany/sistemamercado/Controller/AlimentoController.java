package com.mycompany.sistemamercado.Controller;

import com.google.gson.Gson;
import com.mycompany.sistemamercado.Excecoes.CampoVazio;
import com.mycompany.sistemamercado.Model.BancoDeDados;
import com.mycompany.sistemamercado.Model.Alimento;
import java.io.FileWriter;
import java.io.IOException;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class AlimentoController {

    public static void adiciona(Alimento alimento) throws IOException {
        Gson gson = new Gson();
        // Inicia os arquivos
        BancoDeDados conn = new BancoDeDados();

        try {
            BancoDeDados.leBDAlimento(BancoDeDados.getBancoAlimento());

            Alimento.adicionaAlimento(alimento);

            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoAlimento())) {
                String jsonAlimentos = gson.toJson(Alimento.getListaAlimento());
                writer.write(jsonAlimentos);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public static void edita(Alimento alimentoBanco, Alimento alimentoNovo) throws CampoVazio, IOException {
        try {
            BancoDeDados.leBDAlimento(BancoDeDados.getBancoAlimento());

            for (int i = 0; i < Alimento.getListaAlimento().size(); i++) {
                if (alimentoBanco.getNome().equals(Alimento.getListaAlimento().get(i).getNome())) {
                    Alimento.getListaAlimento().set(i, alimentoNovo);
                }
            }

            Gson gson = new Gson();
            try (FileWriter writer = new FileWriter(BancoDeDados.getBancoAlimento())) {
                String jsonAlimentos = gson.toJson(Alimento.getListaAlimento());
                writer.write(jsonAlimentos);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public static void deleta(Alimento alimentoParaRemover) throws IOException {
    try {
        Gson gson = new Gson();
        BancoDeDados.leBDAlimento(BancoDeDados.getBancoAlimento());
        
        if (Alimento.getListaAlimento().contains(alimentoParaRemover)) {
            Alimento.removeAlimento(alimentoParaRemover);
        } else {
            throw new IOException("Erro ao remover usuário bebida");
        }
        String arquivoAlimento = gson.toJson(Alimento.getListaAlimento());
        try (FileWriter writer = new FileWriter(BancoDeDados.getBancoAlimento())) {
            writer.write(arquivoAlimento);
            writer.flush();
        }
    } catch (IOException e) {
        throw new IOException("Erro ao remover alimento: " + e.getMessage());
    }
}

}
