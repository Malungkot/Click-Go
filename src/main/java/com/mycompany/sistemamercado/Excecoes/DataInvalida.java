
package com.mycompany.sistemamercado.Excecoes;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class DataInvalida extends RuntimeException {
    public DataInvalida(){
        super("a data escolhida é invalida!");
    }
}
