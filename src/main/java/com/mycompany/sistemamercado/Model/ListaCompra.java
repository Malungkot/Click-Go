package com.mycompany.sistemamercado.Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public class ListaCompra<T extends ComValor> {

    private static List<ComValor> listaCompra = new ArrayList<>();

    public static void adicionarPedido(ComValor compra) {
        listaCompra.add(compra);
    }

    public static void removerPedido(ComValor compra) {
        listaCompra.remove(compra);
        JOptionPane.showMessageDialog(null, "Item removido da lista de compras.");
    }

    public static float calcularValorTotal() {
        float total = 0;
        for (ComValor pedido : listaCompra) {
            total += pedido.getValor();
        }
        return total;
    }

    public static List<ComValor> getListaCompra() {
        return listaCompra;
    }

    public static void clear() {
        listaCompra.clear();
    }
}
