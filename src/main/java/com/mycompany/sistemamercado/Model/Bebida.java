package com.mycompany.sistemamercado.Model;

import com.mycompany.sistemamercado.Excecoes.CampoVazio;
import com.mycompany.sistemamercado.Excecoes.ErroValorNumerico;
import java.util.Objects;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public abstract class Bebida implements ComValor, ComVolume {

    private String nome;
    private float valor;
    private int estoque;
    private int quantidadeML;

    // Construtor padrão
    public Bebida() {}

    public Bebida(String nome, float valor, int quantidade, int quantidadeML) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = quantidade;
        this.quantidadeML = quantidadeML;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getQuantidadeML() {
        return quantidadeML;
    }

    public void setQuantidadeML(int quantidadeML) {
        this.quantidadeML = quantidadeML;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // Método abstrato para retornar o tipo da bebida
    public abstract String getTipo();
    
    public static void validaCampoVazioAdiciona(String nome, int estoque, int qntML, float valor) {
        if (nome == null || nome.isEmpty()) {
            throw new CampoVazio();
        }
        if (estoque <= 0 || qntML <= 0 || valor < 0) {
            throw new ErroValorNumerico("Erro campo de estoque ou qntML ou valor é invalido");
        }
    }
    @Override
    public String toString() {
        return nome; // Retorna o nome da bebida
    }
}

