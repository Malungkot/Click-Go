package com.mycompany.sistemamercado.Excecoes;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */
public class CpfInvalido extends RuntimeException{
    public CpfInvalido(){
        super("o CPF é invalido!");
    }
}
