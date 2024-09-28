package com.mycompany.sistemamercado.Model;

import com.mycompany.sistemamercado.Excecoes.CampoVazio;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class Usuario {

    private String nome, senha, dataNascimento, user;
    private CPF cpf;
    private Email email;
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static Usuario UsuarioLogado;
    private static List<Usuario> listaAdmin = new ArrayList<>();
    private static List<Usuario> listaCliente = new ArrayList<>();

    // Construtor principal
    public Usuario(Email email, String nome, String senha, String dataNascimento, String user, CPF cpf) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.user = user;
        this.cpf = cpf;
    }


    // Getters e Setters

    public static List<Usuario> getListaCliente() {
        return listaCliente;
    }

    public static void setListaCliente(List<Usuario> listaCliente) {
        Usuario.listaCliente = listaCliente;
    }

    public static List<Usuario> getListaUsuarios() {
    if (listaUsuarios == null) {
        listaUsuarios = new ArrayList<>();
    }
    return listaUsuarios;
}


    public static void setListaUsuarios(List<Usuario> usuarios) {
        listaUsuarios = usuarios;
    }

    public static List<Usuario> getListaAdmin() {
        return listaAdmin;
    }

    public static void setListaAdmin(List<Usuario> admins) {
        listaAdmin = admins;
    }

    public Email getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getUser() {
        return user;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public static Usuario getUsuarioLogado() {
        return UsuarioLogado;
    }

    public static void setUsuarioLogado(Usuario usuarioLogado) {
        Usuario.UsuarioLogado = usuarioLogado;
    }

    public String toString() {
        return this.nome;
    }

    public static void validaCamposLogin(String email, String senha) throws CampoVazio {
        if (email == null || email.isEmpty() || senha == null || senha.isEmpty()) {
            throw new CampoVazio();
        }
    }

    public static void validaCadastroVazio(String nome, String senha) throws CampoVazio {
        if (nome == null || nome.isEmpty() || senha == null || senha.isEmpty()) {
            throw new CampoVazio();
        }
    }
    @Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Usuario usuario = (Usuario) obj;
    return this.cpf.equals(usuario.cpf);
}

@Override
public int hashCode() {
    return Objects.hash(cpf);
}

}
