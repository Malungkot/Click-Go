package com.mycompany.sistemamercado.Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.mycompany.sistemamercado.Model.Alimento;
import com.mycompany.sistemamercado.Model.BebidaComAlcool;
import com.mycompany.sistemamercado.Model.BebidaSemAlcool;
import com.mycompany.sistemamercado.Model.Usuario;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class BancoDeDados {

    private static String pastaBanco = "Banco_De_Dados";
    private static File bancoUsuario;
    private static File bancoBebidaComAlcool;
    private static File bancoBebidaSemAlcool;
    private static File bancoAlimento;
    /**
     *
     * @param bancoAlimentos
     */
    // Construtor para inicializar o arquivo de banco de dados
    public BancoDeDados() {
        this.bancoUsuario = new File(this.pastaBanco + File.separator + "BancoDeDadosUsuario.json");
        this.bancoBebidaComAlcool = new File(this.pastaBanco + File.separator + "BancoDeDadosBebidaComAlcool.json");
        this.bancoBebidaSemAlcool = new File(this.pastaBanco + File.separator + "BancoDeDadosBebidaSemAlcool.json");
        this.bancoAlimento = new File(this.pastaBanco + File.separator + "BancoDeDadosAlimento.json");

        File diretorio = new File(this.pastaBanco);
        if (!diretorio.exists()) {
            diretorio.mkdirs(); // Cria o diretório se não existir
        }
        try {
            // Cria os arquivos se não existirem
            if (!this.bancoUsuario.exists()) {
                this.bancoUsuario.createNewFile();
            }
            if (!this.bancoBebidaComAlcool.exists()) {  // Adicionando a criação do banco de bebidas
                this.bancoBebidaComAlcool.createNewFile();
            }if (!this.bancoBebidaSemAlcool.exists()) {  // Adicionando a criação do banco de bebidas
                this.bancoBebidaSemAlcool.createNewFile();
            }
            if (!this.bancoAlimento.exists()) {  // Adicionando a criação do banco de comidas
                this.bancoAlimento.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para ler o banco de dados de usuários
    public void leBDUser(File bancoUsuario) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Verifica se o arquivo existe e se tem conteúdo
        if (bancoUsuario.length() == 0) {
            JOptionPane.showMessageDialog(null, "O arquivo de banco de dados está vazio.");
            return;
        }

        try (BufferedReader arquivoJson = new BufferedReader(new FileReader(bancoUsuario))) {
            Type type = new TypeToken<List<Usuario>>() {
            }.getType();
            List<Usuario> listaUsuarios = gson.fromJson(arquivoJson, type);

            // Inicializa listas para evitar NullPointerException
            Usuario.setListaAdmin(new ArrayList<>());
            Usuario.setListaCliente(new ArrayList<>());

            if (listaUsuarios != null) {
                for (Usuario usuario : listaUsuarios) {
                    if ("admin".equals(usuario.getUser()) || "adminC".equals(usuario.getUser())) {
                        Usuario.getListaAdmin().add(usuario); // Adiciona administradores
                    } else {
                        Usuario.getListaCliente().add(usuario); // Adiciona clientes
                    }
                }
                // Adiciona todos os usuários à lista de usuários
                Usuario.setListaUsuarios(listaUsuarios);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao transformar os valores em objeto: " + e.getMessage());
        }
    }
  

     public static void leBDBebidaComAlcool(File bancoDeDados) throws IOException {
    Gson gson = new Gson();
    BufferedReader arquivoJson = new BufferedReader(new FileReader(bancoDeDados));
    
    if (arquivoJson.ready()) {
        try {
            Type type = new TypeToken<List<BebidaComAlcool>>() {}.getType();
            BebidaComAlcool.setListaBebidasComAlcool(gson.fromJson(arquivoJson, type));
        } catch (Exception e) {
            throw new IOException("Erro ao ler o banco de dados de bebidas com álcool: " + e.getMessage());
        } finally {
            arquivoJson.close();
        }
    }
}
     public static void leBDBebidaSemAlcool(File bancoDeDados) throws IOException {
    Gson gson = new Gson();
    BufferedReader arquivoJson = new BufferedReader(new FileReader(bancoDeDados));
    
    if (arquivoJson.ready()) {
        try {
            Type type = new TypeToken<List<BebidaSemAlcool>>() {}.getType();
            BebidaSemAlcool.setListaBebidasSemAlcool(gson.fromJson(arquivoJson, type));
        } catch (Exception e) {
            throw new IOException("Erro ao ler o banco de dados de bebidas sem álcool: " + e.getMessage());
        } finally {
            arquivoJson.close();
        }
    }
}



    public static void leBDAlimento(File bancoDeDados) throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    try (BufferedReader arquivoJson = new BufferedReader(new FileReader(bancoDeDados))) {
        if (arquivoJson.ready()) {
            Type type = new TypeToken<List<Alimento>>() {}.getType();
            List<Alimento> alimentos = gson.fromJson(arquivoJson, type);
            Alimento.setListaAlimentos(alimentos); // Armazenando a lista de alimentos

            // Mostrando o JSON formatado no console
            String jsonFormatted = gson.toJson(alimentos);
        }
    } catch (Exception e) {
        throw new IOException("Erro ao ler o banco de dados de alimentos: " + e.getMessage(), e);
    }
}

    // Getter para o caminho da pasta do banco
    public static String getPastaBanco() {
        return pastaBanco;
    }

    public static File getBancoUsuario() {
        return bancoUsuario;
    }

    public static File getBancoBebidaComAlcool() {
        return bancoBebidaComAlcool;
    }

    public static File getBancoBebidaSemAlcool() {
        return bancoBebidaSemAlcool;
    }

    public static File getBancoAlimento() {
        return bancoAlimento;
    }
}
