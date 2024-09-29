package com.mycompany.sistemamercado.Model;

import com.mycompany.sistemamercado.Excecoes.CampoVazio;
import com.mycompany.sistemamercado.Excecoes.ErroValorNumerico;
import java.util.ArrayList;
import java.util.List;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class Alimento implements ComValor, ComPeso {

    private static List<Alimento> listaAlimentos = new ArrayList<>();

    private String nome;
    private int estoque;
    private float valor;
    private int peso;

    public Alimento(String nome, int estoque, float valor, int peso) {
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
        this.peso = peso;
    }

    public Alimento() {
        // Construtor vazio
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public static void setListaAlimentos(List<Alimento> listaAlimentos) {
        Alimento.listaAlimentos = listaAlimentos;
    }

    public static List<Alimento> getListaAlimento() {
        return listaAlimentos;
    }

    public static void adicionaAlimento(Alimento alimento) {
        listaAlimentos.add(alimento);
    }

    public static void removeAlimento(Alimento alimento) {
        listaAlimentos.remove(alimento);
    }

    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alimento)) {
            return false;
        }
        Alimento outroAlimento = (Alimento) obj;
        return nome.equals(outroAlimento.nome) &&
               estoque == outroAlimento.estoque &&
               Float.compare(outroAlimento.valor, valor) == 0 &&
               peso == outroAlimento.peso;
    }

    public static void validaCampoVazioAdiciona(String nome, int estoque, float valor, float peso) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new CampoVazio();
        }
        if (estoque <= 0) {
            throw new ErroValorNumerico("O estoque deve ser maior que zero.");
        }
        if (valor <= 0) {
            throw new ErroValorNumerico("O valor deve ser maior que zero.");
        }
        if (peso <= 0) {
            throw new ErroValorNumerico("O peso deve ser maior que zero.");
        }
    }
}


