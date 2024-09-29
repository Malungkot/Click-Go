package com.mycompany.sistemamercado.Model;

import java.util.ArrayList;
import java.util.List;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class BebidaComAlcool extends Bebida implements ComAlcool {

    private static List<BebidaComAlcool> listaBebidasComAlcool = new ArrayList<>();

    public BebidaComAlcool(String nome, int quantidade, float valor, int quantidadeML) {
        super(nome, valor, quantidade, quantidadeML);
    }

    public static List<BebidaComAlcool> getListaBebidasComAlcool() {
        return listaBebidasComAlcool;
    }

    public static void setListaBebidasComAlcool(List<BebidaComAlcool> listaBebidasComAlcool) {
        BebidaComAlcool.listaBebidasComAlcool = listaBebidasComAlcool;
    }

    
    @Override
    public String getTipo() {
        return "Bebida Alcoólica";
    }

    public boolean isAlcoolica() {
        return true;
    }

    @Override
    public boolean getAlcoolica() {
       return true;
    }
}

