package com.mycompany.sistemamercado.Controller;

import com.google.gson.Gson;
import com.mycompany.sistemamercado.Excecoes.CampoVazio;
import com.mycompany.sistemamercado.Excecoes.CpfEmUso;
import com.mycompany.sistemamercado.Excecoes.EmailJaCadastrado;
import com.mycompany.sistemamercado.Excecoes.ErroLogin;
import com.mycompany.sistemamercado.Model.BancoDeDados;
import com.mycompany.sistemamercado.Model.Usuario;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */
public class UsuarioController {

    public static boolean loginCliente(String email, String senha) throws IOException, CampoVazio, ErroLogin {
        Usuario.validaCamposLogin(email, senha);
        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.leBDUser(BancoDeDados.getBancoUsuario());

        for (Usuario user : Usuario.getListaUsuarios()) {
            if (email.equals(user.getEmail().getEmail()) && senha.equals(user.getSenha())) {
                Usuario.setUsuarioLogado(user);
                return true;
            }
        }
        throw new ErroLogin();
    }

    public static void CadastroUsuario(Usuario usuario) throws IOException, CpfEmUso {
        Gson gson = new Gson();
        BancoDeDados conn = new BancoDeDados();

        try {
            conn.leBDUser(BancoDeDados.getBancoUsuario());

            List<Usuario> listaUsuarios = Usuario.getListaUsuarios();

            for (Usuario usuarioBanco : listaUsuarios) {
                if (usuario.getEmail().getEmail().equals(usuarioBanco.getEmail().getEmail())) {
                    throw new EmailJaCadastrado();
                }
            }

            for (Usuario usuarioBanco : listaUsuarios) {
                if (usuario.getCpf().getCpf().equals(usuarioBanco.getCpf().getCpf())) {
                    throw new CpfEmUso();
                }
            }

            listaUsuarios.add(usuario);
            try (FileWriter writer = new FileWriter(conn.getBancoUsuario())) {
                String jsonUsuario = gson.toJson(listaUsuarios);
                writer.write(jsonUsuario);
                writer.flush();
            }

        } catch (IOException e) {
            throw new IOException("Erro ao acessar o arquivo do banco de dados: " + e.getMessage(), e);
        } catch (CpfEmUso e) {
            throw new CpfEmUso();
        }
    }

    public static void removeADM(Usuario usuarioParaRemover) throws IOException {
    try {
        if (Usuario.getListaUsuarios().contains(usuarioParaRemover)) {
            Usuario.getListaUsuarios().remove(usuarioParaRemover);
        } else {
            throw new IOException("Erro ao remover usuario, usuario não encontrado");
        }

        Gson gson = new Gson();
        String arquivoAtualizado = gson.toJson(Usuario.getListaUsuarios());
        try (FileWriter writer = new FileWriter(BancoDeDados.getBancoUsuario())) {
            writer.write(arquivoAtualizado);
            writer.flush();
        }
    } catch (IOException e) {
        throw new IOException("Erro ao remover usuário: " + e.getMessage());
    }
}


}
