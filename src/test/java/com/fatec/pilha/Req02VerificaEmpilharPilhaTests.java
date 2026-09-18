package com.fatec.pilha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.fatec.pilha.servico.Pilha;

public class Req02VerificaEmpilharPilhaTests {
    @Test
    void ct01_empilharUmElemento() {
        // dado que a pilha foi inicializada
        Pilha pilha = new Pilha();
        // quando empilho um elemento
        pilha.empilhar(5);
        // entao a pilha nao deve estar vazia e o tamanho deve ser 1
        assertFalse(pilha.estaVazia(), "A pilha não deve estar vazia após o push");
        assertEquals(1, pilha.tamanho(), "O tamanho deve ser 1 após empilhar um elemento");
    }

    @Test
    void ct02_empilharUmElemento_com_pilha_cheia() {
        // dado que a pilha esta cheia
        Pilha pilha = new Pilha();
        for (int i = 0; i < 10; i++) {
            pilha.empilhar(i);
        }
        // quando o usuario tenta empilhar um elemento
        try {
            pilha.empilhar(25);
            fail("Deve lançar IllegalStateException");
        } catch (IllegalStateException e) {
            // entao deve lancar um exception
            assertEquals("Erro: A pilha está cheia (overflow).", e.getMessage());
        }
    }

    @Test
    void ct02b_empilharUmElemento_com_pilha_cheia() {
        // dado que a pilha esta cheia
        Pilha pilha = new Pilha();
        for (int i = 0; i < 10; i++) {
            pilha.empilhar(i);
        }
        // quando o usuario tenta empilhar um elemento
        // entao deve lancar um exception
        assertThrows(IllegalStateException.class, () -> pilha.empilhar(25), "Erro: A pilha está cheia (overflow).");

    }

}
