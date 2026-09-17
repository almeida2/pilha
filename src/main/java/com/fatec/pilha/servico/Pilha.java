package com.fatec.pilha.servico;

public class Pilha {
    private final int[] elementos;
    private int quantidade = 0;
    private int topo; // Indica o índice do elemento no topo (-1 indica pilha vazia)

    public Pilha() {
        elementos = new int[10];
        this.topo = -1; // Inicializa a pilha como vazia
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }

    public int tamanho() {
        return quantidade;
    }

    // public void empilhar(int elemento) {
    // elementos[quantidade] = elemento;
    // quantidade++;
    // }
    public void empilhar(int elemento) {
        if (estaCheia()) {
            throw new IllegalStateException("Erro: A pilha está cheia (overflow).");
        }
        elementos[++topo] = elemento;
    }

    public boolean estaCheia() {
        return topo == 9;
    }

}
