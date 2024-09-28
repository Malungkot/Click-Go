/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemamercado.Excecoes;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */
public class ErroLogin extends RuntimeException{
    public ErroLogin(){
    super("Email ou Senha invalido!");
    }
    }
