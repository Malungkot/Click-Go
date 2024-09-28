package com.mycompany.sistemamercado.Model;

import com.mycompany.sistemamercado.Excecoes.CampoVazio;
import com.mycompany.sistemamercado.Excecoes.ErroValorNumerico;
import java.util.Objects;

/*
 * @aluno: augusto Benedito Carvalho da Silva
 * @matricula: 202265552C
 */

public abstract class Bebida implements ComValor {
    
    private String nome;
    private float valor;
    private int estoque;
    private int quantidadeML;
    private boolean Alcoolica;

    // Construtor padrão
    public Bebida() {}

    public Bebida(String nome, float valor, int quantidade, int quantidadeML, boolean Alcoolica) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = quantidade;
        this.quantidadeML = quantidadeML;
        this.Alcoolica = Alcoolica;
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

    public boolean isAlcoolica() {
        return Alcoolica;
    }

    public void setAlcoolica(boolean Alcoolica) {
        this.Alcoolica = Alcoolica;
    }
   
    // Método abstrato para retornar o tipo da bebida
    public abstract String getTipo();

    // Validação de campos vazio
    public static void validaCampoVazioAdiciona(String nome, int estoque, int qntML, float valor) {
        if (nome.isEmpty()) {
            throw new CampoVazio();
        }
        if (estoque < 0) {
            throw new ErroValorNumerico("Quantidade pode ser negativo.");
        }
        if (qntML <= 0) {
            throw new ErroValorNumerico("Valor pode ser negativo ou zero.");
        }
        if (valor < 0) {
            throw new ErroValorNumerico("Valor pode ser negativo.");
        }
    }


    @Override
    public String toString() {
        return nome; // ou o nome do atributo que armazena o nome da bebida
    }
    
 @Override

public boolean equals(Object obj) {
    // Verifica se o objeto comparado é o mesmo
    if (this == obj) {
        return true;
    }
    // Verifica se o objeto é nulo ou não é uma instância de Bebida
    if (obj == null || !(obj instanceof Bebida)) {
        return false;
    }
    // Faz o cast para a classe Bebida
    Bebida bebida = (Bebida) obj;  
    // Compara os atributos relevantes
    return this.nome.equals(bebida.getNome()) &&
           this.estoque == bebida.getEstoque() &&
           Float.compare(this.valor, bebida.getValor()) == 0 && // Comparação segura para float
           this.quantidadeML == bebida.getQuantidadeML() &&
           this.isAlcoolica() == bebida.isAlcoolica();  // Adiciona verificação se é alcoólica
}


@Override
public int hashCode() {
    return Objects.hash(nome, estoque, valor, quantidadeML);
}

}
