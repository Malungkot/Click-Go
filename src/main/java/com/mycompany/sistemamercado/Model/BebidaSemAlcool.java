package com.mycompany.sistemamercado.Model;

import java.util.ArrayList;
import java.util.List;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class BebidaSemAlcool extends Bebida implements ComAlcool {

    private static List<BebidaSemAlcool> listaBebidasSemAlcool = new ArrayList<>();

    public BebidaSemAlcool(String nome, int quantidade, float valor, int quantidadeML) {
        super(nome, valor, quantidade, quantidadeML);
    }

    public static List<BebidaSemAlcool> getListaBebidasSemAlcool() {
        return listaBebidasSemAlcool;
    }

    public static void setListaBebidasSemAlcool(List<BebidaSemAlcool> listaBebidasSemAlcool) {
        BebidaSemAlcool.listaBebidasSemAlcool = listaBebidasSemAlcool;
    }

    @Override
    public String getTipo() {
        return "Bebida Não Alcoólica";
    }

    public boolean isAlcoolica() {
        return false;
    }

    @Override
    public boolean getAlcoolica() {
        return false;
    }
}


