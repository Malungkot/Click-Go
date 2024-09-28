package com.mycompany.sistemamercado.Excecoes;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */
public class LoginInvalido extends RuntimeException {

    public LoginInvalido() {
        super("Email ou senha invalido!");
    }
}
