package com.mycompany.sistemamercado.Controller;

import com.google.gson.Gson;
import com.mycompany.sistemamercado.Model.BancoDeDados;
import com.mycompany.sistemamercado.Model.BebidaComAlcool;
import com.mycompany.sistemamercado.Model.BebidaSemAlcool;

import java.io.FileWriter;
import java.io.IOException;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class BebidaController {

   public static void adicionaBebidaSemAlcool(BebidaSemAlcool bebida) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDBebidaSemAlcool(BancoDeDados.getBancoBebidaSemAlcool());
            BebidaSemAlcool.getListaBebidasSemAlcool().add(bebida);
            
            String arquivoBebida = gson.toJson(BebidaSemAlcool.getListaBebidasSemAlcool());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoBebidaSemAlcool());
            writer.write(arquivoBebida);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            throw new IOException("Erro ao adicionar bebida sem álcool", e);
        }
    }
    
    public static void editaBebidaSemAlcool(BebidaSemAlcool bebidaBanco, BebidaSemAlcool bebidaEdita) throws IOException {
    try {
        Gson gson = new Gson();
        BancoDeDados.leBDBebidaSemAlcool(BancoDeDados.getBancoBebidaSemAlcool());

        // pega o índice na lista da bebida que está no banco
        for (int i = 0; i <  BebidaSemAlcool.getListaBebidasSemAlcool().size(); i++) {
                if (bebidaBanco.getNome().equals(BebidaSemAlcool.getListaBebidasSemAlcool().get(i).getNome())) {
                    BebidaSemAlcool.getListaBebidasSemAlcool().set(i, bebidaEdita);
                    break;
                }
            }
         // transforma a lista em json
            String arquivoBebida = gson.toJson(BebidaSemAlcool.getListaBebidasSemAlcool());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoBebidaSemAlcool());
            // escreve no arquivo a nova lista editada
            writer.write(arquivoBebida);
            writer.flush();
            writer.close();
    } catch (IOException e) {
        throw new IOException("Erro ao editar bebida sem álcool", e);
    }
}
    
    public static void deletaBebidaSemAlcool(BebidaSemAlcool bebida) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDBebidaSemAlcool(BancoDeDados.getBancoBebidaSemAlcool());
            BebidaSemAlcool.getListaBebidasSemAlcool().remove(bebida);
            
            String arquivoBebida = gson.toJson(BebidaSemAlcool.getListaBebidasSemAlcool());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoBebidaSemAlcool());
            writer.write(arquivoBebida);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            throw new IOException("Erro ao deletar bebida sem álcool", e);
        }
    }
    
    public static void adicionaBebidaComAlcool(BebidaComAlcool bebida) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDBebidaComAlcool(BancoDeDados.getBancoBebidaComAlcool());
            BebidaComAlcool.getListaBebidasComAlcool().add(bebida);
            
            String arquivoBebida = gson.toJson(BebidaComAlcool.getListaBebidasComAlcool());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoBebidaComAlcool());
            writer.write(arquivoBebida);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new IOException("Erro ao adicionar bebida com álcool", e);
        }
    }
    
    public static void editaBebidaComAlcool(BebidaComAlcool bebidaBanco, BebidaComAlcool bebidaEdita) throws IOException {
    try {
        Gson gson = new Gson();
        BancoDeDados.leBDBebidaComAlcool(BancoDeDados.getBancoBebidaComAlcool());

        // Itera pela lista para encontrar a bebida a ser editada
        for (int i = 0; i < BebidaComAlcool.getListaBebidasComAlcool().size(); i++) {
            if (bebidaBanco.getNome().equals(BebidaComAlcool.getListaBebidasComAlcool().get(i).getNome())) {
                // Substitui a bebida encontrada pela bebida editada
                BebidaComAlcool.getListaBebidasComAlcool().set(i, bebidaEdita);
                break; // Sai do loop após encontrar e editar
            }
        }

        // Transforma a lista em JSON
        String arquivoBebida = gson.toJson(BebidaComAlcool.getListaBebidasComAlcool());
        try (FileWriter writer = new FileWriter(BancoDeDados.getBancoBebidaComAlcool())) {
            // Escreve no arquivo a nova lista editada
            writer.write(arquivoBebida);
            writer.flush();
        }
    } catch (IOException e) {
        throw new IOException("Erro ao editar bebida com álcool", e);
    }
}
    
    public static void deletaBebidaComAlcool(BebidaComAlcool bebida) throws IOException {
        try {
            Gson gson = new Gson();
            BancoDeDados.leBDBebidaComAlcool(BancoDeDados.getBancoBebidaComAlcool());
            BebidaComAlcool.getListaBebidasComAlcool().remove(bebida);
            String arquivoBebida = gson.toJson(BebidaComAlcool.getListaBebidasComAlcool());
            FileWriter writer = new FileWriter(BancoDeDados.getBancoBebidaComAlcool());
            writer.write(arquivoBebida);
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            throw new IOException("Erro ao deletar bebida com álcool", e);
        }
    } 
}
